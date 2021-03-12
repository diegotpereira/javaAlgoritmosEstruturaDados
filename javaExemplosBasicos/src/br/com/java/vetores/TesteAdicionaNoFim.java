package br.com.java.vetores;

import br.com.java.modelo.Aluno;
import br.com.java.modelo.Vetor;

public class TesteAdicionaNoFim {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome ("Rafael");
		a2.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista);

	}

}
