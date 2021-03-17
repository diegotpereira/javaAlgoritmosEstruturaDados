package br.com.java.testes.conjuntos;

import java.util.List;

import br.com.java.conjuntos.ConjuntoEspalhamento;

public class TesteAdiciona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		
		List<String> palavras = conjunto.pegaTodas();
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}

}
