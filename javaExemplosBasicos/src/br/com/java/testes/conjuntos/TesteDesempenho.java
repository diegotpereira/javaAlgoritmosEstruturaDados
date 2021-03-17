package br.com.java.testes.conjuntos;

import br.com.java.conjuntos.ConjuntoEspalhamento;

public class TesteDesempenho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long inicio = System.currentTimeMillis();
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		for(int i = 0; i < 50000; i++) {
			conjunto.adiciona("palavra" + i);
		}
		for(int i = 0; i < 50000; i++) {
			conjunto.contem("palavra" + i);
		}
		long fim = System.currentTimeMillis();
		System.out.println("Tempo: " + (fim - inicio) / 1000.0);
	}

}
