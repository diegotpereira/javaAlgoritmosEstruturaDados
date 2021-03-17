package br.com.java.teste.fila;

import java.util.List;

import br.com.java.conjuntos.ConjuntoEspalhamento;

public class TesteRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		
		List<String> palavras = conjunto.pegaTodas();
		
		System.out.println("depois de remover");
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}

}
