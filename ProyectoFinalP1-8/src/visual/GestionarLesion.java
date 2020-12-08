package visual;
import logico.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.sun.glass.events.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class GestionarLesion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static JTable table;
	public static DefaultTableModel model;
	public static Object[] fila;
	private int index = 0;
	private static JComboBox cBoxEquipo;
	private ArrayList<String> NombresEquipos = new ArrayList<String>();
	private JButton btnRecuperar;
	private JButton btnRegistrar;
	private JButton btnLista;


	
	
	
	public GestionarLesion() {
		setTitle("Gestion de lesiones");
		setBounds(100, 100, 501, 434);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 485, 350);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Equipo a seleccionar :");
		lblNewLabel.setBounds(23, 25, 104, 14);
		panel.add(lblNewLabel);
		

		for (Equipo aux : AdmTorneo.getInstancia().getMisEquipos()) {
			NombresEquipos.add(aux.getNombre());
		}
		
		cBoxEquipo = new JComboBox(NombresEquipos.toArray());
		cBoxEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarTabla();
			}
		});
		cBoxEquipo.setBounds(137, 22, 83, 20);
		panel.add(cBoxEquipo);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(AdmTorneo.getInstancia().getMisEquipos().get(cBoxEquipo.getSelectedIndex()).getMisJugadores().get(index).isDisponible() == false) {
					JOptionPane.showMessageDialog(null, "El jugador ya se encuentra lesionado.","Información",JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					RegistrarLesion rl = new RegistrarLesion(index, cBoxEquipo.getSelectedIndex());
					rl.setModal(true);
					rl.setVisible(true);
					cargarTabla();
				}

			
			
			
			
			}
		});
		btnRegistrar.setBounds(263, 21, 89, 23);
		panel.add(btnRegistrar);
		
		JButton btnRecuperar = new JButton("Recuperar");
		btnRecuperar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(AdmTorneo.getInstancia().getMisEquipos().get(cBoxEquipo.getSelectedIndex()).getMisJugadores().get(index).isEstado() == false) {
					int check = JOptionPane.showConfirmDialog(null, "Se encuentra recuperado y en plena forma", "Confirmacion", JOptionPane.WARNING_MESSAGE);
					if(check == JOptionPane.OK_OPTION) {
						AdmTorneo.getInstancia().getMisEquipos().get(cBoxEquipo.getSelectedIndex()).getMisJugadores().get(index).setMiLesion(null);
						AdmTorneo.getInstancia().getMisEquipos().get(cBoxEquipo.getSelectedIndex()).getMisJugadores().get(index).setDisponible(true);
						AdmTorneo.getInstancia().GuardarInfo(AdmTorneo.getInstancia());
						
						cargarTabla();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "El jugador esta en plena forma.");
				}

			
			
			
			
			
			
			
			}
		});
		btnRecuperar.setBounds(367, 21, 89, 23);
		panel.add(btnRecuperar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(423, 284, -346, -132);
		panel.add(scrollPane);
		
		

		
		String[] header = {"Nombre", "Posición", "Estado", "Tipo de lesion", "Dias de Descanso"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(header);
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(table.getSelectedRow()>= 0) {
					index = table.getSelectedRow();
					btnLista.setEnabled(true);
					btnRecuperar.setEnabled(true);
					btnRegistrar.setEnabled(true);
				}

			}
		});
		table.setModel(model);
		scrollPane.setViewportView(table);
		cargarTabla();

		
		
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBounds(0, 351, 485, 44);
		contentPanel.add(panelBotones);
		panelBotones.setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnCancelar.setBounds(374, 11, 89, 23);
		panelBotones.add(btnCancelar);
		
		JButton btnLista = new JButton("Listar");
		btnLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if(AdmTorneo.getInstancia().getMisEquipos().get(cBoxEquipo.getSelectedIndex()).getMisJugadores().get(index).getLesiones().isEmpty()) {
					JOptionPane.showMessageDialog(null, "El jugador nunca ha sufrido una lesión.");
				}
				else {
					ListaLesiones LL = new ListaLesiones(index, cBoxEquipo.getSelectedIndex());
					LL.setModal(true);
					LL.setVisible(true);
					;
				}

			
			}
		});
		btnLista.setBounds(275, 11, 89, 23);
		btnLista.setEnabled(false);
		panelBotones.add(btnLista);
		
		
		
		
		
	}
	
	
	
	
	private void cargarTabla () {
		// TODO Auto-generated method stub
		model.setRowCount(0);
		
		fila = new Object[model.getColumnCount()];
			for (int i = 0; i < AdmTorneo.getInstancia().getMisEquipos().get(cBoxEquipo.getSelectedIndex()).getMisJugadores().size(); i++) {
				fila[0] = AdmTorneo.getInstancia().getMisEquipos().get(cBoxEquipo.getSelectedIndex()).getMisJugadores().get(i).getNombre();
				fila[1] = AdmTorneo.getInstancia().getMisEquipos().get(cBoxEquipo.getSelectedIndex()).getMisJugadores().get(i).getPosicion();
				if(AdmTorneo.getInstancia().getMisEquipos().get(cBoxEquipo.getSelectedIndex()).getMisJugadores().get(i).isDisponible() == true) {
					fila[2] = "En Forma";
				}
				else{
					fila[2] = "Lesionado";
				}
				if(AdmTorneo.getInstancia().getMisEquipos().get(cBoxEquipo.getSelectedIndex()).getMisJugadores().get(i).getMiLesion() == null) {
					fila[3] = "Ninguna";
				}
				else {
					fila[3] = AdmTorneo.getInstancia().getMisEquipos().get(cBoxEquipo.getSelectedIndex()).getMisJugadores().get(i).getMiLesion().getTipo();

				}
				if(AdmTorneo.getInstancia().getMisEquipos().get(cBoxEquipo.getSelectedIndex()).getMisJugadores().get(i).getMiLesion() == null ) {
					fila[4] = "Activo";
				}
				else {
					fila[4] = AdmTorneo.getInstancia().getMisEquipos().get(cBoxEquipo.getSelectedIndex()).getMisJugadores().get(i).getMiLesion().getDiasDescanso();

				}
				

				model.addRow(fila);
		}

}
}
