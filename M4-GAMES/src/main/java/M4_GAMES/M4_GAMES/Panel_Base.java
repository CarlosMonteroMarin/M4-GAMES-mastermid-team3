package M4_GAMES.M4_GAMES;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;

public class Panel_Base extends JFrame {
	
	private Color colors;
	private Color colores_disponibles;
	private int dificultad;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Panel_Base() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Colores Disponibles");
		lblNewLabel.setBounds(321, 36, 124, 14);
		contentPane.add(lblNewLabel);
	}
	
	
	
	public void ColoresDisponibles() {
		colors.
	}
}
