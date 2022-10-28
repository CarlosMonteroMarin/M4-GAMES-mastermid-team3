package M4_GAMES.M4_GAMES.ini_1;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JPanel;

public class Colores {
private static int VALOR_DEFAULT_DIFICULTAD = 4;
	
	private Color colores_disponibles[];
	private int dificultad=0;
	private int principio=0;
	
	public Colores(int dificultad) {
		this.dificultad=dificultad;
		if(dificultad!=4) {
			this.colores_disponibles= new Color[dificultad];
		}else {
			this.colores_disponibles = new Color[VALOR_DEFAULT_DIFICULTAD];
		}
		this.principio=525;
	}
	
	public void crear_colores(JPanel contentPane) {
		for(int i=0;i<dificultad;i++) {
			colores_disponibles[i] = new Color(getRandomNumber(0,255), getRandomNumber(0,255), getRandomNumber(0,255));
			Panel panel = new Panel();
			panel.setBounds(principio, 75, 20, 20);
			panel.setBackground(colores_disponibles[i]);
			this.principio=principio+35;
			contentPane.add(panel);
		}

	}
	
	
	
	
	
	
	public int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
}
