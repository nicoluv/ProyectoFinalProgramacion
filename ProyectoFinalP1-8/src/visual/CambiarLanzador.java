package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logico.AdmTorneo;
import logico.Jugador;
import logico.Lanzador;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CambiarLanzador extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	public static DefaultTableModel model;
	public static Object[] fila;
	private JButton okButton;
	private static int index = 0;
	private static int MiEquipo;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the dialog.
	 */
	public CambiarLanzador(int Eq) {
		MiEquipo = Eq;
		setTitle("Cambio de Lanzador");
		setBounds(100, 100, 565, 386);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Lanzadores del Equipo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(12, 25, 517, 248);
				panel.add(scrollPane);
				
				
				String[] header = {"Nombre", "Numero", "Carreras", "Hits", "Jonrones", "PromCL", "Estado"};
				model = new DefaultTableModel();
				model.setColumnIdentifiers(header);
				table = new JTable();
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(table.getSelectedRow()>= 0) {
							okButton.setEnabled(true);
							index = table.getSelectedRow();
						}
					}
				});
				table.setModel(model);
				scrollPane.setViewportView(table);
				loadTable();
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("Cambiar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String nombre = (String) table.getValueAt(index, 0);
						index = AdmTorneo.getInstancia().encontrarJugador(MiEquipo, nombre);
						if(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(index).isDisponible()) {
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "Lanzador lesionado");
						}
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cerrar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}


	public static void loadTable() {
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		for (Jugador player : AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores()) {
			if(player instanceof Lanzador) {
				fila[0] = player.getNombre();
				fila[1] = player.getNumero();
				fila[2] = ((Lanzador) player).getMiEstadistica().getCarrPitch();
				fila[3] = ((Lanzador) player).getMiEstadistica().getHitsPitch();
				fila[4] = ((Lanzador) player).getMiEstadistica().getJonronPitch();
				fila[5] = ((Lanzador) player).getMiEstadistica().getPromCL();
				if(player.isDisponible()) {
					fila[6] = "Disponible";
				}
				else {
					fila[6] = "Lesionado";
				}
				model.addRow(fila);
 			}
		}
	}
	
	public static int retorno() {
		return index;
	}

}
