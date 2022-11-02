package M4_GAMES.M4_GAMES;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import M4_GAMES.M4_GAMES.ini_1.Colores;

import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Seleccionar_colores extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Colores aux;
	private Color color;
	final Color lista_color[]= new Color[Seleccionar_nivel.getDificultad()];
	private int posicion=0;
	



	/**
	 * Create the frame.
	 */
	public Seleccionar_colores() {
		setTitle("Opciones del juego");
		setDefaultCloseOperation(Seleccionar_colores.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 236);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		objeto(contentPane);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_aceptar = new JButton("Aceptar");
		btn_aceptar.setBounds(98, 148, 89, 23);
		contentPane.add(btn_aceptar);
		
		JButton btn_cancelar = new JButton("Cancelar");
		btn_cancelar.setBounds(249, 148, 89, 23);
		contentPane.add(btn_cancelar);
		
		//EVENTOS
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
	
			}
		});
		
		btn_aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				dispose();
				Panel_Base frame = new Panel_Base(lista_color);
				frame.setVisible(true);
			}
		});
	}
	
	public void objeto(JPanel contentPane) {
		int principio=50;
		
		
		this.aux = new Colores(Seleccionar_nivel.getDificultad());
		

		for(int i=0;i<Seleccionar_nivel.getDificultad();i++) {

			final Panel panel = new Panel();
			panel.setBounds(principio, 50, 50, 50);
			panel.setBackground(Color.WHITE);
			principio=principio+60;
			panel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					color=JColorChooser.showDialog(null, "Color", Color.WHITE);
	                panel.setBackground(color);
	                lista_color[posicion]=color;
					posicion++;

				}
			});
			
			
			contentPane.add(panel);
		}
		
	}

	public Color[] getLista_color() {
		return lista_color;
	}
	
	
	
}
