package br.com.java.testes;

import java.util.ArrayList;

import br.com.java.modelo.Aluno;
import br.com.java.vetor.Vetor;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno a1 = new Aluno();
		a1.setNome("Rafael");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		
		lista.pega(0);
		lista.pega(1);
		lista.pega(100000000);
//		ArrayList vetorSemGenerics = new ArrayList();
//		ArrayList<Aluno> vetorComGenerics = new ArrayList<Aluno>();
//		
//		Aluno aluno = new Aluno();
//		
//		vetorSemGenerics.add(aluno);
//		vetorComGenerics.add(aluno);
//		
//		Aluno a1 = (Aluno) vetorSemGenerics.get(0);
//		Aluno a2 = vetorComGenerics.get(0);
//		ArrayList vetor = new ArrayList();
//		
//		Aluno aluno1 = new Aluno();
//		Aluno aluno2 = new Aluno();
//		Aluno aluno3 = new Aluno();
//		
//		vetor.add(aluno1);
//		vetor.add(aluno2);
//		vetor.add(0, aluno3);
//		
//		int tamanho = vetor.size();
//		
//		if (tamanho != 3) {
//			System.out.println("erro: O tamanho da lista está errado!.");
//		}
//		if (!vetor.contains(aluno1)) {
//			System.out.println("Erro: Não achou um aluno que deveria estar na lista!.");
//		}
//		vetor.remove(0);
//		tamanho = vetor.size();
//		
//		if (tamanho != 2) {
//			System.out.println("Erro: O tamanho da lista está errado!.");
//		}
//		if (vetor.contains(aluno3)) {
//			System.out.println("Erro: Achou um aluno que não deveria estar na lista!.");
//		}
	}

}
