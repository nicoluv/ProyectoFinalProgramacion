package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
//import rsbuttom.RSButtonMetro;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

import logico.AdmTorneo;
import logico.Bateador;
import logico.Equipo;
import logico.EstBateador;
import logico.Jugador;

public class VerEquipo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	public static DefaultTableModel model;
	public static DefaultTableModel model2;
	private static DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	public static Object[] fila;
	private int ind = 0;
	private static int MiEquipo;
	private JLabel lblNombre;
	private JLabel lblManager;
	private JLabel lblEstadio;
	private JLabel lblCampeonatos;
	private JLabel lblJuegosGanados;
	private JLabel lblJuegosPerdidos;
	private JLabel labelJuegosJugados;
	private JLabel lblWR;
	private JLabel lblNombreEquipo;
	private JLabel LogoEquipo;
	private JButton btnRegLeccion;
	private JButton btnVerJugador;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JTable tablePartidos;
	private NumberFormat formatter = new DecimalFormat(".###");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VerEquipo dialog = new VerEquipo(MiEquipo);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VerEquipo(int index) {
		MiEquipo=index;
		setResizable(false);
		setTitle("Visualizacion de Equipo");
		setBounds(100, 100, 719, 504);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(10, 11, 133, 102);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			LogoEquipo = new JLabel("");
			LogoEquipo.setBounds(0, 0, 133, 102);
			panel_1.add(LogoEquipo);
			
			lblNombreEquipo = new JLabel("");
			lblNombreEquipo.setFont(new Font("Leelawadee", Font.BOLD, 17));
			lblNombreEquipo.setBounds(167, 38, 290, 51);
			panel.add(lblNombreEquipo);
			
			lblNombreEquipo.setText(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getNombre());
			
			JPanel panel_3 = new JPanel();
			panel_3.setBounds(10, 138, 667, 270);
			panel.add(panel_3);
			panel_3.setLayout(null);
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(0, 0, 667, 270);
			panel_3.add(tabbedPane);
			
			JPanel Panelinformacion = new JPanel();
			tabbedPane.addTab("Informacion", null, Panelinformacion, null);
			Panelinformacion.setLayout(null);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBounds(12, 13, 638, 216);
			Panelinformacion.add(panel_4);
			panel_4.setLayout(null);
			
			JLabel labelManager = new JLabel("Entrenador:");
			labelManager.setFont(new Font("Dialog", Font.BOLD, 15));
			labelManager.setBounds(12, 129, 113, 45);
			panel_4.add(labelManager);
			
			JLabel labelEstadio = new JLabel("Estadio:");
			labelEstadio.setFont(new Font("Dialog", Font.BOLD, 15));
			labelEstadio.setBounds(310, 129, 113, 45);
			panel_4.add(labelEstadio);
			
			JLabel labelNombre = new JLabel("Nombre:");
			labelNombre.setFont(new Font("Dialog", Font.BOLD, 15));
			labelNombre.setBounds(12, 38, 113, 45);
			panel_4.add(labelNombre);
			
			Label label = new Label("Campeonatos:");
			label.setFont(new Font("Dialog", Font.BOLD, 15));
			label.setBounds(310, 38, 111, 45);
			panel_4.add(label);
			
			lblNombre = new JLabel("");
			lblNombre.setFont(new Font("Dialog", Font.BOLD, 15));
			lblNombre.setBounds(115, 38, 213, 45);
			panel_4.add(lblNombre);
			
			lblManager = new JLabel("");
			lblManager.setFont(new Font("Dialog", Font.BOLD, 15));
			lblManager.setBounds(115, 129, 213, 45);
			panel_4.add(lblManager);
			
			lblEstadio = new JLabel("");
			lblEstadio.setFont(new Font("Dialog", Font.BOLD, 15));
			lblEstadio.setBounds(427, 129, 191, 45);
			panel_4.add(lblEstadio);
			
			lblCampeonatos = new JLabel("");
			lblCampeonatos.setFont(new Font("Dialog", Font.BOLD, 15));
			lblCampeonatos.setBounds(427, 38, 99, 45);
			panel_4.add(lblCampeonatos);
			
			lblNombre.setText(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getNombre());
			lblManager.setText(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getEntrenador());
			lblEstadio.setText(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getEstadio());
			lblCampeonatos.setText((String.valueOf(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getCampeonatos())));
			
			JPanel PanelRoster = new JPanel();
			tabbedPane.addTab("Roster del Equipo", null, PanelRoster, null);
			PanelRoster.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane = new JScrollPane();
			PanelRoster.add(scrollPane, BorderLayout.CENTER);
			
			btnRegLeccion.setEnabled(false);
			btnEliminar.setEnabled(false);
			btnVerJugador.setEnabled(false);
			btnModificar.setEnabled(false);
			String[] header = {"Nombre", "Pocision", "Pais de Origen", "Edad","Estado", "AVG"};
			model = new DefaultTableModel();
			model.setColumnIdentifiers(header);
			table = new JTable();
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(table.getSelectedRow() >= 0) {
						btnRegLeccion.setEnabled(true);
						btnEliminar.setEnabled(true);
						btnVerJugador.setEnabled(true);
						btnModificar.setEnabled(true);
						ind = table.getSelectedRow();
					}
				}
			});
			table.setModel(model);
			scrollPane.setViewportView(table);
			
			loadTable();
			
			JPanel PanelEstadistica = new JPanel();
			tabbedPane.addTab("Estadisticas del Equipo", null, PanelEstadistica, null);
			PanelEstadistica.setLayout(null);
			
			JLabel lblJuegosJugados = new JLabel("Juegos Jugados:");
			lblJuegosJugados.setFont(new Font("Dialog", Font.BOLD, 15));
			lblJuegosJugados.setBounds(417, 29, 184, 41);
			PanelEstadistica.add(lblJuegosJugados);
			
			JLabel labelWR = new JLabel("Winrate del Equipo:");
			labelWR.setFont(new Font("Dialog", Font.BOLD, 15));
			labelWR.setBounds(417, 99, 184, 41);
			PanelEstadistica.add(labelWR);
			
			JLabel labelJuegosGanados = new JLabel("Juegos Ganados:");
			labelJuegosGanados.setFont(new Font("Dialog", Font.BOLD, 15));
			labelJuegosGanados.setBounds(12, 29, 184, 41);
			PanelEstadistica.add(labelJuegosGanados);
			
			JLabel labelJuegosPerdidos = new JLabel("Juegos Perdidos:");
			labelJuegosPerdidos.setFont(new Font("Dialog", Font.BOLD, 15));
			labelJuegosPerdidos.setBounds(12, 99, 184, 41);
			PanelEstadistica.add(labelJuegosPerdidos);
			
			lblJuegosGanados = new JLabel("");
			lblJuegosGanados.setFont(new Font("Dialog", Font.BOLD, 15));
			lblJuegosGanados.setBounds(158, 29, 96, 41);
			PanelEstadistica.add(lblJuegosGanados);
			
			lblJuegosPerdidos = new JLabel("");
			lblJuegosPerdidos.setFont(new Font("Dialog", Font.BOLD, 15));
			lblJuegosPerdidos.setBounds(158, 99, 96, 41);
			PanelEstadistica.add(lblJuegosPerdidos);
			
			labelJuegosJugados = new JLabel("");
			labelJuegosJugados.setFont(new Font("Dialog", Font.BOLD, 15));
			labelJuegosJugados.setBounds(554, 29, 96, 41);
			PanelEstadistica.add(labelJuegosJugados);
			
			lblWR = new JLabel("");
			lblWR.setFont(new Font("Dialog", Font.BOLD, 15));
			lblWR.setBounds(565, 99, 85, 41);
			PanelEstadistica.add(lblWR);
			
			lblJuegosGanados.setText(String.valueOf(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getJuegosGanados()));
			lblJuegosPerdidos.setText(String.valueOf(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getJuegosPerdidos()));
			labelJuegosJugados.setText(String.valueOf(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getJuegosJugados()));
			
			float avg = AVGTotal();
			
			JLabel lblPromTotalBateo = new JLabel("Prom. total de bateo: " + formatter.format(avg));
			lblPromTotalBateo.setFont(new Font("Dialog", Font.BOLD, 15));
			lblPromTotalBateo.setBounds(12, 165, 233, 41);
			PanelEstadistica.add(lblPromTotalBateo);
			
			JPanel PanelHistorial = new JPanel();
			tabbedPane.addTab("Historial de partidos", null, PanelHistorial, null);
			PanelHistorial.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane_1 = new JScrollPane();
			PanelHistorial.add(scrollPane_1, BorderLayout.CENTER);
			
			String header2[] = {"Local", "Visitante","Estadio", "Hora", "Fecha", "Estado"};
			model2 = new DefaultTableModel();
			model2.setColumnIdentifiers(header2);
			tablePartidos = new JTable();
			tablePartidos.setModel(model2);
			scrollPane_1.setViewportView(tablePartidos);
			loadTablePartidos();
			
			int victorias = AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getJuegosGanados();
			int derrotas = AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getJuegosPerdidos();

			if(victorias == 0 && derrotas == 0) {
				lblWR.setText("0 %");
			}
			else if(victorias != 0 && derrotas == 0) {
				lblWR.setText("100 %");
			}
			else if(victorias != 0 && derrotas != 0) {
				float aux = (100) / (victorias + derrotas);
				int WR = (int) (victorias * aux);
				lblWR.setText(String.valueOf(WR + "%"));
			}

		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cerrar");
				cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				
				btnRegLeccion = new JButton("Registrar Leccion");
				btnRegLeccion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(table.getSelectedRow()>=0) {
							RegistrarLesion regl = new RegistrarLesion(ind,MiEquipo);
							regl.setModal(true);
							regl.setVisible(true);
							loadTable();
						}
						else{
							JOptionPane.showMessageDialog(null, "No has seleccionado ningun jugador.","Aviso",JOptionPane.WARNING_MESSAGE);
						}
					}
				});
				buttonPane.add(btnRegLeccion);
				
				btnVerJugador = new JButton("Ver Jugador");
				btnVerJugador.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(table.getSelectedRow()>=0) {
							VerJugador vj = new VerJugador(ind,MiEquipo);
							vj.setModal(true);
							vj.setVisible(true);
							loadTable();
						}
						else {
							JOptionPane.showMessageDialog(null, "No has seleccionado ningun jugador.","Aviso",JOptionPane.WARNING_MESSAGE);
						}
					}
				});
				buttonPane.add(btnVerJugador);
				
				btnEliminar = new JButton("Eliminar");
				btnEliminar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Eliminar Jugador
						if(table.getSelectedRow()>=0) {
							AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().remove(ind);
							AdmTorneo.getInstancia().GuardarInfo(AdmTorneo.getInstancia());
							loadTable();
						}
						else {
							JOptionPane.showMessageDialog(null, "No has seleccionado ningun jugador.","Aviso",JOptionPane.WARNING_MESSAGE);
						}
						
					}
				});
				buttonPane.add(btnEliminar);
				
				btnModificar = new JButton("Modificar");
				btnModificar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(table.getSelectedRow()>=0){
							RegistrarJugador regj = new RegistrarJugador(ind,MiEquipo,true);
							regj.setModal(true);
							regj.setVisible(true);
							loadTable();
						}
						else {
							JOptionPane.showMessageDialog(null, "No has seleccionado un jugador del roster.","Aviso",JOptionPane.WARNING_MESSAGE);
						}
					}
				});
				buttonPane.add(btnModificar);
				
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		
			
	}
 }
	public void loadTable() {
		model.setRowCount(0);
		
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getCantJugadores(); i++) {
			fila[0] = AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(i).getNombre();
			fila[1] = AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(i).getPosicion();
			fila[2] = AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(i).getPaisOrigen();
			fila[3] = AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(i).getNumero();
			
			if(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(i).isDisponible()== true) {
				fila[4] =  "Disponible";
			}
			else {
				fila[4] = "Lesionado";
			}
			
			if(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(i) instanceof Bateador) {
				int H = ((Bateador) AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(i)).getMiEstadistica().getHitsConectados();
				int AB = ((Bateador) AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(i)).getMiEstadistica().getBasesAlcanzadas();
				
				if(AB > 0 && H > 0) {
					((Bateador) AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(i)).controlarDesempeno(H,AB);
					fila[5] = formatter.format(((Bateador) AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(i)).getMiEstadistica().getAVG());
				}
			}
			else {
				fila[5] = "No disponible";			
			}
			
			model.addRow(fila);
		}
		
		File imgjug = new File("imgequipos/" + AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getNombre() + ".png");
		
		if(imgjug.exists()) {
			rsscalelabel.RSScaleLabel.setScaleLabel(LogoEquipo, imgjug.toString());
		}
	}
	
	public void loadTablePartidos() {
		model2.setRowCount(0);
		Date date;
		String fecha;
		Equipo aux = AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo);
		
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < AdmTorneo.getInstancia().getMisJuegos().size(); i++) {
			
			if(AdmTorneo.getInstancia().getMisJuegos().get(i).getCasa().getNombre() == aux.getNombre() ||
					AdmTorneo.getInstancia().getMisJuegos().get(i).getVisitante().getNombre() == aux.getNombre()) {
				
				fila[0] = AdmTorneo.getInstancia().getMisJuegos().get(i).getCasa().getNombre();
				fila[1] = AdmTorneo.getInstancia().getMisJuegos().get(i).getVisitante().getNombre();
				fila[2] =  AdmTorneo.getInstancia().getMisJuegos().get(i).getEstadio();

				date = AdmTorneo.getInstancia().getMisJuegos().get(i).getFechaDelPartido();
				fecha = format.format(date);
				
				fila[3] =  fecha;
				if(AdmTorneo.getInstancia().getMisJuegos().get(i).getEnJuego() == true) {
					fila[4] = "Pendiente";
				}
				else {
					fila[4] = "Finalizado";
				}	
				model2.addRow(fila);
			}
			
		}

	}
	public float AVGTotal() {
		float suma = 0;
		for (Jugador player : AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores()) {
			if(player instanceof Bateador) {
				suma += ((Bateador) player).getMiEstadistica().getAVG();
			}
		}
		return suma;
	}
}
	


