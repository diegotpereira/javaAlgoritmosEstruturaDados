package br.com.java.teste.fila;

import br.com.java.fila.FilaGenerica;
import br.com.java.modelo.Aluno;

public class TesteFilaGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilaGenerica filaDeAlunos = new FilaGenerica();
		
		Aluno aluno = new Aluno();
		filaDeAlunos.insere(aluno);
		
		// sem casting
//		Aluno alunoRemovido = filaDeAlunos.remove();
		
		//Com casting
		Object alunoRemovido = filaDeAlunos.remove();
		if (aluno != alunoRemovido) {
			System.out.println("Erro: O aluno removido não é igual ao que foi inserido!.");
		}
		if (!filaDeAlunos.vazia()) {
			System.out.println("Erro: A fila não está vazia!.");
		}
	}

}
