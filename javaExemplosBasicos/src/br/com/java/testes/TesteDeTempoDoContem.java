package br.com.java.testes;

import br.com.java.modelo.Aluno;
import br.com.java.vetor.Vetor;

public class TesteDeTempoDoContem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor vetor = new Vetor();
		long inicio = System.currentTimeMillis();
		
		// Adionando 100000 alunos e
		// Verificando se eles foram realmente adicionados.
		
		for(int i = 1; i < 30000; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
			
			if (!vetor.contem(aluno)) {
				System.out.println("Erro: aluno" + aluno + "não foi adicionado!.");
			}
		}
		//verificando se o Vetor não se encontra alunos não adicionados
		for (int i = 1; i <30000; i++) {
			Aluno aluno = new Aluno();
			if (vetor.contem(aluno)) {
				System.out.println("Erro: aluno" + aluno + "foi adicionado!.");
			}
		}
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		
		System.out.println("tempo = " + tempo);
	}

}
