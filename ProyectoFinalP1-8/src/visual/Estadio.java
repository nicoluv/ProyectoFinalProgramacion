package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class Estadio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estadio frame = new Estadio();
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
	public Estadio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1123, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 0, 0));
		panel.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Score Board", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(359, 50, 387, 180);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("INNING");
		lblNewLabel_3.setBounds(142, 135, 84, 26);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("LOCAL");
		lblNewLabel_4.setBounds(24, 23, 90, 26);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("VISITANTE\r\n");
		lblNewLabel_5.setBounds(236, 23, 141, 26);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(lblNewLabel_5);
		
		JTextPane textPaneInning = new JTextPane();
		textPaneInning.setBackground(new Color(153, 153, 153));
		textPaneInning.setBounds(142, 23, 84, 112);
		panel.add(textPaneInning);
		
		JTextPane textPanePuntosVisita = new JTextPane();
		textPanePuntosVisita.setBackground(new Color(153, 153, 153));
		textPanePuntosVisita.setBounds(266, 60, 90, 101);
		panel.add(textPanePuntosVisita);
		
		JTextPane textPanePuntosLocal = new JTextPane();
		textPanePuntosLocal.setBackground(new Color(153, 153, 153));
		textPanePuntosLocal.setBounds(24, 60, 90, 101);
		panel.add(textPanePuntosLocal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 153, 153));
		panel_1.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Bateador de turno", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 11, 339, 450);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Equipo");
		lblNewLabel_9.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_9.setBounds(180, 34, 47, 25);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Nombre");
		lblNewLabel_10.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_10.setBounds(20, 34, 47, 25);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Numero");
		lblNewLabel_11.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_11.setBounds(20, 65, 47, 25);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("B/T");
		lblNewLabel_12.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_12.setBounds(180, 65, 47, 25);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("FOTO");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_13.setBounds(20, 101, 123, 88);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Hits");
		lblNewLabel_14.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_14.setBounds(20, 297, 71, 25);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Doble");
		lblNewLabel_15.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_15.setBounds(20, 333, 71, 25);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Triple");
		lblNewLabel_16.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_16.setBounds(20, 369, 65, 25);
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Home Run");
		lblNewLabel_17.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_17.setBounds(20, 405, 65, 25);
		panel_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Base x Bola");
		lblNewLabel_18.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_18.setBounds(180, 405, 79, 25);
		panel_1.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Estadisticas de turno");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setBounds(10, 223, 319, 30);
		panel_1.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Ponche");
		lblNewLabel_20.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_20.setBounds(181, 264, 78, 20);
		panel_1.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Base Robada");
		lblNewLabel_21.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_21.setBounds(181, 300, 78, 20);
		panel_1.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Out x Robo");
		lblNewLabel_22.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_22.setBounds(181, 336, 78, 20);
		panel_1.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Doble Play\r\n");
		lblNewLabel_23.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_23.setBounds(181, 374, 78, 20);
		panel_1.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Carrera\r\n");
		lblNewLabel_24.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_24.setBounds(20, 264, 78, 20);
		panel_1.add(lblNewLabel_24);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(77, 34, 79, 20);
		panel_1.add(textPane);
		
		JButton btnLesionarBat = new JButton("Lesionar Jugador\r\n");
		btnLesionarBat.setBounds(180, 125, 118, 49);
		panel_1.add(btnLesionarBat);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(77, 65, 79, 20);
		panel_1.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(231, 34, 79, 20);
		panel_1.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(231, 65, 79, 20);
		panel_1.add(textPane_3);
		
		JSpinner spinnerCarrera = new JSpinner();
		spinnerCarrera.setBounds(101, 264, 29, 20);
		panel_1.add(spinnerCarrera);
		
		JSpinner spinnerHit = new JSpinner();
		spinnerHit.setBounds(101, 300, 29, 20);
		panel_1.add(spinnerHit);
		
		JSpinner spinnerDoble = new JSpinner();
		spinnerDoble.setBounds(101, 336, 29, 20);
		panel_1.add(spinnerDoble);
		
		JSpinner spinnerTriple = new JSpinner();
		spinnerTriple.setBounds(101, 372, 29, 20);
		panel_1.add(spinnerTriple);
		
		JSpinner spinnerHomeRun = new JSpinner();
		spinnerHomeRun.setBounds(101, 408, 29, 20);
		panel_1.add(spinnerHomeRun);
		
		JSpinner spinnerPonche = new JSpinner();
		spinnerPonche.setBounds(281, 264, 29, 20);
		panel_1.add(spinnerPonche);
		
		JSpinner spinnerBaseRobada = new JSpinner();
		spinnerBaseRobada.setBounds(281, 300, 29, 20);
		panel_1.add(spinnerBaseRobada);
		
		JSpinner spinnerOutRobo = new JSpinner();
		spinnerOutRobo.setBounds(281, 336, 29, 20);
		panel_1.add(spinnerOutRobo);
		
		JSpinner spinnerDoblePlay = new JSpinner();
		spinnerDoblePlay.setBounds(281, 372, 29, 20);
		panel_1.add(spinnerDoblePlay);
		
		JSpinner spinnerBasexBola = new JSpinner();
		spinnerBasexBola.setBounds(281, 408, 29, 20);
		panel_1.add(spinnerBasexBola);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 153, 153));
		panel_2.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Lanzador de turno", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(756, 11, 339, 450);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("FOTO");
		label.setBackground(new Color(153, 153, 153));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(30, 99, 117, 82);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Estadisticas de turno");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(10, 193, 319, 30);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("B/T");
		label_2.setBounds(180, 63, 47, 25);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Numero");
		label_3.setBounds(20, 63, 47, 25);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Equipo");
		label_4.setBounds(180, 27, 47, 25);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("Nombre");
		label_5.setBounds(20, 27, 47, 25);
		panel_2.add(label_5);
		
		JLabel lblNewLabel = new JLabel("Carreras Pichadas");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(20, 270, 121, 25);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hits Pichados");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(20, 234, 121, 25);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblCarrerasLimpias = new JLabel("Carreras Limpias");
		lblCarrerasLimpias.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCarrerasLimpias.setBounds(20, 306, 121, 25);
		panel_2.add(lblCarrerasLimpias);
		
		JLabel lblJonronPichados = new JLabel("Jonron Pichados");
		lblJonronPichados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblJonronPichados.setBounds(180, 234, 99, 25);
		panel_2.add(lblJonronPichados);
		
		JLabel lblBbPitchados = new JLabel("B x B Pitchados");
		lblBbPitchados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBbPitchados.setBounds(180, 270, 99, 25);
		panel_2.add(lblBbPitchados);
		
		JLabel lblPonches = new JLabel("Ponches");
		lblPonches.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPonches.setBounds(180, 306, 84, 25);
		panel_2.add(lblPonches);
		
		JButton btnCambiarPitcher = new JButton("Cambiar Pitcher");
		btnCambiarPitcher.setBounds(105, 387, 140, 23);
		panel_2.add(btnCambiarPitcher);
		
		JButton btnLesionarPitch = new JButton("Lesionar Jugador");
		btnLesionarPitch.setBounds(180, 120, 118, 49);
		panel_2.add(btnLesionarPitch);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(71, 32, 89, 20);
		panel_2.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setBounds(71, 63, 92, 20);
		panel_2.add(textPane_5);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setBounds(221, 32, 89, 20);
		panel_2.add(textPane_6);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setBounds(221, 63, 89, 20);
		panel_2.add(textPane_7);
		
		JSpinner spinnerHitsLanzado = new JSpinner();
		spinnerHitsLanzado.setBounds(140, 234, 29, 20);
		panel_2.add(spinnerHitsLanzado);
		
		JSpinner spinnerCarreraLanzada = new JSpinner();
		spinnerCarreraLanzada.setBounds(140, 272, 29, 20);
		panel_2.add(spinnerCarreraLanzada);
		
		JSpinner spinnerCarreraClean = new JSpinner();
		spinnerCarreraClean.setBounds(140, 308, 29, 20);
		panel_2.add(spinnerCarreraClean);
		
		JSpinner spinnerJonronLanzado = new JSpinner();
		spinnerJonronLanzado.setBounds(289, 236, 29, 20);
		panel_2.add(spinnerJonronLanzado);
		
		JSpinner spinnerBxBLanzado = new JSpinner();
		spinnerBxBLanzado.setBounds(289, 272, 29, 20);
		panel_2.add(spinnerBxBLanzado);
		
		JSpinner spinnerPonchesLanzados = new JSpinner();
		spinnerPonchesLanzados.setBounds(289, 308, 29, 20);
		panel_2.add(spinnerPonchesLanzados);
		
		JLabel lblNewLabel_6 = new JLabel("FOTO");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(615, 252, 112, 100);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("FOTO ");
		lblNewLabel_7.setBackground(new Color(0, 51, 0));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(379, 255, 112, 94);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("V.S");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(493, 295, 112, 54);
		contentPane.add(lblNewLabel_8);
		
		JButton btnSgteTurno = new JButton("Siguiente Turno");
		btnSgteTurno.setBackground(Color.WHITE);
		btnSgteTurno.setBounds(369, 360, 133, 34);
		contentPane.add(btnSgteTurno);
		
		JButton btnCancelarPartido = new JButton("Cancelar partido");
		btnCancelarPartido.setBackground(Color.WHITE);
		btnCancelarPartido.setBounds(491, 438, 133, 23);
		contentPane.add(btnCancelarPartido);
		
		JButton btnSgteInning = new JButton("Siguiente Inning");
		btnSgteInning.setBackground(Color.WHITE);
		btnSgteInning.setBounds(599, 360, 143, 34);
		contentPane.add(btnSgteInning);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(new Color(0, 102, 0));
		panel_3.setBounds(0, 0, 1105, 472);
		contentPane.add(panel_3);
	}
}
