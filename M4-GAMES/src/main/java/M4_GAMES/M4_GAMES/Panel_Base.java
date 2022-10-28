package M4_GAMES.M4_GAMES;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import M4_GAMES.M4_GAMES.ini_1.Colores;

import javax.swing.JLabel;
import java.awt.Panel;

public class Panel_Base extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Colores aux;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Panel_Base() {
		this.aux = new Colores(4);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Colores Disponibles");
		lblNewLabel.setBounds(525, 42, 124, 14);
		contentPane.add(lblNewLabel);
		aux.crear_colores(contentPane);
		aux.crear_solucion(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("Solucion");
		lblNewLabel_1.setBounds(525, 129, 124, 14);
		contentPane.add(lblNewLabel_1);
		
	}
}
