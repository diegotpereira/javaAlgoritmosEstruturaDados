package br.com.java.teste.fila;

import br.com.java.fila.Fila;
import br.com.java.modelo.Aluno;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila fila = new Fila();
//		Fila<Aluno> fila = new Fila<Aluno>();
		
	
		
		Aluno aluno = new Aluno();
		fila.insere(aluno);
		
		Aluno alunoRemovido = fila.remove();
		
//		if (fila.vazia()) {
//			System.out.println("A fila est� vazia!.");
//		}
//		Fila<String>filaDeString = new Fila<String>();
//		filaDeString.insere("Adelaide");
//		filaDeString.insere("Carolina");
//		
//		String carolina = filaDeString.remove();
//		String adelaide = filaDeString.remove();
//		
//		System.out.println(carolina);
//		System.out.println(adelaide);
		
		if (aluno != alunoRemovido) {
			System.out.println("Erro: O aluno removido � igual ao que foi inserido!>");
		}
		
		if (!fila.vazia()) {
			System.out.println("Erro: A fila n�o est� vazia!.");
		}
	}

}
