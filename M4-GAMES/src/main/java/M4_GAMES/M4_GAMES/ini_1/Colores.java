package M4_GAMES.M4_GAMES.ini_1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Panel;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import M4_GAMES.M4_GAMES.Seleccionar_colores;

public class Colores {
private static Panel[] panelSolucion = null;
private static int VALOR_DEFAULT_DIFICULTAD = 4;
private static int VALOR_INTENTOS_DEFAULT = 10;
	
	private static Color colores_disponibles[];
	private Color[] solucion_colores;
	public int dificultad;
	private int principio;
	private int intentos;
	private int principi;
	private int altura;
	private int num_intentos;
	private boolean acabado;
	
	
	public Colores(int dificultad) {
		this.dificultad=dificultad;
		if(dificultad > 4 && dificultad <= 6) {
			this.colores_disponibles= new Color[dificultad];
			this.solucion_colores = new Color[dificultad];
			if(dificultad==5) this.intentos=8;
			if(dificultad == 6) this.intentos=6;
			
		}else {
			this.colores_disponibles = new Color[VALOR_DEFAULT_DIFICULTAD];
			this.solucion_colores = new Color[VALOR_DEFAULT_DIFICULTAD];
			this.intentos = VALOR_INTENTOS_DEFAULT;
		}
		
		this.principio=525;
		this.principi=315;
		this.altura=35;
		this.num_intentos = 0;
		this.acabado=false;
		this.panelSolucion = new Panel[dificultad];
	}
	
	public Colores (Color lista_colores[], int dificultad) {
		this.dificultad=dificultad;
		if(dificultad > 4 && dificultad <= 6) {
			this.colores_disponibles= lista_colores;
			this.solucion_colores = new Color[dificultad];
			if(dificultad==5) this.intentos=8;
			if(dificultad == 6) this.intentos=6;
		}else {
			this.colores_disponibles= lista_colores;
			this.solucion_colores = new Color[VALOR_DEFAULT_DIFICULTAD];
			this.intentos = VALOR_INTENTOS_DEFAULT;
		}
		
		this.principio=525;
		this.principi=315;
		this.altura=35;
		this.num_intentos = 0;
		this.acabado=false;
		this.panelSolucion = new Panel[dificultad];
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
	
	public void imprimir_colores(JPanel contentPane) {
		for(int i=0;i<dificultad;i++) {
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
			panelSolucion[i] = new Panel();
            panelSolucion[i].setBounds(principio, 150, 20, 20);
            panelSolucion[i].setBackground(solucion_colores[i]);
            panelSolucion[i].setVisible(false);
            this.principio=principio+35;
            contentPane.add(panelSolucion[i]);
            
        }
    }
	
	public void comprobar_aciertos(JPanel contentPane, JPanel colores) {
		this.num_intentos++;
		boolean trobat=false;
		boolean iguals = false;
		boolean fet=false;
		int acertada=0;
		
		
		if(num_intentos == this.intentos) {
			JOptionPane.showMessageDialog(contentPane, "Has llegado al limite de intentos!");
			return;
		}
		
		for(int i = 0; i < dificultad; i++) {
			for(int j = 0; j < dificultad; j++) {
				if((solucion_colores[i].equals(colores.getComponent(j).getBackground()))&&(fet==false)){
					trobat = true;
					if(i==j) {
						iguals = true;
					}
				}
			}
				if((trobat)&&(iguals)&&(fet==false)) {
					Panel aux1 = new Panel();
					aux1.setBounds(principi, altura, 20, 20);
					aux1.setBackground(Color.BLACK);
					contentPane.add(aux1);
					principi = principi + 25;
					acertada++;
					trobat=false;
					fet=true;
					
				}
				
				if((trobat)&&(iguals == false)&&(fet==false)){
					Panel aux1 = new Panel();
					aux1.setBounds(principi, altura, 20, 20);
					aux1.setBackground(Color.WHITE);
					contentPane.add(aux1);
					principi = principi + 25;
					trobat=false;
					fet = true;
				}
				iguals = false;
				fet = false;
				if( acertada==this.dificultad ) {
					for (int k = 0; k < panelSolucion.length; k++) {
						panelSolucion[k].setVisible(true);
					}
					JOptionPane.showMessageDialog(contentPane, "Enhorabuena, has ganado!");
					acabado=true;
					return;
				}
		}
		principi = 315;
		altura = altura + 36;
	}
			
	public boolean comprovarIntentos() {
		if(this.num_intentos==this.intentos) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	public boolean isAcabado() {
		return acabado;
	}

	public int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
	
	public static Color[] getColores() {
		return colores_disponibles;
	}
  
}
