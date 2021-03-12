package br.com.java.testes;

import br.com.java.modelo.Aluno;
import br.com.java.vetor.Vetor;

public class TestePegaPorPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		Aluno aluno1 = lista.pega(0);
		Aluno aluno2 = lista.pega(1);
		
		System.out.println(aluno1);
		System.out.println(aluno2);
	}

}
