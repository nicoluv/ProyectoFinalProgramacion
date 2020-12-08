package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;

import logic.Administracion;
import logic.Lesion;

import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class RegLesion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtAtendido;
	private int MiJugador;
	private int MiEquipo;
	private JComboBox cbxTipo;
	private JTextPane txtDescripcion;

	public RegLesion(int i, int e) {
		
		MiJugador = i;
		MiEquipo = e;
		setTitle("Registrar Lesion");
		setBounds(100, 100, 512, 322);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(Color.GRAY);
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblTipoDeLesion = new JLabel("Tipo de Lesion:");
			lblTipoDeLesion.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblTipoDeLesion.setBounds(16, 63, 95, 16);
			panel.add(lblTipoDeLesion);
			
			cbxTipo = new JComboBox();
			cbxTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
			cbxTipo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Lesion de Musculo", "Lesion de Tendon", "Ructura Abierta", "Ructura Cerrada", "Contusion", "Ampolla"}));
			cbxTipo.setBounds(92, 54, 141, 25);
			panel.add(cbxTipo);
			
			JLabel lblAtendidoPor = new JLabel("Atendido por:");
			lblAtendidoPor.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblAtendidoPor.setBounds(16, 90, 75, 16);
			panel.add(lblAtendidoPor);
			
			txtAtendido = new JTextField();
			txtAtendido.setBounds(92, 88, 141, 21);
			panel.add(txtAtendido);
			txtAtendido.setColumns(10);
			
			JLabel lblDescripcion = new JLabel("Descripcion de la Lesion:");
			lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblDescripcion.setBounds(194, 123, 126, 16);
			panel.add(lblDescripcion);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_1.setBounds(16, 150, 458, 64);
			panel.add(panel_1);
			panel_1.setLayout(new BorderLayout(0, 0));
			
			txtDescripcion = new JTextPane();
			panel_1.add(txtDescripcion, BorderLayout.CENTER);
			
			JLabel lblNewLabel = new JLabel("Datos");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setBounds(217, 11, 46, 14);
			panel.add(lblNewLabel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
				btnRegistrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String tipo = cbxTipo.getSelectedItem().toString();
						String nombre = txtAtendido.getText();
						String descrip = txtDescripcion.getText();
						Calendar cal = Calendar.getInstance();
						Date aux = new Date();
						int reposo = 0;
						if(cbxTipo.getSelectedIndex() == 1) {
							reposo = 15;
						}
						else if(cbxTipo.getSelectedIndex() == 2) {
							reposo = 20;
						}
						else if(cbxTipo.getSelectedIndex() == 3) {
							reposo = 45;
						}
						else if(cbxTipo.getSelectedIndex() == 4) {
							reposo = 90;
						}
						else if(cbxTipo.getSelectedIndex() == 5) {
							reposo = 80;
						}
						else if(cbxTipo.getSelectedIndex() == 6) {
							reposo = 18;
						}
						if(!tipo.isEmpty() && !nombre.isEmpty() && !descrip.isEmpty()) {
							Lesion les = new Lesion(tipo, aux, reposo, nombre, descrip);
							Administracion.getInstancia().getMisEquipos().get(MiEquipo).setCantLesiones(+1);
							Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(MiJugador).setMiLesion(les);
							Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(MiJugador).AddLesion(les);
							Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(MiJugador).setEstado(false);
							Administracion.getInstancia().Guardar(Administracion.getInstancia());
							JOptionPane.showMessageDialog(null, "Se registró la lesión con éxito.","Información",JOptionPane.INFORMATION_MESSAGE);
							Administracion.getInstancia().Guardar(Administracion.getInstancia());
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "Revise los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
						}
	
						
					}
				});
				btnRegistrar.setActionCommand("OK");
				buttonPane.add(btnRegistrar);
				getRootPane().setDefaultButton(btnRegistrar);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
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
}
