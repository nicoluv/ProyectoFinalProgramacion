package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Choice;
import java.awt.Button;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;

public class CrearPartido extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearPartido frame = new CrearPartido();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CrearPartido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Nuevo Juego", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 22, 292, 146);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fecha del partido:");
		lblNewLabel.setBounds(10, 11, 95, 21);
		panel_1.add(lblNewLabel);
		
		JLabel lblHoraDelPartido = new JLabel("Hora del partido:");
		lblHoraDelPartido.setBounds(10, 43, 95, 21);
		panel_1.add(lblHoraDelPartido);
		
		JLabel lblEquipoLocal = new JLabel("Equipo local:");
		lblEquipoLocal.setBounds(10, 76, 95, 21);
		panel_1.add(lblEquipoLocal);
		
		JLabel lblEquipoVisitante = new JLabel("Equipo Visitante:");
		lblEquipoVisitante.setBounds(10, 108, 95, 21);
		panel_1.add(lblEquipoVisitante);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM"}));
		comboBox.setBounds(126, 43, 150, 20);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Aguilas Cibaeñas", "Tigres del Licey", "Leones del Escogido", "Toros del Este", "Estrellas Orientales", "Gigantes del Cibao"}));
		comboBox_1.setBounds(126, 76, 150, 20);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Aguilas Cibaeñas", "Tigres del Licey", "Leones del Escogido", "Toros del Este", "Estrellas Orientales", "Gigantes del Cibao"}));
		comboBox_2.setBounds(126, 108, 151, 20);
		panel_1.add(comboBox_2);
		
		Choice choice = new Choice();
		choice.setBounds(126, 12, 150, 20);
		panel_1.add(choice);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(198, 179, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(20, 179, 89, 23);
		panel.add(btnNewButton_1);
	}
}
