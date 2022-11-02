package M4_GAMES.M4_GAMES.ini_1;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JPanel;

public class Colores {
private static int VALOR_DEFAULT_DIFICULTAD = 4;
	
	private Color colores_disponibles[];
	private Color[] solucion_colores;
	public int dificultad=0;
	private int principio=0;
	private int intentos;
	
	public Colores(int dificultad) {
		this.dificultad=dificultad;
		if(dificultad > 4 && dificultad <= 6) {
			this.colores_disponibles= new Color[dificultad];
			this.solucion_colores = new Color[dificultad];
		}else {
			this.colores_disponibles = new Color[VALOR_DEFAULT_DIFICULTAD];
			this.solucion_colores = new Color[VALOR_DEFAULT_DIFICULTAD];
			this.intentos = VALOR_DEFAULT_DIFICULTAD;
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
		this.principio = 525;

	}
	
	public void crear_solucion(JPanel contentPane) {
        for (int i=0; i<dificultad; i++) {
			solucion_colores[i] = colores_disponibles[getRandomNumber(0, colores_disponibles.length-1)];
            Panel panel1 = new Panel();
            panel1.setBounds(principio, 150, 20, 20);
            panel1.setBackground(solucion_colores[i]);
            panel1.setVisible(false);
            this.principio=principio+35;
            contentPane.add(panel1);
            
        }
    }
	
	public void comprobar_aciertos(JPanel contentPane, JPanel colores) {
		int principi = 275;
		int lugar_color_solucion=1;
		int lugar_color_actual=1;
		
		for(int i = 0; i < dificultad; i++) {
			for(int j = 0; j < dificultad; j++) {
				if(!(colores.getBackground().equals(Color.white))) {
				if((solucion_colores[i].equals(colores.getComponent(j).getBackground()))&&(lugar_color_solucion == lugar_color_actual)){
					Panel aux = new Panel();
					aux.setBounds(principi, 33, 20, 20);
					aux.setBackground(Color.BLACK);
					contentPane.add(aux);
					lugar_color_actual++;
				}
					if(solucion_colores[i].equals(colores.getComponent(j).getBackground()))
					{
						Panel aux = new Panel();
						aux.setBounds(principi, 33, 20, 20);
						aux.setBackground(Color.WHITE);
						contentPane.add(aux);
						lugar_color_actual++;
					}
						principi = principi + 35;
						lugar_color_solucion++;
				}
			}
		}
			
		
	}
	
	public int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
  
}
