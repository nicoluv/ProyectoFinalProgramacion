package visual;

import logico.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class RegistrarLesion extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JComboBox cBoxTipo;
	private JComboBox cBoxLocal;
	private JTextPane txtPDescripcion;//new String[] {"<Seleccione>", "Lesion Muscular", "Lesion Tendinosa", "Fractura Mayor","Fractura menor", "ampolla", "Contusion"
	private int miJugador;//"<Seleccione>", "Codo", "Hombro", "Espalda", "Pectoral", "Piernas"
	private int miEquipo;//81, 68, 99, 20   local 288, 68, 91, 20


	/**
	 * Create the dialog.
	 */
	public RegistrarLesion(int j, int e) {
		
		miEquipo = e;
		miJugador = j;
		
		setTitle("Datos de la lesion");
		setBounds(100, 100, 455, 361);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 439, 293);
			contentPanel.add(panel);
			panel.setLayout(null);
		
				JLabel lblLesiones = new JLabel("Lesiones");
				lblLesiones.setBounds(198, 11, 41, 14);
				panel.add(lblLesiones);
			
			
			JLabel lblDesc = new JLabel("Descripcion");
			lblDesc.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblDesc.setBounds(161, 149, 78, 14);
			panel.add(lblDesc);
			
		    cBoxTipo = new JComboBox();
			cBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Lesion Muscular", "Lesion Tendinosa", "Fractura Mayor","Fractura menor", "ampolla", "Contusion"}));

			cBoxTipo.setBounds(81, 68, 99, 20);
			panel.add(cBoxTipo);
			{
				JLabel lblNewLabel = new JLabel("Tipo:");
				lblNewLabel.setBounds(39, 71, 32, 14);
				panel.add(lblNewLabel);
			}
			{
				JComboBox cBoxLocal = new JComboBox();//codo y hombro, así como en la espalda y pectoral
				cBoxLocal.setBounds(288, 68, 91, 20);
				cBoxLocal.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Codo", "Hombro", "Espalda", "Pectoral", "Piernas"}));
				panel.add(cBoxLocal);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Localizaci\u00F3n:");
				lblNewLabel_1.setBounds(210, 71, 68, 14);
				panel.add(lblNewLabel_1);
			}
			
			JTextPane txtPDescripcion = new JTextPane();
			txtPDescripcion.setBounds(26, 185, 378, 83);
			panel.add(txtPDescripcion);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnGuardar = new JButton("Guardar");
				btnGuardar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String tipo = cBoxTipo.getSelectedItem().toString();
						String local = cBoxLocal.getSelectedItem().toString();
						String descrip = txtPDescripcion.getText();
						Date aux = new Date();
						int descanso = 0;
						if(cBoxTipo.getSelectedIndex() == 1) {
							descanso = 21;
						}
						else if(cBoxTipo.getSelectedIndex() == 2) {
							descanso = 42;
						}
						else if(cBoxTipo.getSelectedIndex() == 3) {
							descanso = 90;
						}
						else if(cBoxTipo.getSelectedIndex() == 4) {
							descanso = 45;
						}
						else if(cBoxTipo.getSelectedIndex() == 5) {
							descanso = 20;
						}
						else if(cBoxTipo.getSelectedIndex() == 6) {
							descanso = 60;
						}
						if(!tipo.isEmpty() && !local.isEmpty() && !descrip.isEmpty()) {
							//(Date fechaLesion, String tipo, String localizacion, String descripcion, int diasDescanso
							Lesion lesion = new Lesion( aux,tipo,local, descrip, descanso);
							AdmTorneo.getInstancia().getMisEquipos().get(miEquipo).setCantLesiones(+1);
							AdmTorneo.getInstancia().getMisEquipos().get(miEquipo).getMisJugadores().get(miJugador).setMiLesion(lesion);
							AdmTorneo.getInstancia().getMisEquipos().get(miEquipo).getMisJugadores().get(miJugador).agregarLesion(lesion);
							AdmTorneo.getInstancia().getMisEquipos().get(miEquipo).getMisJugadores().get(miJugador).setDisponible(false);
							AdmTorneo.getInstancia().GuardarInfo(AdmTorneo.getInstancia());
							JOptionPane.showMessageDialog(null, "Lesion registrada correctamente..","Notificacion",JOptionPane.INFORMATION_MESSAGE);
							AdmTorneo.getInstancia().GuardarInfo(AdmTorneo.getInstancia());
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "Complete correctamente los datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
						}
	
	
						
						
						
						
						
						
					}
				});
				btnGuardar.setActionCommand("OK");
				buttonPane.add(btnGuardar);
				getRootPane().setDefaultButton(btnGuardar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
}
