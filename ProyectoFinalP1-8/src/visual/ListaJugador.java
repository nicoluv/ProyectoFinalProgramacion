package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logic.Administracion;
import logico.AdmTorneo;
import logico.Equipo;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ListaJugador extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ArrayList<String> NombresEquipos = new ArrayList<String>();
	JComboBox comboBoxEquipos;
	public static JComboBox cbxEquipos;
	public static DefaultTableModel model;
	public static Object[] fila;
	private int index = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaJugador frame = new ListaJugador();
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
	public ListaJugador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(10, 11, 672, 394);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Jugadores", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 11, 495, 372);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 358, 475, -345);
		panel_1.add(scrollPane);
		
		JButton btnDatosJugador = new JButton("Datos");
		JButton btnEliminarJugador = new JButton("Eliminar");

		String[] header = {"Nombre", "Posicion", "Nacionalidad", "Altura"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(header);
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnDatosJugador.setEnabled(true);
				btnEliminarJugador.setEnabled(true);
				index = table.getSelectedRow();
			}
		});
		table.setBounds(10, 358, 475, -344);
		panel_1.add(table);
		
		for (Equipo aux : AdmTorneo.getInstancia().getMisEquipos()) {
			NombresEquipos.add(aux.getNombre());
		}
		
		JLabel lblNewLabel = new JLabel("Equipo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(506, 22, 156, 32);
		panel.add(lblNewLabel);
		
		JComboBox comboBoxEquipos = new JComboBox();
		comboBoxEquipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadTable();
			}

			
		});
		comboBoxEquipos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxEquipos.setBounds(515, 65, 146, 26);
		panel.add(comboBoxEquipos);
		
		
		btnDatosJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDatosJugador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDatosJugador.setBounds(515, 199, 147, 32);
		panel.add(btnDatosJugador);
		
		btnEliminarJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarJugador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminarJugador.setBounds(515, 242, 147, 32);
		panel.add(btnEliminarJugador);
		
		JButton btnAtras = new JButton("Atrás");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAtras.setBounds(515, 290, 147, 32);
		panel.add(btnAtras);
		
		JButton btnNuevoJugador = new JButton("Nuevo Jugador");
		btnNuevoJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNuevoJugador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNuevoJugador.setBounds(515, 156, 147, 32);
		panel.add(btnNuevoJugador);
		
		
	}
	
	private void loadTable() {
		model.setRowCount(0);
		
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < AdmTorneo.getInstancia().getMisEquipos().get(comboBoxEquipos.getSelectedIndex()).getCantJugadores(); i++) {
			
			
			model.addRow(fila);
		}
		
	}
}
