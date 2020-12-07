package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import logico.*;
import javax.swing.border.TitledBorder;



public class RegistroEquipo extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtEstadio;
	private JTextField txtEntrenador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroEquipo dialog = new RegistroEquipo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroEquipo() {
	 	setTitle("Registro datos del equipo");
		setBounds(100, 100, 376, 516);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(0, 0, 360, 444);
			contentPanel.add(panel_1);
			panel_1.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Nombre: ");
				lblNewLabel.setBounds(20, 217, 44, 14);
				panel_1.add(lblNewLabel);
			}
			
			txtNombre = new JTextField();
			txtNombre.setBounds(124, 214, 119, 20);
			panel_1.add(txtNombre);
			txtNombre.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Estadio:");
			lblNewLabel_1.setBounds(20, 263, 46, 14);
			panel_1.add(lblNewLabel_1);
			
			JLabel lblNewLabel_3 = new JLabel("Campeonatos:");
			lblNewLabel_3.setBounds(22, 350, 70, 14);
			panel_1.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Entrenador:");
			lblNewLabel_4.setBounds(20, 306, 58, 14);
			panel_1.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("Series del Caribe:");
			lblNewLabel_5.setBounds(22, 392, 92, 14);
			panel_1.add(lblNewLabel_5);
			
			txtEstadio = new JTextField();
			txtEstadio.setBounds(124, 260, 119, 20);
			panel_1.add(txtEstadio);
			txtEstadio.setColumns(10);
			
			txtEntrenador = new JTextField();
			txtEntrenador.setText("");
			txtEntrenador.setBounds(124, 303, 119, 20);
			panel_1.add(txtEntrenador);
			txtEntrenador.setColumns(10);
			
			JSpinner spnCampeonatos = new JSpinner();
			spnCampeonatos.setBounds(124, 347, 29, 20);
			panel_1.add(spnCampeonatos);
			
			JSpinner spnSeries = new JSpinner();
			spnSeries.setBounds(124, 389, 29, 20);
			panel_1.add(spnSeries);
			
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Logo del Equipo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(71, 27, 209, 125);
			panel_1.add(panel);
			
			JButton btnImagen = new JButton("Cargar logo");
			btnImagen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFileChooser fc = new JFileChooser();
					fc.setDialogTitle("Cargar imagen");
					
					if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
						BufferedImage logo;
						String nomImagen;
						File f = new File(fc.getSelectedFile().toString());
					
						
						try {
							logo = ImageIO.read(f);
							nomImagen = "imgequipos/" + txtNombre.getText() + ".png";
							ImageIO.write(logo, "png", new File(nomImagen));
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

					
					
				}
			});
			btnImagen.setBounds(144, 163, 89, 23);
			panel_1.add(btnImagen);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String nombre = txtNombre.getText();
						String estadio = txtEstadio.getText();
						String entrenador = txtEntrenador.getText();
						//int campeonatos = (spnCampeonatos.getValue().toString());
						//int series = spnSeries.getValue();
						if(!nombre.equalsIgnoreCase("") && !estadio.equalsIgnoreCase("") && !entrenador.equalsIgnoreCase("")) {
							//tring entrenador, String nombre, String estadio, int campeonatos, int seriesCaribe
							//int juegosPerdidos, int juegosGanados
							Equipo aux = new Equipo(entrenador, nombre, estadio,0,0,0,0);
							AdmTorneo.getInstancia().agregarEquipo(aux);
							AdmTorneo.getInstancia().GuardarInfo(AdmTorneo.getInstancia());
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
