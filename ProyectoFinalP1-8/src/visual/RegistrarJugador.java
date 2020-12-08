package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Button;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;

import logico.AdmTorneo;
import logico.Bateador;
import logico.Equipo;
import logico.EstBateador;
import logico.EstLanzador;
import logico.Jugador;
import logico.Lanzador;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;

public class RegistrarJugador extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNombre;
	private int indice;
	private ArrayList<String> equipos=new ArrayList<String>();
	
	private JDateChooser dateChooser;
	
	private JComboBox<String> comboBoxPosicion;
	private JComboBox comboBoxPais;
	private JComboBox comboBoxDisponible;
	private JComboBox comboBoxBT;
	private JComboBox comboBoxEquipo;
	
	private JSpinner spinnerEstatura;
	private JSpinner spinnerPeso;
	private JSpinner spinnerNumero;
	private JSpinner spinnerBB; 
	private JSpinner spinner2B;
	private JSpinner spinner3B;
	private JSpinner spinnerGP;
	private JSpinner spinnerAB;
	private JSpinner spinnerH;
	private JSpinner spinnerHR;
	private JSpinner spinnerRBI;
	private JSpinner spinnerTB;
	private JSpinner spinnerK;
	private JSpinner spinnerSB;
	private JSpinner spinnerDP;
	private JSpinner spinnerR; 
	
	private JSpinner spinnerHpitch;
	private JSpinner spinnerCL;
	private JSpinner spinnerPpitch;
	private JSpinner spinnerGpitch;
	private JSpinner spinnerGSpitch;
	private JSpinner spinnerHRpitch;
	private JSpinner spinnerBBpitch;
	private JSpinner spinnerKpitch;
	private JSpinner spinnerGPpitch;
	private JSpinner spinnerERpitch;
	
	private JRadioButton rdbtnBateador;
	private JRadioButton rdbtnLanzador;
	
	private JLabel lblSubirImagen;
	private static File imgjug;
	private BufferedImage imagen;
	private JPanel panelLanzador;
	private JPanel panelBateador;
	private JPanel panelTipo;
	
	private static int MiEquipo, MiJugador;
	private boolean modificar = false;



	/**
	 * Launch the application.
	 */
	/**
	 * Create the dialog.
	 */
	public RegistrarJugador(int pl1, int eq1, boolean modif) {
		
		MiJugador = pl1;
		MiEquipo = eq1;
		modificar = modif;
		
		if(modificar == true) {
			setTitle("Modificar jugador");
		}
		else {
			setTitle("Registrar jugador");
		}
		
		setEnabled(false);
		setBounds(100, 100, 634, 440);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		panelBateador = new JPanel();
		panelBateador.setBounds(5, 270, 610, 98);
		panelBateador.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Estadistica Bateador", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPanel.add(panelBateador);
		panelBateador.setLayout(null);
		
		JLabel lblGP = new JLabel("GP:");
		lblGP.setBounds(10, 29, 29, 14);
		panelBateador.add(lblGP);
		
		spinnerGP = new JSpinner();
		spinnerGP.setBounds(37, 26, 39, 20);
		panelBateador.add(spinnerGP);
		
		JLabel lblAB = new JLabel("AB:");
		lblAB.setBounds(86, 29, 29, 14);
		panelBateador.add(lblAB);
		
		spinnerAB = new JSpinner();
		spinnerAB.setBounds(111, 26, 39, 20);
		panelBateador.add(spinnerAB);
		
		JLabel lblH = new JLabel("H:");
		lblH.setBounds(165, 29, 17, 14);
		panelBateador.add(lblH);
		
		spinnerH = new JSpinner();
		spinnerH.setBounds(192, 26, 39, 20);
		panelBateador.add(spinnerH);
		
		JLabel lblR = new JLabel("R:");
		lblR.setBounds(241, 29, 29, 14);
		panelBateador.add(lblR);
		
		spinnerR = new JSpinner();
		spinnerR.setBounds(266, 26, 39, 20);
		panelBateador.add(spinnerR);
		
		JLabel lblb = new JLabel("2B:");
		lblb.setBounds(315, 29, 29, 14);
		panelBateador.add(lblb);
		
		spinner2B = new JSpinner();
		spinner2B.setBounds(342, 26, 39, 20);
		panelBateador.add(spinner2B);
		
		JLabel lblb_1 = new JLabel("3B:");
		lblb_1.setBounds(391, 29, 29, 14);
		panelBateador.add(lblb_1);
		
		spinner3B = new JSpinner();
		spinner3B.setBounds(416, 26, 39, 20);
		panelBateador.add(spinner3B);
		
		JLabel lblHr = new JLabel("HR:");
		lblHr.setBounds(460, 29, 29, 14);
		panelBateador.add(lblHr);
		
		spinnerHR = new JSpinner();
		spinnerHR.setBounds(487, 26, 39, 20);
		panelBateador.add(spinnerHR);
		
		JLabel lblRbi = new JLabel("RBI:");
		lblRbi.setBounds(536, 29, 29, 14);
		panelBateador.add(lblRbi);
		
		spinnerRBI = new JSpinner();
		spinnerRBI.setBounds(561, 26, 39, 20);
		panelBateador.add(spinnerRBI);
		
		JLabel lblTb = new JLabel("TB:");
		lblTb.setBounds(10, 70, 29, 14);
		panelBateador.add(lblTb);
		
		spinnerTB = new JSpinner();
		spinnerTB.setBounds(37, 67, 39, 20);
		panelBateador.add(spinnerTB);
		
		JLabel lblBb = new JLabel("BB:");
		lblBb.setBounds(86, 70, 29, 14);
		panelBateador.add(lblBb);
		
		spinnerBB = new JSpinner();
		spinnerBB.setBounds(111, 67, 39, 20);
		panelBateador.add(spinnerBB);
		
		JLabel lblK = new JLabel("K:");
		lblK.setBounds(165, 70, 17, 14);
		panelBateador.add(lblK);
		
		spinnerK = new JSpinner();
		spinnerK.setBounds(192, 67, 39, 20);
		panelBateador.add(spinnerK);
		
		JLabel lblSb = new JLabel("SB:");
		lblSb.setBounds(241, 70, 29, 14);
		panelBateador.add(lblSb);
		
		spinnerSB = new JSpinner();
		spinnerSB.setBounds(266, 67, 39, 20);
		panelBateador.add(spinnerSB);
		
		JLabel lblDp = new JLabel("DP:");
		lblDp.setBounds(315, 70, 29, 14);
		panelBateador.add(lblDp);
		
		spinnerDP = new JSpinner();
		spinnerDP.setBounds(342, 67, 39, 20);
		panelBateador.add(spinnerDP);
		panelBateador.setVisible(true);
		
		
		panelLanzador = new JPanel();
		panelLanzador.setBorder(new TitledBorder(null, "Estadistica Lanzador", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelLanzador.setBounds(5, 270, 610, 98);
		contentPanel.add(panelLanzador);
		panelLanzador.setLayout(null);
		
		JLabel label = new JLabel("GP:");
		label.setBounds(10, 29, 29, 14);
		panelLanzador.add(label);
		
		spinnerGPpitch = new JSpinner();
		spinnerGPpitch.setBounds(37, 26, 39, 20);
		panelLanzador.add(spinnerGPpitch);
		
		JLabel lblEr = new JLabel("ER:");
		lblEr.setBounds(86, 29, 29, 14);
		panelLanzador.add(lblEr);
		
		spinnerERpitch = new JSpinner();
		spinnerERpitch.setBounds(111, 26, 39, 20);
		panelLanzador.add(spinnerERpitch);
		
		JLabel label_2 = new JLabel("H:");
		label_2.setBounds(165, 29, 17, 14);
		panelLanzador.add(label_2);
		
		spinnerHpitch = new JSpinner();
		spinnerHpitch.setBounds(192, 26, 39, 20);
		panelLanzador.add(spinnerHpitch);
		
		JLabel lblP = new JLabel("P:");
		lblP.setBounds(241, 29, 29, 14);
		panelLanzador.add(lblP);
		
		spinnerPpitch = new JSpinner();
		spinnerPpitch.setBounds(266, 26, 39, 20);
		panelLanzador.add(spinnerPpitch);
		
		JLabel lblG = new JLabel("G:");
		lblG.setBounds(315, 29, 17, 14);
		panelLanzador.add(lblG);
		
		spinnerGpitch = new JSpinner();
		spinnerGpitch.setBounds(342, 26, 39, 20);
		panelLanzador.add(spinnerGpitch);
		
		JLabel lblGs = new JLabel("GS:");
		lblGs.setBounds(391, 29, 29, 14);
		panelLanzador.add(lblGs);
		
		spinnerGSpitch = new JSpinner();
		spinnerGSpitch.setBounds(416, 26, 39, 20);
		panelLanzador.add(spinnerGSpitch);
		
		JLabel label_6 = new JLabel("HR:");
		label_6.setBounds(460, 29, 29, 14);
		panelLanzador.add(label_6);
		
		spinnerHRpitch = new JSpinner();
		spinnerHRpitch.setBounds(487, 26, 39, 20);
		panelLanzador.add(spinnerHRpitch);
		
		JLabel lblCl = new JLabel("CL:");
		lblCl.setBounds(536, 29, 29, 14);
		panelLanzador.add(lblCl);
		
		spinnerCL = new JSpinner();
		spinnerCL.setBounds(561, 26, 39, 20);
		panelLanzador.add(spinnerCL);
		
		JLabel label_9 = new JLabel("BB:");
		label_9.setBounds(10, 69, 29, 14);
		panelLanzador.add(label_9);
		
		spinnerBBpitch = new JSpinner();
		spinnerBBpitch.setBounds(35, 66, 39, 20);
		panelLanzador.add(spinnerBBpitch);
		
		JLabel label_10 = new JLabel("K:");
		label_10.setBounds(89, 69, 17, 14);
		panelLanzador.add(label_10);
		
		spinnerKpitch = new JSpinner();
		spinnerKpitch.setBounds(116, 66, 39, 20);
		panelLanzador.add(spinnerKpitch);
		
		panelLanzador.setVisible(false);
		{
			JPanel panelEste = new JPanel();
			panelEste.setBounds(437, 5, 178, 213);
			panelEste.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cargar Imagen 2x2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			contentPanel.add(panelEste);
			panelEste.setLayout(null);
			
			JButton btnSubirImagen = new JButton("Subir");
			btnSubirImagen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser fc = new JFileChooser();
					fc.setDialogTitle("Buscar imagen");
					if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
						String nombreImagen;
						
						File arch = new File(fc.getSelectedFile().toString());
						
						rsscalelabel.RSScaleLabel.setScaleLabel(lblSubirImagen, fc.getSelectedFile().toString()); 

							try {
								imagen = ImageIO.read(arch);
								nombreImagen = "imgjugadores/" + textFieldNombre.getText() + ".png";
								ImageIO.write(imagen, "png", new File(nombreImagen));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
					
					}
				}
			});
			btnSubirImagen.setBounds(44, 179, 95, 23);
			panelEste.add(btnSubirImagen);
			
			JPanel panelSubirImagen = new JPanel();
			panelSubirImagen.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			panelSubirImagen.setBounds(10, 22, 158, 131);
			panelEste.add(panelSubirImagen);
			
			lblSubirImagen = new JLabel("");
			lblSubirImagen.setBackground(SystemColor.activeCaptionBorder);
			lblSubirImagen.setBounds(10, 22, 158, 131);
			panelSubirImagen.add(lblSubirImagen);
						
		}
		{
			JPanel panelCentro = new JPanel();
			panelCentro.setBorder(new TitledBorder(null, "Informacion Principal", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelCentro.setBounds(5, 5, 422, 213);
			contentPanel.add(panelCentro);
			panelCentro.setLayout(null);
			
			JLabel lblNombre = new JLabel("Nombre :");
			lblNombre.setBounds(10, 26, 71, 14);
			panelCentro.add(lblNombre);
			
			JLabel lblPosicion = new JLabel("Posicion :");
			lblPosicion.setBounds(10, 61, 71, 14);
			panelCentro.add(lblPosicion);
			
			JLabel lblNumero = new JLabel("Numero :");
			lblNumero.setBounds(10, 99, 71, 14);
			panelCentro.add(lblNumero);
			
			JLabel lblEstatura = new JLabel("Estatura(cm) :");
			lblEstatura.setBounds(10, 138, 80, 14);
			panelCentro.add(lblEstatura);
			
			JLabel lblPeso = new JLabel("Peso (kg):");
			lblPeso.setBounds(10, 176, 71, 14);
			panelCentro.add(lblPeso);
			
			spinnerEstatura = new JSpinner();
			spinnerEstatura.setModel(new SpinnerNumberModel(new Integer(170), null, null, new Integer(1)));
			spinnerEstatura.setBounds(91, 135, 56, 20);
			panelCentro.add(spinnerEstatura);
			
			spinnerPeso = new JSpinner();
			spinnerPeso.setModel(new SpinnerNumberModel(new Integer(65), null, null, new Integer(1)));
			spinnerPeso.setBounds(91, 173, 56, 20);
			panelCentro.add(spinnerPeso);
			
			spinnerNumero = new JSpinner();
			spinnerNumero.setBounds(91, 96, 56, 20);
			panelCentro.add(spinnerNumero);
			
			comboBoxPosicion = new JComboBox();
			comboBoxPosicion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					indice = comboBoxPosicion.getSelectedIndex();
					if(indice==9) {
						panelLanzador.setVisible(true);
						panelBateador.setVisible(false);
					}else {
						panelLanzador.setVisible(false);
						panelBateador.setVisible(false);
					}
				}
			});
			comboBoxPosicion.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Primera base", "Segunda base", "Tercera base", "Short Stop", "Left Field", "Center Field", "Right Field", "Catcher"}));
			comboBoxPosicion.setBounds(81, 58, 118, 20);
			panelCentro.add(comboBoxPosicion);
			
			textFieldNombre = new JTextField();
			textFieldNombre.setBounds(81, 23, 118, 20);
			panelCentro.add(textFieldNombre);
			textFieldNombre.setColumns(10);
			
			JLabel lblNacimiento = new JLabel("Naciemiento :");
			lblNacimiento.setBounds(211, 26, 94, 14);
			panelCentro.add(lblNacimiento);
			
			JLabel lblBT = new JLabel("BT :");
			lblBT.setBounds(211, 61, 94, 14);
			panelCentro.add(lblBT);
			
			JLabel lblDisponible = new JLabel("Disponible :");
			lblDisponible.setBounds(211, 99, 94, 14);
			panelCentro.add(lblDisponible);
			
			JLabel lblPais = new JLabel("Pais :");
			lblPais.setBounds(211, 138, 94, 14);
			panelCentro.add(lblPais);
			
			JLabel lblEquipo = new JLabel("Equipo :");
			lblEquipo.setBounds(211, 176, 94, 14);
			panelCentro.add(lblEquipo);
			
			comboBoxPais = new JComboBox();
			comboBoxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Afganist\\u00E1n", "Akrotiri", "Albania", "Alemania", "Andorra", "Angola", "Anguila", "Ant\\u00E1rtida", "Antigua y Barbuda", "Antillas Neerlandesas", "Arabia Saud\\u00ED", "Arctic Ocean", "Argelia", "Argentina", "Armenia", "Aruba", "Ashmore andCartier Islands", "Atlantic Ocean", "Australia", "Austria", "Azerbaiy\\u00E1n", "Bahamas", "Bahr\\u00E1in", "Bangladesh", "Barbados", "B\\u00E9lgica", "Belice", "Ben\\u00EDn", "Bermudas", "Bielorrusia", "Birmania Myanmar ", "Bolivia", "Bosnia y Hercegovina", "Botsuana", "Brasil", "Brun\\u00E9i", "Bulgaria", "Burkina Faso", "Burundi", "But\\u00E1n", "Cabo Verde", "Camboya", "Camer\\u00FAn", "Canad\\u00E1", "Chad", "Chile", "China", "Chipre", "Clipperton Island", "Colombia", "Comoras", "Congo", "Coral Sea Islands", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dhekelia", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "El Vaticano", "Emiratos \\u00C1rabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "Espa\\u00F1a", "Estados Unidos", "Estonia", "Etiop\\u00EDa", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gab\\u00F3n", "Gambia", "Gaza Strip", "Georgia", "Ghana", "Gibraltar", "Granada", "Grecia", "Groenlandia", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea Ecuatorial", "Guinea-Bissau", "Guyana", "Hait\\u00ED", "Honduras", "Hong Kong", "Hungr\\u00EDa", "India", "Indian Ocean", "Indonesia", "Ir\\u00E1n", "Iraq", "Irlanda", "Isla Bouvet", "Isla Christmas", "Isla Norfolk", "Islandia", "Islas Caim\\u00E1n", "Islas Cocos", "Islas Cook ", "Islas Feroe", "Islas Heard y McDonald", "Islas Malvinas", "Islas Marianas del Norte", "IslasMarshall", "Islas Pitcairn", "Islas Salom\\u00F3n", "Islas Turcas y Caicos", "Islas V\\u00EDrgenes Americanas", "Islas V\\u00EDrgenes Brit\\u00E1nicas", "Israel", "Italia", "Jamaica", "Jan Mayen", "Jap\\u00F3n", "Jersey", "Jordania", "Kazajist\\u00E1n", "Kenia", "Kirguizist\\u00E1n", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "L\\u00EDbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macao", "Macedonia", "Madagascar", "Malasia", "Malaui", "Maldivas", "Mal\\u00ED", "Malta", "Man, Isle of", "Marruecos", "Mauricio", "Mauritania", "Mayotte", "M\\u00E9xico", "Micronesia", "Moldavia", "M\\u00F3naco", "Mongolia", "Montserrat", "Mozambique", "Namibia", "Nauru", "Navassa Island", "Nepal", "Nicaragua", "N\\u00EDger", "Nigeria", "Niue", "Noruega", "Nueva Caledonia", "Nueva Zelanda", "Om\\u00E1n", "Pacific Ocean", "Pa\\u00EDses Bajos", "Pakist\\u00E1n", "Palaos", "Panam\\u00E1", "Pap\\u00FAa-Nueva Guinea", "Paracel Islands", "Paraguay", "Per\\u00FA", "Polinesia Francesa", "Polonia", "Portugal", "Puerto Rico", "Qatar ", "Reino Unido", "Rep\\u00FAblica Centroafricana", "Rep\\u00FAblica Checa", "Rep. Democr\\u00E1tica del Congo", "Rep\\u00FAblica Dominicana", "Ruanda", "Rumania", "Rusia ", "S\\u00E1hara Occidental", "Samoa", "Samoa Americana", "San Crist\\u00F3bal y Nieves", "San Marino", "San Pedro y Miquel\\u00F3n", "Santa Helena", "Santa Luc\\u00EDa", "Santo Tom\\u00E9 y Pr\\u00EDncipe", "Senegal", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Southern Ocean", "Spratly Islands", "Sri Lanka", "Suazilandia", "Sud\\u00E1frica", "Sud\\u00E1n", "Suecia", "Suiza", "Surinam", "Svalbard y Jan Mayen", "Tailandia", "Taiw\\u00E1n", "Tanzania", "Tayikist\\u00E1n", "Timor Oriental", "Togo", "Tokelau", "Tonga", "Trinidad y Tobago", "T\\u00FAnez", "Turkmenist\\u00E1n", "Turqu\\u00EDa", "Tuvalu", "Ucrania", "Uganda", "Uni\\u00F3n Europea", "Uruguay ", "Uzbekist\\u00E1n", "Vanuatu", "Venezuela", "Vietnam", "Wake Island", "Wallis y Futuna", "Yemen", "Yibuti", "Zambia", "Zimbabue ", "\t\t\t"}));
			comboBoxPais.setBounds(315, 135, 97, 20);
			panelCentro.add(comboBoxPais);
			
			comboBoxDisponible = new JComboBox();
			comboBoxDisponible.setModel(new DefaultComboBoxModel(new String[] {"Si", "No"}));
			comboBoxDisponible.setBounds(315, 96, 97, 20);
			panelCentro.add(comboBoxDisponible);
			
			comboBoxBT = new JComboBox();
			comboBoxBT.setModel(new DefaultComboBoxModel(new String[] {"R/R", "L/L", "L/R", "R/L", "A/R", "A/L"}));
			comboBoxBT.setBounds(315, 58, 97, 20);
			panelCentro.add(comboBoxBT);
			
			for (Equipo equipo : AdmTorneo.getInstancia().getMisEquipos()) {
				equipos.add(equipo.getNombre());
			}
			comboBoxEquipo = new JComboBox(equipos.toArray());
			comboBoxEquipo.setBounds(315, 173, 97, 20);
			panelCentro.add(comboBoxEquipo);
			
			dateChooser = new JDateChooser();
			dateChooser.setBounds(315, 26, 97, 20);
			panelCentro.add(dateChooser);
		}
		
		panelTipo = new JPanel();
		panelTipo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo de Jugador", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelTipo.setBounds(5, 218, 610, 43);
		contentPanel.add(panelTipo);
		panelTipo.setLayout(null);
		
		{
			
			rdbtnBateador = new JRadioButton("Bateador");
			rdbtnBateador.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnBateador.setSelected(true);
					rdbtnLanzador.setSelected(false);
					panelLanzador.setVisible(false);
					panelBateador.setVisible(true);
					
				}
			});
			rdbtnBateador.setBounds(118, 13, 109, 23);
			panelTipo.add(rdbtnBateador);
			rdbtnBateador.setSelected(true);
			
			rdbtnLanzador = new JRadioButton("Lanzador");
			rdbtnLanzador.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnLanzador.setSelected(true);
					rdbtnBateador.setSelected(false);
					panelLanzador.setVisible(true);
					panelBateador.setVisible(false);
					indice = comboBoxPosicion.getSelectedIndex();
					if(indice==9) {
					comboBoxPosicion.setSelectedItem(9);
					}else {
					 comboBoxPosicion.addItem("Pitcher");
					 comboBoxPosicion.setSelectedItem(9);
					}
					//comboBoxPosicion.addItem("Pitcher");
				}
			});
			rdbtnLanzador.setBounds(350, 13, 109, 23);
			panelTipo.add(rdbtnLanzador);
		
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Guardar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						//informacion general
						String nombre = textFieldNombre.getText();
						String posicion = comboBoxPosicion.getSelectedItem().toString();
						String pais = comboBoxPais.getSelectedItem().toString();
						String equipo = comboBoxEquipo.getSelectedItem().toString();
						Date date = dateChooser.getDate();
						Calendar calcular =Calendar.getInstance();
						int numero = Integer.parseInt(spinnerNumero.getValue().toString());
						float estatura = Float.parseFloat(spinnerEstatura.getValue().toString());
						float peso = Float.parseFloat(spinnerPeso.getValue().toString());
						String diponibilidad = comboBoxDisponible.getSelectedItem().toString();
						boolean disp=true;
						String BT = comboBoxBT.getSelectedItem().toString();
						boolean validarnum=false;
						
						if(modificar == false) {
							validarnum =AdmTorneo.getInstancia().encontrarNumJug(AdmTorneo.getInstancia().encontrarEquipo(equipo), numero);
						}

						if(validarnum) {
							JOptionPane.showMessageDialog(null, "Existe un jugador con este número.", "Advertencia", JOptionPane.WARNING_MESSAGE);
						}
						else if(dateChooser.getCalendar().get(Calendar.YEAR) >= calcular.get(Calendar.YEAR) || 
								(calcular.get(Calendar.YEAR) - dateChooser.getCalendar().get(Calendar.YEAR)) < 16) {
							
							JOptionPane.showMessageDialog(null, "Debe ingresar un jugador mayor o igual a 16 años", "Advertencia", JOptionPane.WARNING_MESSAGE);
						}
						else {

							 if(!nombre.equalsIgnoreCase("") && !posicion.equalsIgnoreCase("<Seleccionar>") && !pais.equalsIgnoreCase("<Seleccionar>") && !equipo.equalsIgnoreCase("") 
									&&( date!=null) && (estatura !=0) && (peso!=0) && numero!=0 && !validarnum) {
								
								if(diponibilidad.equalsIgnoreCase("si")) {
									disp=true;
								}else {
									disp=false;	
								}
								
								if(rdbtnLanzador.isSelected()) {
									//Estadistica Lanzador
									int GPpict,ERpict,Hpict,Ppict,Gpict,GSpict,HRpict,CLpict,BBpict,Kpict;
									GPpict=Integer.parseInt( spinnerGpitch.getValue().toString());
									ERpict=Integer.parseInt( spinnerERpitch.getValue().toString());
									Hpict=Integer.parseInt( spinnerHpitch.getValue().toString());
									Ppict=Integer.parseInt( spinnerHpitch.getValue().toString());
									Gpict=Integer.parseInt( spinnerGpitch.getValue().toString());
									HRpict=Integer.parseInt( spinnerHRpitch.getValue().toString());
									CLpict=Integer.parseInt( spinnerCL.getValue().toString());
									BBpict=Integer.parseInt( spinnerBB.getValue().toString());
									Kpict=Integer.parseInt( spinnerKpitch.getValue().toString());
									GSpict=Integer.parseInt( spinnerGSpitch.getValue().toString());
																
									EstLanzador miEst = new EstLanzador(GSpict, Hpict, ERpict, CLpict, HRpict, BBpict, Kpict, Gpict, Ppict, GPpict);
									Lanzador pitcher = new Lanzador(nombre, posicion, numero, estatura, peso, date, BT, disp, pais, equipo, miEst);
									if(modificar) {
										AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().set(MiJugador, pitcher);
										AdmTorneo.getInstancia().GuardarInfo(AdmTorneo.getInstancia());
										
										if(imgjug.exists()) {
											try {
												imagen = ImageIO.read(imgjug);
												imgjug.delete();
												imgjug = new File("imgjugadores/" + AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getNombre() + ".png");
												ImageIO.write(imagen, "png", new File(imgjug.toString()));
											} catch (IOException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
										}
										
										JOptionPane.showMessageDialog(null, "Se modificó el jugador con exito.");
										dispose();
									}else {
										int input;
										AdmTorneo.getInstancia().getMisEquipos().get(comboBoxEquipo.getSelectedIndex()).getMisJugadores().add(pitcher);
										AdmTorneo.getInstancia().GuardarInfo(AdmTorneo.getInstancia());
										JOptionPane.showMessageDialog(null, "Se registró el jugador con exito.");
										input = JOptionPane.showConfirmDialog(null, "¿Desea registrar otro jugador?","Confirmación",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
										
										if(input == 0) {
											LimpiarCampos();
										}
										else {
											dispose();
										}
										
									}
									
									}
									if(rdbtnBateador.isSelected()) {
									//Estadistica Bateador
									int GP,AB,H,R,B2,B3,HR,RBI,TB,BB,K,SB,DP;
									GP=Integer.parseInt( spinnerGP.getValue().toString());
									AB=Integer.parseInt( spinnerAB.getValue().toString());
									H=Integer.parseInt( spinnerH.getValue().toString());
									R=Integer.parseInt( spinnerR.getValue().toString());
									B2=Integer.parseInt( spinner2B.getValue().toString());
									B3=Integer.parseInt( spinner3B.getValue().toString());
									HR=Integer.parseInt( spinnerHR.getValue().toString());
									RBI=Integer.parseInt( spinnerRBI.getValue().toString());
									TB=Integer.parseInt( spinnerTB.getValue().toString());
									BB=Integer.parseInt( spinnerBB.getValue().toString());
									K=Integer.parseInt( spinnerK.getValue().toString());
									SB=Integer.parseInt( spinnerSB.getValue().toString());
									DP=Integer.parseInt( spinnerDP.getValue().toString());
									
									EstBateador miEst = new EstBateador(GP, AB, H, B2, B3, HR, TB, RBI, R, BB, K, SB, 0, DP, 0); 
									Bateador bateador = new Bateador(nombre, posicion, numero, estatura, peso, date, BT, disp, pais, equipo, miEst);
									if(AB > 0 && H > 0) {
										bateador.controlarDesempeno(H, AB);
										}
									if(modificar) {
										AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().set(MiJugador, bateador);
										AdmTorneo.getInstancia().GuardarInfo(AdmTorneo.getInstancia());
										
										if(imgjug.exists()) {
											try {
												imagen = ImageIO.read(imgjug);
												imgjug.delete();
												imgjug = new File("imgjugadores/" + AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getNombre() + ".png");
												ImageIO.write(imagen, "png", new File(imgjug.toString()));
											} catch (IOException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
										}
										
										JOptionPane.showMessageDialog(null, "Se modificó el jugador con exito.");
										dispose();
									}else {
										int input;
										AdmTorneo.getInstancia().getMisEquipos().get(comboBoxEquipo.getSelectedIndex()).getMisJugadores().add(bateador);
										AdmTorneo.getInstancia().GuardarInfo(AdmTorneo.getInstancia());
										JOptionPane.showMessageDialog(null, "Se registró el jugador con exito.");
										input = JOptionPane.showConfirmDialog(null, "¿Desea registrar otro jugador?","Confirmación",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
										
										if(input == 0) {
											LimpiarCampos();
										}
										else {
											dispose();
										}
										
									}
									}
								
							}else {
								
								JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
							}
						}
					
					}

					private void LimpiarCampos() {
						// TODO Auto-generated method stub
						textFieldNombre.setText("");
						spinnerEstatura.setValue(170);
						spinnerPeso.setValue(65);
						spinnerNumero.setValue(0);
						
						spinnerBB.setValue(0); 
						spinner2B.setValue(0);
						spinner3B.setValue(0);
						spinnerGP.setValue(0);
						spinnerAB.setValue(0);
						spinnerH.setValue(0);
						spinnerHR.setValue(0);
						spinnerRBI.setValue(0);
						spinnerTB.setValue(0);
						spinnerK.setValue(0);
						spinnerSB.setValue(0);
						spinnerDP.setValue(0);
						spinnerR.setValue(0); 
						
						spinnerHpitch.setValue(0);
						spinnerCL.setValue(0);
						spinnerPpitch.setValue(0);
						spinnerGpitch.setValue(0);
						spinnerGSpitch.setValue(0);
						spinnerHRpitch.setValue(0);
						spinnerBBpitch.setValue(0);
						spinnerKpitch.setValue(0);
						spinnerGPpitch.setValue(0);
						spinnerERpitch.setValue(0);
						
						dateChooser.setDate(null);
						
						comboBoxPosicion.setSelectedItem(0);;
						comboBoxPais.setSelectedItem(0);
						comboBoxDisponible.setSelectedItem(0);
						comboBoxBT.setSelectedItem(0);
						comboBoxEquipo.setSelectedItem(0);
						
						
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			
			if(modificar == true) {
				ModificarJugador();
			}
		}
	}

	private void ModificarJugador() {
		// TODO Auto-generated method stub
		
		//Informacion general
		
		textFieldNombre.setText(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getNombre());
		comboBoxPosicion.setSelectedItem(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getPosicion());;
		comboBoxPais.setSelectedItem(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getPaisOrigen());
		comboBoxEquipo.setSelectedItem(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getEquipo());
		dateChooser.setDate(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getNacimiento());
		spinnerNumero.setValue(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getNumero());
		spinnerEstatura.setValue(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getEstatura());
		spinnerPeso.setValue(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getPeso());
		if(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).isDisponible()==true) {
			comboBoxDisponible.setSelectedItem("Si");
		}else {
			comboBoxDisponible.setSelectedItem("No");
		}
		comboBoxBT.setSelectedItem(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador).getBt());
		comboBoxEquipo.setEnabled(false);
		
		Jugador player = AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador);
		
		if(AdmTorneo.getInstancia().getMisEquipos().get(MiEquipo).getMisJugadores().get(MiJugador) instanceof Bateador) {
			//Informacion Bateador
			rdbtnLanzador.setSelected(false);
			rdbtnBateador.setSelected(true);
			panelLanzador.setVisible(false);
			panelBateador.setVisible(true);
			spinnerBB.setValue(((Bateador) player).getMiEstadistica().getBasePorBola()); 
			spinner2B.setValue(((Bateador) player).getMiEstadistica().getDoblesConectados());
			spinner3B.setValue(((Bateador) player).getMiEstadistica().getTriplesConectados());
			spinnerGP.setValue(((Bateador) player).getMiEstadistica().getJuegosJugados());
			spinnerAB.setValue(((Bateador) player).getMiEstadistica().getTurnos());
			spinnerH.setValue(((Bateador) player).getMiEstadistica().getHitsConectados());
			spinnerHR.setValue(((Bateador) player).getMiEstadistica().getHomeRun());
			spinnerRBI.setValue(((Bateador) player).getMiEstadistica().getCarrerasRemontadas());
			spinnerTB.setValue(((Bateador) player).getMiEstadistica().getBasesAlcanzadas());
			spinnerK.setValue(((Bateador) player).getMiEstadistica().getPonches());
			spinnerSB.setValue(((Bateador) player).getMiEstadistica().getBasesRobadas());
			spinnerDP.setValue(((Bateador) player).getMiEstadistica().getDoblePlay());
			spinnerR.setValue(((Bateador) player).getMiEstadistica().getCarreras()); 
			
		}else {
			//Informacion Lanzador
			rdbtnLanzador.setSelected(true);
			rdbtnBateador.setSelected(false);
			panelLanzador.setVisible(false);
			panelBateador.setVisible(true);
			spinnerHpitch.setValue(((Lanzador) player).getMiEstadistica().getHitsPitch());
			spinnerCL.setValue(((Lanzador) player).getMiEstadistica().getCarrLimpias()); 
			spinnerPpitch.setValue(((Lanzador) player).getMiEstadistica().getDer());
			spinnerGpitch.setValue(((Lanzador) player).getMiEstadistica().getVict());
			spinnerGSpitch.setValue(((Lanzador) player).getMiEstadistica().getJuegosIni());
			spinnerHRpitch.setValue(((Lanzador) player).getMiEstadistica().getJonronPitch());
			spinnerBBpitch.setValue(((Lanzador) player).getMiEstadistica().getBBPitch());
			spinnerKpitch.setValue(((Lanzador) player).getMiEstadistica().getPonches());
			spinnerGPpitch.setValue(((Lanzador) player).getMiEstadistica().getEntradasJugadas());
			spinnerERpitch.setValue(((Lanzador) player).getMiEstadistica().getCarrPitch());
			
			
		}

		
	}

}
