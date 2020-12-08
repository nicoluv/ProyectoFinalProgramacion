package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;


import logico.AdmTorneo;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaPartidos extends JDialog {

	private JPanel contentPane = new JPanel();
	private int index;
	private JTable table;
	public static DefaultTableModel model;
	public static Object[] fila;
	private static DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaPartidos frame = new ListaPartidos();
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
	public ListaPartidos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(10, 11, 673, 323);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnEliminar = new JButton("Eliminar");
		JPanel panel_1 = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		{
			String [] header = {"Local", "Visitante","Estadio", "Hora", "Fecha", "Estado", "Marcador", "Ganador"};
			model = new DefaultTableModel();
			model.setColumnIdentifiers(header);
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					btnEliminar.setEnabled(true);
					index = table.getSelectedRow();
				}
			});
			table.setModel(model);
			scrollPane.setViewportView(table);
			loadTable();
		}
		scrollPane.setBounds(495, 11, -483, 279);
		
		panel_1.add(scrollPane);
		
		JButton btnNuevaPartida = new JButton("Nueva Partida");
		btnNuevaPartida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNuevaPartida.setBounds(533, 73, 126, 35);
		panel.add(btnNuevaPartida);
		
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(AdmTorneo.getInstancia().getMisJuegos().size() != 0) {
						AdmTorneo.getInstancia().getMisJuegos().remove(index);
						AdmTorneo.getInstancia().GuardarInfo(AdmTorneo.getInstancia());
						JOptionPane.showMessageDialog(null, "El partido fue eliminado.","Informacion",JOptionPane.INFORMATION_MESSAGE);
						loadTable();
				}
			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminar.setBounds(533, 119, 126, 35);
		panel.add(btnEliminar);
		
		JButton btnAtras = new JButton("Atrás\r\n");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAtras.setBounds(533, 165, 126, 35);
		panel.add(btnAtras);
		
		
		panel_1.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Partidas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 11, 513, 301);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		table = new JTable();
		table.setBounds(10, 287, 493, -275);
		panel_1.add(table);
	}

	private void loadTable() {
		model.setRowCount(0);
		Date date;
		String fecha;
		
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < AdmTorneo.getInstancia().getMisJuegos().size(); i++) {
			fila[0] = AdmTorneo.getInstancia().getMisJuegos().get(i).getCasa().getNombre();
			fila[1] = AdmTorneo.getInstancia().getMisJuegos().get(i).getVisitante().getNombre();
			fila[2] =  AdmTorneo.getInstancia().getMisJuegos().get(i).getEstadio();

			date = AdmTorneo.getInstancia().getMisJuegos().get(i).getFechaDelPartido();
			fecha = format.format(date);
			
			fila[4] =  fecha;
			if(AdmTorneo.getInstancia().getMisJuegos().get(i).getEnJuego() == true) {
				fila[5] = "Pendiente";
			}
			else {
				fila[5] = "Finalizado";
			}
			if(AdmTorneo.getInstancia().getMisJuegos().get(i).getEnJuego() == true) {
				fila[6] = "0 - 0";
			}
			else {
				fila[6] = AdmTorneo.getInstancia().getMisJuegos().get(i).getPuntosCasa() + " - " + AdmTorneo.getInstancia().getMisJuegos().get(i).getPuntosVisitante();

			}
			if(AdmTorneo.getInstancia().getMisJuegos().get(i).getEnJuego() == true) {
				fila[7] = "Por Definir";
			}
			else {
				fila[7] = AdmTorneo.getInstancia().getMisJuegos().get(i).getEquipoGanador();
			}
			
			model.addRow(fila);
		}
		
	}
		
}

