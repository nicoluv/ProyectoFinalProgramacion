package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Label;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 331, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Bienvenido", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 308, 337);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 190, 288, 96);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Clave");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 54, 45, 22);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 12, 45, 31);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(65, 17, 209, 24);
		panel_1.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtClave = new JPasswordField();
		txtClave.setBounds(65, 56, 209, 23);
		panel_1.add(txtClave);
		txtClave.setColumns(10);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(198, 297, 89, 29);
		panel.add(btnSalir);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String usuario = "Admin";
		        String password = "12345";
		       
		        if(usuario.equals(txtUsuario.getText()) && password.equals(txtClave.getText())){
		            // Poner principal visual
		            
		        }else if (usuario.equals(txtUsuario.getText().equals("")) && password.equals(txtClave.getText().equals(""))){
		        	JOptionPane.showMessageDialog(contentPane, "Usuario y/o Contraseña estan vacios\nIngrese su usuario y contraseña",null, getDefaultCloseOperation());
		        	txtUsuario.setFocusable(true); 
		        	
		        }else if (usuario.equals(txtUsuario.getText().equals(""))){
		        	
		        	JOptionPane.showMessageDialog(contentPane, "Usuario y/o Contraseña estan vacios\nIngrese su usuario y contraseña",null, getDefaultCloseOperation());
		        	txtUsuario.setFocusable(true); 

		        }else if (password.equals(txtClave.getText().equals(""))){
		        	JOptionPane.showMessageDialog(contentPane, "Usuario y/o Contraseña estan vacios\nIngrese su usuario y contraseña",null, getDefaultCloseOperation());
		        	txtUsuario.setFocusable(true); 

		        }else if(txtUsuario.getText().compareTo(usuario) != 0 && txtClave.getText().compareTo(password) != 0){
		        	JOptionPane.showMessageDialog(contentPane, "Usuario y Contraseña estan vacios\nIngrese su usuario y contraseña",null, getDefaultCloseOperation());
		        	txtUsuario.setFocusable(true); 
		        }else if (txtUsuario.getText().compareTo(usuario) != 0){
		        	JOptionPane.showMessageDialog(contentPane, "Usuario Incorrecto\nIngrese su usuario y contraseña",null, getDefaultCloseOperation());
		        	txtUsuario.setFocusable(true); 
		        }else if (txtClave.getText().compareTo(usuario) != 0){
		        	JOptionPane.showMessageDialog(contentPane, "Clave Incorrecto\nIngrese su usuario y contraseña",null, getDefaultCloseOperation());
		        	txtUsuario.setFocusable(true); 

		        }
		        
		    }
		});
		btnIngresar.setBounds(10, 297, 89, 29);
		panel.add(btnIngresar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(23, 35, 260, 130);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		Label label = new Label("FOTO");
		label.setFont(new Font("Dialog", Font.PLAIN, 50));
		label.setAlignment(Label.CENTER);
		label.setBounds(0, 0, 260, 130);
		panel_2.add(label);
	}
}
