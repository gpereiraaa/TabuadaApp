package br.dev.gustavo_pereira.calculadora_tabuada.model;

import javax.swing.JList;

public class Tabuada {

	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}

	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}

	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}

	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}
	
	
	public String[] mostrarTabuada() {
		
		int tamanho = (int) (maximoMultiplicador - minimoMultiplicador + 1);
		
		String[] tabuada = new String[tamanho];
		
		int indice = 0;
		while (minimoMultiplicador <= maximoMultiplicador ) {
			double produto = multiplicando * minimoMultiplicador;			
			tabuada[indice] = multiplicando + " X " + minimoMultiplicador + " = " + produto;
			
			minimoMultiplicador++;
			indice++;
		 
		}
		
		return tabuada; 
	}
	
	}
	