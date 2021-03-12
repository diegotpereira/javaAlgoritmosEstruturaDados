package br.com.java.testes.listaLigadas;

import br.com.java.listaLigadas.ListaLigada;

public class TesteRemoveDoComeco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		lista.removeDoComeco();
		
		System.out.println(lista);
	}

}
