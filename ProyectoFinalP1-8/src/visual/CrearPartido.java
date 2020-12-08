package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Choice;
import java.awt.Button;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;

import logico.Jugador;
import logico.AdmTorneo;
import logico.Equipo;
import logico.Juego;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearPartido extends JFrame {

	private JPanel contentPane;
	private JButton btnAtras;

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
		setResizable(false);
		setTitle("Crear Partido");
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
		
		ArrayList<String> equipos = new ArrayList<String>();
		equipos.add("<Seleccionar>");
		for (Equipo i : AdmTorneo.getInstancia().getMisEquipos()) {
			equipos.add(i.getNombre());
		}
		
		JLabel lblEquipoVisitante = new JLabel("Equipo Visitante:");
		lblEquipoVisitante.setBounds(10, 108, 95, 21);
		panel_1.add(lblEquipoVisitante);
		
		JComboBox comboBoxEquipoVisita = new JComboBox();
		
		JComboBox comboBoxHoraPartido = new JComboBox();
		comboBoxHoraPartido.setModel(new DefaultComboBoxModel(new String[] {"3:00PM", "3:30PM", "4:00PM", "4:30PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM"}));
		comboBoxHoraPartido.setBounds(126, 43, 150, 20);
		panel_1.add(comboBoxHoraPartido);
		
		JComboBox comboBoxEquipoLocal = new JComboBox();
		comboBoxEquipoLocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxEquipoLocal.getSelectedIndex() != 0) {
					String aux = comboBoxEquipoVisita.getSelectedItem().toString();
					
					for (String i : equipos) {
						if(i != aux) {
							comboBoxEquipoVisita.addItem(i);
						}
					}
				}
			}
		});
		comboBoxEquipoLocal.setBounds(126, 76, 150, 20);
		panel_1.add(comboBoxEquipoLocal);
		
		
		comboBoxEquipoVisita.setBounds(126, 108, 151, 20);
		panel_1.add(comboBoxEquipoVisita);
		
		JDateChooser dateChooserPartido = new JDateChooser();
		dateChooserPartido.setBounds(126, 11, 150, 20);
		panel_1.add(dateChooserPartido);
		
		
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Date fecha;
				String hora, estadio;
				Equipo local, visitante;
				
				fecha = dateChooserPartido.getDate();
				hora = comboBoxHoraPartido.getActionCommand().toString();
				local = AdmTorneo.getInstancia().encontrarEquipo(comboBoxEquipoLocal.getActionCommand().toString());
				visitante = AdmTorneo.getInstancia().encontrarEquipo(comboBoxEquipoVisita.getActionCommand().toString());
				
				if(fecha == null || hora.isEmpty() || local == null || visitante == null) {
					JOptionPane.showMessageDialog(null, "Has dejado campos vac�os.","Aviso",JOptionPane.WARNING_MESSAGE);
				}
				else {
					int cont1 = 0,cont2 = 0;
					
					for (Jugador i : visitante.getCantJugadores()) {
						if(i.isDisponible() == true) {
							cont1++;
						}
					}
					
					for (Jugador i : local.getCantJugadores()) {
						if(i.isDisponible() == true) {
							cont2++;
						}
					}
					
					if(cont1 >= 9 && cont2 >= 9) {
						estadio = local.getEstadio();
						Juego p = new Juego(visitante, visitante, cont2, cont2, estadio, estadio, fecha, rootPaneCheckingEnabled);
						AdmTorneo.getInstancia().getMisJuegos().add(p);
						AdmTorneo.getInstancia().GuardarInfo(AdmTorneo.getInstancia());
						JOptionPane.showMessageDialog(null, "Se registro el partido con Exito.","Informacion",JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Uno de los equipos no tiene jugadores activos suficientes.","Aviso",JOptionPane.WARNING_MESSAGE);
					}
				}
				
				
				
				
			}
		});
		btnCrear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCrear.setBounds(198, 179, 89, 23);
		panel.add(btnCrear);
		
		btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAtras.setBounds(20, 179, 89, 23);
		panel.add(btnAtras);
	}
}
