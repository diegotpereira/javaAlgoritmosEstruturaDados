package br.com.java.testes.conjuntos;

import br.com.java.conjuntos.ConjuntoEspalhamento;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		conjunto.adiciona("palavra");
		conjunto.adiciona("computador");
		conjunto.adiciona("apostila");
		conjunto.adiciona("instrutor");
		conjunto.adiciona("mesa");
		conjunto.adiciona("telefone");
		
		if (conjunto.contem("apostila")) {
			System.out.println("Erro: não foi encontrada a palavra: apostila");
		}
		conjunto.remove("apostila");
		
		if (conjunto.contem("apostila")) {
			System.out.println("Erro: não foi encontrada a palavra: apostila");
		}
		if (conjunto.tamanho() != 5) {
			System.out.println("Erro: o tamanho do conjunto deveria ser 5");
		}
	}

}
