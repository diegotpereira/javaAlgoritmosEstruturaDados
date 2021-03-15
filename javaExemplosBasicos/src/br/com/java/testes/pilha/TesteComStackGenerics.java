package br.com.java.testes.pilha;

import java.util.Stack;

import br.com.java.modelo.Peca;

public class TesteComStackGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Peca> pilha = new Stack<Peca>();
		
		Peca pecaInsere = new Peca();
		pilha.push(pecaInsere);
		
		Peca pecaRemove = pilha.pop();
		
		if (pilha.isEmpty()) {
			System.out.println("A pilha está vazia!.");
		}
	}

}
