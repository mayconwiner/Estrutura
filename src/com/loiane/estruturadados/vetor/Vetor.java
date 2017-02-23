package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho = 0;

	// Construtor
	public Vetor(int capacidade) {
		elementos = new String[capacidade];
	}

	// public void adiciona(String elemento) {
	// for (int i = 0; i < this.elementos.length; i++){
	// if (this.elementos[i] == null){
	// this.elementos[i] = elemento;
	// break;
	// }
	// }
	// }
	public boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;

	}

	public void remove(int posicao, String elemento) {
	}

	// public String busca(int posicao){}
	// public int busca(String elemento) {}

	public int tamanho() {
		return this.tamanho;
		 
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();	 
		s.append("[");
			
			for (int i = 0; i < this.tamanho - 1; i++){
				s.append( this.elementos[i]);
				s.append(",");
			}
			if (this.tamanho > 0){
				s.append(this.elementos[this.tamanho -1]);
			}
			s.append("]");
		
		return   s.toString() ;
	}

	 
}
//~/workspace/EstruturaDeDados/estruturadados-algoritmos-java
