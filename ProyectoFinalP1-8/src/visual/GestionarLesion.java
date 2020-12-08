package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logic.Administracion;
import logic.Equipo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.Color;

public class GestionarLesion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static JTable table;
	public static DefaultTableModel model;
	public static Object[] fila;
	private int index = 0;
	private static JComboBox cbxEquipos;
	private ArrayList<String> NombresEquipos = new ArrayList<String>();
	private JButton btnRecuperacion;
	private JButton btnRegistrarLesion;
	private JButton btnHistorialDeLesiones;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public GestionarLesion() {
		setTitle("Gestion de lesiones");
		setResizable(false);
		setBounds(100, 100, 823, 408);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(Color.GRAY);
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Seleccione Equipo:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel.setBounds(10, 22, 148, 14);
			panel.add(lblNewLabel);
			
			
			for (Equipo aux : Administracion.getInstancia().getMisEquipos()) {
				NombresEquipos.add(aux.getNombre());
			}
			
			cbxEquipos = new JComboBox(NombresEquipos.toArray());
			cbxEquipos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					loadtable();
				}
			});
			cbxEquipos.setBounds(127, 16, 127, 25);
			panel.add(cbxEquipos);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 67, 777, 245);
			panel.add(scrollPane);
			
			
			String[] header = {"Nombre", "Posición", "Disponibilida", "Tipo de lesion", "Dias de reposo"};
			model = new DefaultTableModel();
			model.setColumnIdentifiers(header);
			table = new JTable();
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(table.getSelectedRow()>= 0) {
						index = table.getSelectedRow();
						btnHistorialDeLesiones.setEnabled(true);
						btnRecuperacion.setEnabled(true);
						btnRegistrarLesion.setEnabled(true);
					}

				}
			});
			table.setModel(model);
			scrollPane.setViewportView(table);
			loadtable();
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			btnHistorialDeLesiones = new JButton("Historial de Lesiones");
			btnHistorialDeLesiones.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnHistorialDeLesiones.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(index).getMisLesiones().isEmpty()) {
						JOptionPane.showMessageDialog(null, "El jugador nunca ha sufrido una lesión.");
					}
					else {
						ListaLesiones HL = new ListaLesiones(index, cbxEquipos.getSelectedIndex());
						HL.setModal(true);
						HL.setVisible(true);
					}
				}
			});
			btnHistorialDeLesiones.setEnabled(false);
			buttonPane.add(btnHistorialDeLesiones);
			
			btnRecuperacion = new JButton("Recuperacion");
			btnRecuperacion.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnRecuperacion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(index).isEstado() == false) {
						int check = JOptionPane.showConfirmDialog(null, "¿El jugador se recuperó?", "Aviso", JOptionPane.WARNING_MESSAGE);
						if(check == JOptionPane.OK_OPTION) {
							Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(index).setMiLesion(null);
							Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(index).setEstado(true);
							Administracion.getInstancia().Guardar(Administracion.getInstancia());
							
							loadtable();
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "El jugador esta en plena forma.");
					}
				}
			});
			btnRecuperacion.setEnabled(false);
			buttonPane.add(btnRecuperacion);
			{
				btnRegistrarLesion = new JButton("Registrar Lesion");
				btnRegistrarLesion.setFont(new Font("Tahoma", Font.PLAIN, 11));
				btnRegistrarLesion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(index).isEstado() == false) {
							JOptionPane.showMessageDialog(null, "El jugador ya se encuentra lesionado.","Información",JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							RegLesion rl = new RegLesion(index, cbxEquipos.getSelectedIndex());
							rl.setModal(true);
							rl.setVisible(true);
							loadtable();
						}
					}
				});
				btnRegistrarLesion.setEnabled(false);
				btnRegistrarLesion.setActionCommand("OK");
				buttonPane.add(btnRegistrarLesion);
				getRootPane().setDefaultButton(btnRegistrarLesion);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 11));
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}


	private void loadtable() {
		// TODO Auto-generated method stub
		model.setRowCount(0);
		
		fila = new Object[model.getColumnCount()];
			for (int i = 0; i < Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().size(); i++) {
				fila[0] = Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).getNombre();
				fila[1] = Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).getPosicion();
				if(Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).isEstado() == true) {
					fila[2] = "Saludable";
				}
				else{
					fila[2] = "Con Lesion";
				}
				if(Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).getMiLesion() == null) {
					fila[3] = "Ninguna";
				}
				else {
					fila[3] = Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).getMiLesion().getTipoLesion();

				}
				if(Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).getMiLesion() == null ) {
					fila[4] = "Disponible";
				}
				else {
					fila[4] = Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).getMiLesion().getDiasRec();

				}
				
				Renderer edit = new Renderer();
				table.setDefaultRenderer(Object.class, edit);
				model.addRow(fila);
		}
		
	}
}
