package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logic.Administracion;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JMenuItem mnGeLesion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Registrar");
		menuBar.add(mnNewMenu);
		
		JMenuItem mnRegEquipo = new JMenuItem("Equipo");
		mnRegEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegEquipo regE = new RegEquipo();
				regE.setModal(true);
				regE.setVisible(true);
			
			
			}
		});
		mnNewMenu.add(mnRegEquipo);
		
		JMenuItem mnRegPartido = new JMenuItem("Partido");
		mnRegPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if(Administracion.getInstancia().getMisEquipos().size() >= 2) {
					RegPartido regp = new RegPartido();
					regp.setModal(true);
					regp.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Se necesitan 2 o más equipos creados.");
				}
			}
		});
		mnNewMenu.add(mnRegPartido);
		
		JMenuItem mnRegJugador = new JMenuItem("Jugador");
		mnRegJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Administracion.getInstancia().getMisEquipos().size() != 0) {
					RegJugador regj = new RegJugador(0,0,false);
					regj.setModal(true);
					regj.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Aún no hay equipos creados.");
				}
			
			
			}
		});
		mnNewMenu.add(mnRegJugador);
		
		JMenu mnNewMenu_1 = new JMenu("Gestionar");
		menuBar.add(mnNewMenu_1);
		
		mnGeLesion = new JMenuItem("Lesion");
		mnGeLesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionarLesion gesl = new GestionarLesion();
				gesl.setModal(true);
				gesl.setVisible(true);
			
			}
		});
		mnNewMenu_1.add(mnGeLesion);
		
		JMenuItem mnGeJugador = new JMenuItem("Jugador");
		mnGeJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Administracion.getInstancia().getMisEquipos().size() != 0) {
					ListJugadores lj = new ListJugadores();
					lj.setModal(true);
					lj.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Aún no hay equipos creados.");
				}
			
			}
		});
		mnNewMenu_1.add(mnGeJugador);
		
		JMenuItem mnGePartido = new JMenuItem("Partido");
		mnGePartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(Administracion.getInstancia().getMisPartidos().size() != 0) {
					ListPartidos lp = new ListPartidos();
					lp.setModal(true);
					lp.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "No hay partidos creados.");
				}
			
			
			}
		});
		mnNewMenu_1.add(mnGePartido);
		
		JMenuItem menuItem = new JMenuItem("Equipo");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListEquipos le = new ListEquipos();
				le.setModal(true);
				le.setVisible(true);
			
			}
		});
		mnNewMenu_1.add(menuItem);
		
		JMenu mnNewMenu_2 = new JMenu("Calificar");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mnCalificacion = new JMenuItem("Calificacion");
		mnCalificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ranking rank = new Ranking();
				rank.setModal(true);
				rank.setVisible(true);
			
			}
		});
		mnNewMenu_2.add(mnCalificacion);
	}
}
