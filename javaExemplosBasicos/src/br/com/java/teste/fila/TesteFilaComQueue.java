package br.com.java.teste.fila;

import java.util.LinkedList;
import java.util.Queue;

import br.com.java.modelo.Aluno;

public class TesteFilaComQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue fila = new LinkedList();
		
		Aluno aluno = new Aluno();
		fila.offer(aluno);
		
		Aluno alunoRemovido = (Aluno)fila.poll();
		
		if (fila.isEmpty()) {
			System.out.println("A fila está vazia!.");
		}
	}

}
