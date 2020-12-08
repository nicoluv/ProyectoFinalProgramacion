package visual;

import java.awt.BorderLayout;
import logico.*;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.sun.glass.events.MouseEvent;

import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaEquipo extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	public static DefaultTableModel model;
	public static Object[] fila;
	private JButton btnEliminar;
	private int index;



	
	
	
	public ListaEquipo() {
		setTitle("Lista de Equipos");
		setBounds(100, 100, 450, 426);
		getContentPane().setLayout(null);
		contentPanel.setBounds(433, 0, 1, 354);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 424, 228);
			contentPanel.add(panel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 354, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 95, 433, 259);
			getContentPane().add(scrollPane);
			{
				String[] header = {"Nombre", "Estadio"};
				model = new DefaultTableModel();
				model.setColumnIdentifiers(header);
				
				table = new JTable();
				table.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent arg0) {
						if(table.getSelectedRow()>=0){
							btnEliminar.setEnabled(true);
							index = table.getSelectedRow();
						}
					}
				});
				table.setModel(model);
				scrollPane.setViewportView(table);
				cargarTabla();
				{
					JPanel panel = new JPanel();
					scrollPane.setColumnHeaderView(panel);
				}
				{
					JPanel panelbotones = new JPanel();
					panelbotones.setBounds(0, 0, 434, 90);
					getContentPane().add(panelbotones);
					{
						JButton btnElimin = new JButton("Eliminar");
						btnElimin.setBounds(305, 11, 69, 23);
						btnElimin.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(AdmTorneo.getInstancia().getMisEquipos().size() == 0 || table.getSelectedRow() < 0) {
									JOptionPane.showMessageDialog(null, "No hay elementos seleccionados.","Aviso",JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									int input = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar el equipo?","Confirmacion",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
									
									if(input == 0) {
										AdmTorneo.getInstancia().getMisEquipos().remove(index);
										AdmTorneo.getInstancia().GuardarInfo(AdmTorneo.getInstancia());
										JOptionPane.showMessageDialog(null, "El equipo ha sido eliminado.","NotificacionInformación",JOptionPane.INFORMATION_MESSAGE);
										cargarTabla();
									}
								}
							
							
							
							
							
							}
						});
						panelbotones.setLayout(null);
						panelbotones.add(btnElimin);
					}
					{
						JButton btnVer = new JButton("Visualizar");
						btnVer.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
							
//								VerEquipo VE = new VerEquipo(index);
//								VE.setModal(true);
//								VE.setVisible(true);
//							
							
							
							
							}
						});
						btnVer.setBounds(305, 45, 89, 23);
						panelbotones.add(btnVer);
					}
				}
				cargarTabla();

				
				
				
				
				
			}
		}
	
		
		
		
	
	
	}
	
	public static void cargarTabla() {
		model.setRowCount(0);
		
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < AdmTorneo.getInstancia().getMisEquipos().size(); i++) {
			
			fila[0] = AdmTorneo.getInstancia().getMisEquipos().get(i).getNombre();
			fila[1] = AdmTorneo.getInstancia().getMisEquipos().get(i).getEstadio();

			model.addRow(fila);
		}
	
	}


}
