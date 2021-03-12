package br.com.java.testes.listaLigadas;

import br.com.java.listaLigadas.ListaLigada;

public class TesteAdicionaPorPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona(0, "Paulo");
		lista.adiciona(1, "Camila");
		
		System.out.println(lista);
	}

}
