package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logico.AdmTorneo;
import logico.Bateador;
import logico.Lanzador;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class VerJugador extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table; 
	public static Object[] fila;
	private static int MiJugador;
	public static DefaultTableModel model;
	private static int MiEquipo;
	private JLabel lblNombreApellido;
	private JLabel lblNacimiento;
	private JLabel lblPais;
	private JLabel lblEstatura;
	private JLabel lblPosicion;
	private JLabel lblBT;
	private JLabel lblEquipo;
	private JLabel lblNumero;
	private static JLabel lblFoto;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 * @param miEquipo 
	 * @param ind 
	 */
	public VerJugador(int ind, int mE) {
		setResizable(false);
		setTitle("Tarjeta del Jugador");
		MiJugador = ind;
		MiEquipo = mE;
		setBounds(100, 100, 716, 400);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel() {
				protected void paintComponent(Graphics g) {
					super.paintComponent(g);
					Graphics2D g2 = (Graphics2D) g;
					g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
					GradientPaint g3 = new GradientPaint(0, 0, getBackground().CYAN.brighter(), 0, getHeight(), getBackground().DARK_GRAY.brighter().brighter().brighter());
					g2.setPaint(g3);
					g2.fillRect(0, 0, getWidth(), getHeight());
				}
			};
			panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel_1.setBounds(10, 37, 682, 168);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			lblFoto = new JLabel("");
			lblFoto.setBounds(480, 12, 190, 144);
			panel_1.add(lblFoto);
			
			lblNombreApellido = new JLabel("");
			lblNombreApellido.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNombreApellido.setBounds(12, 18, 251, 26);
			panel_1.add(lblNombreApellido);
			
			JLabel labelNacimiento = new JLabel("Fecha Nacimineto:");
			labelNacimiento.setFont(new Font("Tahoma", Font.BOLD, 15));
			labelNacimiento.setBounds(12, 62, 150, 16);
			panel_1.add(labelNacimiento);
			
			lblNacimiento = new JLabel("");
			lblNacimiento.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNacimiento.setBounds(182, 62, 55, 16);
			panel_1.add(lblNacimiento);
			
			JLabel labelPais = new JLabel("Pais:");
			labelPais.setFont(new Font("Tahoma", Font.BOLD, 15));
			labelPais.setBounds(12, 96, 55, 16);
			panel_1.add(labelPais);
			
			lblPais = new JLabel("");
			lblPais.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblPais.setBounds(68, 96, 195, 16);
			panel_1.add(lblPais);
			
			JLabel labelEstatura = new JLabel("Estatura:");
			labelEstatura.setFont(new Font("Tahoma", Font.BOLD, 15));
			labelEstatura.setBounds(274, 62, 83, 16);
			panel_1.add(labelEstatura);
			
			lblEstatura = new JLabel("");
			lblEstatura.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblEstatura.setBounds(367, 62, 55, 16);
			panel_1.add(lblEstatura);
			
			JLabel labelPocision = new JLabel("Posici\u00F3n:");
			labelPocision.setFont(new Font("Tahoma", Font.BOLD, 15));
			labelPocision.setBounds(274, 96, 80, 16);
			panel_1.add(labelPocision);
			
			lblPosicion = new JLabel("");
			lblPosicion.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblPosicion.setBounds(349, 96, 123, 16);
			panel_1.add(lblPosicion);
			
			JLabel labelBT = new JLabel("BT:");
			labelBT.setFont(new Font("Tahoma", Font.BOLD, 15));
			labelBT.setBounds(12, 130, 55, 16);
			panel_1.add(labelBT);
			
			lblBT = new JLabel("");
			lblBT.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblBT.setBounds(68, 130, 94, 16);
			panel_1.add(lblBT);
			
						
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_2.setBounds(10, 257, 682, 41);
			panel.add(panel_2);
			panel_2.setLayout(new BorderLayout(0, 0));
			{
				JScrollPane scrollPane = new JScrollPane();
				panel_2.add(scrollPane, BorderLayout.CENTER);
				
				model = new DefaultTableModel();
				String[] headerLanzador = {"Juegos Iniciados", "Hits", "Carreras", "Jonrones", "Ponches", "Carreras Limpias", "PromCL"};
				String[] headerBateador = {"Al Bate", "Carreras", "Hits", "HR", "2B", "Juegos Jugados", "AVG"};
				if(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador) instanceof Bateador) {
					model.setColumnIdentifiers(headerBateador);
				}
				else if(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador) instanceof Lanzador) {
					model.setColumnIdentifiers(headerLanzador);
				}
				
				table = new JTable();
				table.setRowSelectionAllowed(false);
				scrollPane.setViewportView(table);
				table.setModel(model);
				loadtable();
			}
			
			lblNombreApellido.setText(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getNombre());
			lblEstatura.setText((String.valueOf(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getEstatura())) + "cm");
		    lblNacimiento.setText((String.valueOf(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getNacimiento())));
			lblBT.setText(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getBt());
			lblPais.setText(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getPaisOrigen());
			lblPosicion.setText(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getPosicion());

			
			
			JLabel lblNmero = new JLabel("N\u00FAmero:");
			lblNmero.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNmero.setBounds(275, 24, 79, 16);
			panel_1.add(lblNmero);
			
			lblNumero = new JLabel("");
			lblNumero.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNumero.setBounds(349, 24, 55, 16);
			panel_1.add(lblNumero);
			
			lblNumero.setText(String.valueOf(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getNumero()));
			
			JLabel lblEstadisticasTemporadaRegular = new JLabel("Estadisticas de Temporada ");
			lblEstadisticasTemporadaRegular.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblEstadisticasTemporadaRegular.setBounds(10, 217, 314, 28);
			panel.add(lblEstadisticasTemporadaRegular);
			
			lblEquipo = new JLabel("");
			lblEquipo.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblEquipo.setBounds(10, 9, 435, 22);
			panel.add(lblEquipo);
			
			lblEquipo.setText(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getNombre());
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton btnModificar = new JButton("Modificar");
			btnModificar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RegistrarJugador regj = new RegistrarJugador(MiJugador, MiEquipo, true); 
					regj.setModal(true);
					regj.setVisible(true);
					RecargarDatos();
				}
			});
			btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 11));
			buttonPane.add(btnModificar);
			{
				JButton okButton = new JButton("Historial de lesiones");
				okButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
				okButton.setEnabled(false);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
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

	public static void loadtable() {
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		NumberFormat formatter = new DecimalFormat(".###");
		if(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador) instanceof Bateador) {
			Bateador player = (Bateador) AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador);
			fila[0] = player.getMiEstadistica().getTurnos();
			fila[1] = player.getMiEstadistica().getCarreras();
			fila[2] = player.getMiEstadistica().getHitsConectados();
			fila[3] = player.getMiEstadistica().getHomeRun();
			fila[4] = player.getMiEstadistica().getDoblesConectados();
			fila[5] = player.getMiEstadistica().getJuegosJugados();
			
			if(player.getMiEstadistica().getTurnos() > 0 && player.getMiEstadistica().getHitsConectados() > 0) {
				player.controlarDesempeno(player.getMiEstadistica().getHitsConectados(), player.getMiEstadistica().getBasesAlcanzadas());
				fila[6] = formatter.format(player.getMiEstadistica().getAVG());
			}
			else {
				fila[6] = 0;
			}
			
			model.addRow(fila);
		}
		else if(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador) instanceof Lanzador) {
			Lanzador player = (Lanzador) AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador);
			fila[0] = player.getMiEstadistica().getJuegosIni();
			fila[1] = player.getMiEstadistica().getHitsPitch();
			fila[2] = player.getMiEstadistica().getCarrPitch();
			fila[3] = player.getMiEstadistica().getJonronPitch();
			fila[4] = player.getMiEstadistica().getPonches();
			fila[5] = player.getMiEstadistica().getCarrLimpias();
			
			if(player.getMiEstadistica().getEntradasJugadas() > 0 && player.getMiEstadistica().getCarrLimpias() > 0) {
				player.getMiEstadistica().PromCL();
				fila[6] = formatter.format(player.getMiEstadistica().getPromCL());
			}
			else {
				fila[6] = 0;
			}
			
			model.addRow(fila);
		}
		
		File imgjug = new File("imgjugadores/" + AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getNombre() + ".png");
		
		if(imgjug.exists()) {
			rsscalelabel.RSScaleLabel.setScaleLabel(lblFoto, imgjug.toString());
		}
	}
	
	public void RecargarDatos() {
		lblNombreApellido.setText(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getNombre());
		lblEstatura.setText((String.valueOf(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getEstatura())) + "cm");
	    lblNacimiento.setText((String.valueOf(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getNacimiento())));
		lblBT.setText(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getBt());
		lblPais.setText(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getPaisOrigen());
		lblPosicion.setText(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getPosicion());
		lblNumero.setText(String.valueOf(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getNumero()));
		loadtable();
	}
}



