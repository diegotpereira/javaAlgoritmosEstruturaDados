package br.com.java.testes.conjuntos;

import br.com.java.conjuntos.ConjuntoEspalhamentoGenerico;

public class TesteConjuntoGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConjuntoEspalhamentoGenerico conjunto = new ConjuntoEspalhamentoGenerico();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		
		System.out.println(conjunto.pegaTodos());
	}

}
