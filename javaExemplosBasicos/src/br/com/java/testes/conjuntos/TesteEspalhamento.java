package br.com.java.testes.conjuntos;

import br.com.java.conjuntos.ConjuntoEspalhamento;

public class TesteEspalhamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		for(int i = 0; i < 100; i++) {
			conjunto.adiciona("" + i);
		}
		conjunto.imprimiTabela();
	}

}
