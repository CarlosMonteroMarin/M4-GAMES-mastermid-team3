package M4_GAMES.M4_GAMES;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;


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

		Seleccionar_nivel frame1 = new Seleccionar_nivel();
		frame1.setVisible(true);
		

		this.aux = new Colores(Seleccionar_nivel.getDificultad());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	

		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
    
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 267, 429);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel objeto_comprobar = new JPanel();
		objeto_comprobar.setBounds(22, 11, 216, 43);
		panel.add(objeto_comprobar);
		objeto_comprobar.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		Panel color_1 = new Panel();
		color_1.setBounds(10, 10, 20, 20);
		color_1.setBackground(Color.WHITE);
		
		JButton btn_comprobar_1 = new JButton("Comprobar");
		btn_comprobar_1.setBounds(121, 10, 85, 23);
		objeto_comprobar.setLayout(null);
		objeto_comprobar.add(color_1);
		objeto_comprobar.add(btn_comprobar_1);
		
		Panel color_2 = new Panel();
		color_2.setBackground(Color.WHITE);
		color_2.setBounds(36, 10, 20, 20);
		objeto_comprobar.add(color_2);
		
		Panel color_3 = new Panel();
		color_3.setBackground(Color.WHITE);
		color_3.setBounds(62, 10, 20, 20);
		objeto_comprobar.add(color_3);
		
		Panel color_4 = new Panel();
		color_4.setBackground(Color.WHITE);
		color_4.setBounds(88, 10, 20, 20);
		objeto_comprobar.add(color_4);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(5, 5, 5, 5));
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu apartado_menu_archivo = new JMenu("Archivo");
		menuBar.add(apartado_menu_archivo);
		
		JMenuItem item_achivo_nuevojuego = new JMenuItem("Nuevo Juego");
		apartado_menu_archivo.add(item_achivo_nuevojuego);
		
		JMenuItem item_archivo_salir = new JMenuItem("Salir");
		apartado_menu_archivo.add(item_archivo_salir);
		
		JMenu apartado_menu_salir = new JMenu("Ayuda");
		menuBar.add(apartado_menu_salir);
		
		JMenuItem item_ayuda_comojugar = new JMenuItem("Como Jugar");
		apartado_menu_salir.add(item_ayuda_comojugar);
		
		JMenuItem item_ayuda_jugar = new JMenuItem("Acerca De");
		apartado_menu_salir.add(item_ayuda_jugar);

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		Canvas canvas = new Canvas();
		canvas.setBounds(75, 68, 81, 64);
		contentPane.add(canvas);
		

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
