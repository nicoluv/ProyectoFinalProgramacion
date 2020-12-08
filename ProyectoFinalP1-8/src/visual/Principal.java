package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.javafx.tk.Toolkit;

import java.awt.Color;
import java.awt.Label;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import logico.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import logico.*;

public class Principal extends JFrame {
	
	private JMenu mnGestionar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
					Login login = new Login();
					login.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Estad\u00EDsticas de Beisbol");
		
		
		
		
AdmTorneo x = AdmTorneo.getInstancia().CargarInfo();
		
		if(x != null) {
			AdmTorneo.setAdministracion(x);
		}

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 615);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 892, 576);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(0, 0, 133, 574);
		panel.add(panel_1);
		
		mnGestionar = new JMenu("Gestionar");
		panel_1.add(mnGestionar);
		
		JMenuItem mnGEquipo = new JMenuItem("Equipo");
		mnGEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			ListaEquipo listE = new ListaEquipo(); 
			listE.setModal(true);
			listE.setVisible(true);
			
			}
		});
		mnGestionar.add(mnGEquipo);
		
		JMenuItem mnGJugador = new JMenuItem("Jugador");
		mnGJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			ListaJugador listJ = new ListaJugador();
			listJ.setVisible(true);
			
			}
		});
		mnGestionar.add(mnGJugador);
		
		JMenuItem mntGLesion = new JMenuItem("Lesion");
		mntGLesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GestionarLesion gesE = new GestionarLesion();
				gesE.setModal(true);
				gesE.setVisible(true);
			
			
			
			}
		});
		mnGestionar.add(mntGLesion);
		
		JMenuItem mnGPartido = new JMenuItem("Partido");
		mnGPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 ListaPartidos listPart = new ListaPartidos();
			 listPart.setVisible(true);
			
			
			}
		});
		mnGestionar.add(mnGPartido);
		
		JMenu mnNewMenu = new JMenu("Registrar");
		panel_1.add(mnNewMenu);
		
		JMenuItem mnReEquipo = new JMenuItem("Equipo");
		mnReEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistroEquipo regE = new RegistroEquipo();
				 regE.setModal(true);
				 regE.setVisible(true);
			
			}
		});
		mnNewMenu.add(mnReEquipo);
		
		JMenuItem mnReJugador = new JMenuItem("jugador");
		mnReJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarJugador regJ = new RegistrarJugador(0,0,false);
			 regJ.setModal(true);
				 regJ.setVisible(true);
			
			
			}
		});
		mnNewMenu.add(mnReJugador);
		
		JMenuItem mnRePartido = new JMenuItem("Partido");
		mnRePartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearPartido regP = new CrearPartido();
				 regP.setVisible(true);
			
			
			}
		});
		mnNewMenu.add(mnRePartido);
		
		JPanel panel_2 = new JPanel();
		panel_2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel_2.setBounds(132, 0, 756, 574);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(349, 57, 46, 14);
		panel_2.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		panel_2.add(menuBar);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			ListaEquipo le= new ListaEquipo();
			le.setVisible(true);
			}
		});
		btnNewButton.setBounds(259, 134, 89, 23);
		panel_2.add(btnNewButton);
	}
}
