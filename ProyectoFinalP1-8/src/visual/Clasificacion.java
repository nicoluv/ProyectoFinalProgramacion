package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;

import logico.AdmTorneo;
import logico.Equipo;

public class Clasificacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	public static DefaultTableModel model;
	public static Object[] fila;
	public static ArrayList<Equipo> Clasificacion = new ArrayList();
	private JButton okButton;
	private int index;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the dialog.
	 */
	public Clasificacion() {
	
		setTitle("Tabla de Pocisiones ");
		setBounds(100, 100, 811, 477);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Posiciones de Temporada", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(12, 25, 759, 349);
				panel.add(scrollPane);
				
				for (Equipo equipo : AdmTorneo.getInstancia().getMisEquipos()) {
					Clasificacion.add(equipo);
				}
				
				Collections.sort(Clasificacion, new Comparator<Equipo>() {

					@Override
					public int compare(Equipo e1, Equipo e2) {
						// TODO Auto-generated method stub
						return Integer.valueOf(e2.getJuegosGanados()).compareTo(e1.getJuegosJugados());
					}
					
				});
				
				String[] header = {"Nombre", "Entrenador", "Juegos Jugados", "Juegos Ganados", "Juegos Perdidos", "Porcentaje de Victoria"};
				model = new DefaultTableModel();
				model.setColumnIdentifiers(header);
				table = new JTable();
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(table.getSelectedRow()>= 0) {
							okButton.setEnabled(true);
							index = table.getSelectedRow();
						}
					}
				});
				table.setModel(model);
				scrollPane.setViewportView(table);
				loadTable();
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("Tarjeta del Equipo");
				okButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						index = AdmTorneo.getInstancia().indiceEquipo(Clasificacion.get(index).getNombre());
						VerEquipo VerEq = new VerEquipo(index);
						VerEq.setModal(true);
						VerEq.setVisible(true);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cerrar");
				cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Clasificacion.clear();
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Clasificacion.clear();
			}
		});
	}

	public static void loadTable() {
		// TODO Auto-generated method stub
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < Clasificacion.size(); i++) {
			fila[0] = Clasificacion.get(i).getNombre();
			fila[1] = Clasificacion.get(i).getEntrenador();
			fila[2] = Clasificacion.get(i).getJuegosJugados();
			fila[3] = Clasificacion.get(i).getJuegosGanados();
			fila[4] = Clasificacion.get(i).getJuegosPerdidos();
			
			int victorias = Clasificacion.get(i).getJuegosGanados();
			int derrotas = Clasificacion.get(i).getJuegosPerdidos();

			if(victorias == 0 && derrotas == 0) {
				fila[5] = "0 %";
			}
			else if(victorias != 0 && derrotas == 0) {
				fila[5] = "100 %";
			}
			else if(victorias != 0 && derrotas != 0) {
				float aux = (100) / (victorias + derrotas);
				int WR = (int) (victorias * aux);
				fila[5] = WR + " %";
			}
			model.addRow(fila);
		}
	}
	

}
