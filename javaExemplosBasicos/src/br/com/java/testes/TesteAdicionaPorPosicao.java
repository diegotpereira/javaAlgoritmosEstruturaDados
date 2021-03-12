package br.com.java.testes;

import br.com.java.modelo.Aluno;
import br.com.java.vetor.Vetor;

public class TesteAdicionaPorPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();

		
		a1.setNome("Rafeal");
		a2.setNome("Paulo");
		a3.setNome("Ana");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(0, a2);
		lista.adiciona(1, a3);
		System.out.println(lista);
	}

}
