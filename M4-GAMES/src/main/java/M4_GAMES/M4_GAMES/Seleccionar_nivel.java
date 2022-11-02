package M4_GAMES.M4_GAMES;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import M4_GAMES.M4_GAMES.ini_1.Colores;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Seleccionar_nivel extends JFrame {

	private static int dificultad;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Seleccionar_nivel() {
		setTitle("Seleccionar nivel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(88, 44, 191, 195);
		contentPane.add(contentPane_1);
		
		JRadioButton rdb_principiante = new JRadioButton("Principiante");
		rdb_principiante.setActionCommand("4");
		rdb_principiante.setBounds(39, 37, 109, 23);
		contentPane_1.add(rdb_principiante);
		
		JRadioButton rdb_medio = new JRadioButton("Medio");
		rdb_medio.setActionCommand("5");
		rdb_medio.setBounds(39, 86, 109, 23);
		contentPane_1.add(rdb_medio);
		
		JRadioButton rdb_avanzado = new JRadioButton("Avanzado");
		rdb_avanzado.setActionCommand("6");
		rdb_avanzado.setBounds(39, 139, 109, 23);
		contentPane_1.add(rdb_avanzado);
		
		final ButtonGroup bgroup =new ButtonGroup();
		bgroup.add(rdb_principiante);
		bgroup.add(rdb_medio);
		bgroup.add(rdb_avanzado);

		JLabel lblNewLabel = new JLabel("Selecciona una dificultad:");
		lblNewLabel.setBounds(10, 0, 191, 14);
		contentPane_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btn_aceptar = new JButton("Aceptar");
		
		btn_aceptar.setBounds(88, 282, 89, 23);
		contentPane.add(btn_aceptar);
		
		JButton btn_cancelar = new JButton("Cancelar");
		
		btn_cancelar.setBounds(190, 282, 89, 23);
		contentPane.add(btn_cancelar);
		
		//EVENTOS
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		btn_aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dificultad = Integer.parseInt(bgroup.getSelection().getActionCommand());
				Panel_Base frame = new Panel_Base();
				frame.setVisible(true);
				dispose();
			}
		});
		
		rdb_principiante.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dificultad=4;
			}
		});
		
		rdb_medio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dificultad=5;
			}
		});
		
		rdb_avanzado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dificultad=6;
			}
		});
		
	}
	
	//getter
	public static int getDificultad() {
		return dificultad;
	}
}
