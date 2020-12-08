package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;

public class Login extends JDialog {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField passwordField;

	public Login() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("Iniciar sesi\u00F3n");
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 319, 294);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblUsuario.setBounds(43, 105, 46, 14);
		panel.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(106, 102, 138, 20);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblContrasea.setBounds(43, 166, 60, 14);
		panel.add(lblContrasea);
		
		JButton btnEntrar = new JButton("Iniciar Sesion");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user, pass;
				user = txtUsuario.getText();
				pass = String.valueOf(passwordField.getPassword());
				
				if(user.isEmpty() || pass.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Ha dejado campos vacíos.","Aviso",JOptionPane.WARNING_MESSAGE);
				}
				else if(user.contentEquals("admin")  && pass.contentEquals("admin")){
					JOptionPane.showMessageDialog(null, "Ha iniciado sesión correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "El usuario o contraseña es incorrecto","Aviso",JOptionPane.WARNING_MESSAGE);
					JOptionPane.showMessageDialog(null, "User: "+user+"Pass: "+pass,"Aviso",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEntrar.setBounds(106, 205, 106, 23);
		panel.add(btnEntrar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(106, 163, 138, 20);
		panel.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Bienvenido!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(100, 31, 112, 30);
		panel.add(lblNewLabel);
	}
}
