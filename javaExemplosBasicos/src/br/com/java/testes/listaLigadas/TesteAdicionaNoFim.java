package br.com.java.testes.listaLigadas;

import br.com.java.listaLigadas.ListaLigada;

public class TesteAdicionaNoFim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		System.out.println(lista);
	}

}
