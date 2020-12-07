package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Button;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class RegistrarJugador extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarJugador dialog = new RegistrarJugador();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarJugador() {
		setEnabled(false);
		setBounds(100, 100, 634, 440);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelEste = new JPanel();
			panelEste.setBounds(437, 5, 178, 213);
			panelEste.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cargar Imagen 2x2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			contentPanel.add(panelEste);
			panelEste.setLayout(null);
			
			JButton btnSubirImagen = new JButton("Subir");
			btnSubirImagen.setBounds(66, 179, 57, 23);
			panelEste.add(btnSubirImagen);
			
			JLabel lblSubirImagen = new JLabel("");
			lblSubirImagen.setBounds(10, 22, 158, 131);
			panelEste.add(lblSubirImagen);
		}
		{
			JPanel panelBateador = new JPanel();
			panelBateador.setBounds(5, 270, 610, 98);
			panelBateador.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Estadistica Bateador", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			contentPanel.add(panelBateador);
			panelBateador.setLayout(null);
			
			JLabel lblGP = new JLabel("GP:");
			lblGP.setBounds(10, 29, 17, 14);
			panelBateador.add(lblGP);
			
			JSpinner spinnerGP = new JSpinner();
			spinnerGP.setBounds(37, 26, 39, 20);
			panelBateador.add(spinnerGP);
			
			JLabel lblAB = new JLabel("AB:");
			lblAB.setBounds(86, 29, 29, 14);
			panelBateador.add(lblAB);
			
			JSpinner spinnerAB = new JSpinner();
			spinnerAB.setBounds(111, 26, 39, 20);
			panelBateador.add(spinnerAB);
			
			JLabel lblH = new JLabel("H:");
			lblH.setBounds(165, 29, 17, 14);
			panelBateador.add(lblH);
			
			JSpinner spinnerH = new JSpinner();
			spinnerH.setBounds(192, 26, 39, 20);
			panelBateador.add(spinnerH);
			
			JLabel lblR = new JLabel("R:");
			lblR.setBounds(241, 29, 29, 14);
			panelBateador.add(lblR);
			
			JSpinner spinnerR = new JSpinner();
			spinnerR.setBounds(266, 26, 39, 20);
			panelBateador.add(spinnerR);
			
			JLabel lblb = new JLabel("2B:");
			lblb.setBounds(315, 29, 17, 14);
			panelBateador.add(lblb);
			
			JSpinner spinner2B = new JSpinner();
			spinner2B.setBounds(342, 26, 39, 20);
			panelBateador.add(spinner2B);
			
			JLabel lblb_1 = new JLabel("3B:");
			lblb_1.setBounds(391, 29, 29, 14);
			panelBateador.add(lblb_1);
			
			JSpinner spinner3B = new JSpinner();
			spinner3B.setBounds(416, 26, 39, 20);
			panelBateador.add(spinner3B);
			
			JLabel lblHr = new JLabel("HR:");
			lblHr.setBounds(460, 29, 29, 14);
			panelBateador.add(lblHr);
			
			JSpinner spinnerHR = new JSpinner();
			spinnerHR.setBounds(487, 26, 39, 20);
			panelBateador.add(spinnerHR);
			
			JLabel lblRbi = new JLabel("RBI:");
			lblRbi.setBounds(536, 29, 29, 14);
			panelBateador.add(lblRbi);
			
			JSpinner spinnerRBI = new JSpinner();
			spinnerRBI.setBounds(561, 26, 39, 20);
			panelBateador.add(spinnerRBI);
			
			JLabel lblTb = new JLabel("TB:");
			lblTb.setBounds(10, 70, 17, 14);
			panelBateador.add(lblTb);
			
			JSpinner spinnerTB = new JSpinner();
			spinnerTB.setBounds(37, 67, 39, 20);
			panelBateador.add(spinnerTB);
			
			JLabel lblBb = new JLabel("BB:");
			lblBb.setBounds(86, 70, 29, 14);
			panelBateador.add(lblBb);
			
			JSpinner spinnerBB = new JSpinner();
			spinnerBB.setBounds(111, 67, 39, 20);
			panelBateador.add(spinnerBB);
			
			JLabel lblK = new JLabel("K:");
			lblK.setBounds(165, 70, 17, 14);
			panelBateador.add(lblK);
			
			JSpinner spinnerK = new JSpinner();
			spinnerK.setBounds(192, 67, 39, 20);
			panelBateador.add(spinnerK);
			
			JLabel lblSb = new JLabel("SB:");
			lblSb.setBounds(241, 70, 29, 14);
			panelBateador.add(lblSb);
			
			JSpinner spinnerSB = new JSpinner();
			spinnerSB.setBounds(266, 67, 39, 20);
			panelBateador.add(spinnerSB);
			
			JLabel lblDp = new JLabel("DP:");
			lblDp.setBounds(315, 70, 17, 14);
			panelBateador.add(lblDp);
			
			JSpinner spinnerDP = new JSpinner();
			spinnerDP.setBounds(342, 67, 39, 20);
			panelBateador.add(spinnerDP);
		}
		{
			JPanel panelCentro = new JPanel();
			panelCentro.setBorder(new TitledBorder(null, "Informacion Principal", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelCentro.setBounds(5, 5, 422, 213);
			contentPanel.add(panelCentro);
			panelCentro.setLayout(null);
			
			JLabel lblNombre = new JLabel("Nombre :");
			lblNombre.setBounds(10, 26, 46, 14);
			panelCentro.add(lblNombre);
			
			JLabel lblPosicion = new JLabel("Posicion :");
			lblPosicion.setBounds(10, 61, 46, 14);
			panelCentro.add(lblPosicion);
			
			JLabel lblNumero = new JLabel("Numero :");
			lblNumero.setBounds(10, 99, 46, 14);
			panelCentro.add(lblNumero);
			
			JLabel lblEstatura = new JLabel("Estatura :");
			lblEstatura.setBounds(10, 138, 56, 14);
			panelCentro.add(lblEstatura);
			
			JLabel lblPeso = new JLabel("Peso :");
			lblPeso.setBounds(10, 176, 56, 14);
			panelCentro.add(lblPeso);
			
			JSpinner spinnerEstatura = new JSpinner();
			spinnerEstatura.setBounds(76, 135, 56, 20);
			panelCentro.add(spinnerEstatura);
			
			JSpinner spinnerPeso = new JSpinner();
			spinnerPeso.setBounds(76, 173, 56, 20);
			panelCentro.add(spinnerPeso);
			
			JSpinner spinnerNumero = new JSpinner();
			spinnerNumero.setBounds(76, 96, 56, 20);
			panelCentro.add(spinnerNumero);
			
			JComboBox comboBoxPosicion = new JComboBox();
			comboBoxPosicion.setBounds(76, 58, 86, 20);
			panelCentro.add(comboBoxPosicion);
			
			textFieldNombre = new JTextField();
			textFieldNombre.setBounds(76, 23, 86, 20);
			panelCentro.add(textFieldNombre);
			textFieldNombre.setColumns(10);
			
			JLabel lblEdad = new JLabel("Edad :");
			lblEdad.setBounds(211, 26, 46, 14);
			panelCentro.add(lblEdad);
			
			JLabel lblBT = new JLabel("BT :");
			lblBT.setBounds(211, 61, 46, 14);
			panelCentro.add(lblBT);
			
			JLabel lblDisponible = new JLabel("Disponible :");
			lblDisponible.setBounds(211, 99, 56, 14);
			panelCentro.add(lblDisponible);
			
			JLabel lblPais = new JLabel("Pais :");
			lblPais.setBounds(211, 138, 46, 14);
			panelCentro.add(lblPais);
			
			JLabel lblEquipo = new JLabel("Equipo :");
			lblEquipo.setBounds(211, 176, 46, 14);
			panelCentro.add(lblEquipo);
			
			JComboBox comboBoxPais = new JComboBox();
			comboBoxPais.setBounds(267, 135, 86, 20);
			panelCentro.add(comboBoxPais);
			
			JComboBox comboBoxDisponible = new JComboBox();
			comboBoxDisponible.setBounds(267, 96, 86, 20);
			panelCentro.add(comboBoxDisponible);
			
			JSpinner spinner = new JSpinner();
			spinner.setBounds(267, 23, 56, 20);
			panelCentro.add(spinner);
			
			JComboBox comboBoxBT = new JComboBox();
			comboBoxBT.setBounds(267, 58, 86, 20);
			panelCentro.add(comboBoxBT);
			
			JComboBox comboBoxEquipo = new JComboBox();
			comboBoxEquipo.setBounds(267, 173, 86, 20);
			panelCentro.add(comboBoxEquipo);
		}
		
		JPanel panelLanzador = new JPanel();
		panelLanzador.setBorder(new TitledBorder(null, "Estadistica Lanzador", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelLanzador.setBounds(5, 270, 610, 98);
		contentPanel.add(panelLanzador);
		
		JPanel panelTipo = new JPanel();
		panelTipo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo de Jugador", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelTipo.setBounds(5, 218, 610, 43);
		contentPanel.add(panelTipo);
		panelTipo.setLayout(null);
		
		JRadioButton rdbtnBateador = new JRadioButton("Bateador");
		rdbtnBateador.setBounds(118, 13, 109, 23);
		panelTipo.add(rdbtnBateador);
		
		JRadioButton rdbtnLanzador = new JRadioButton("Lanzador");
		rdbtnLanzador.setBounds(350, 13, 109, 23);
		panelTipo.add(rdbtnLanzador);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
