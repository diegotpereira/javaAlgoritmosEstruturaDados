package br.com.java.testes.pilha;

import java.util.Stack;

import br.com.java.modelo.Peca;

public class TesteComStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack pilha = new Stack();
		
		Peca pecaInsere = new Peca();
		pilha.push(pecaInsere);
		
		Peca pecaRemove = (Peca)pilha.pop();
		
		if (pilha.isEmpty()) {
			System.out.println("A pilha está vazia!.");
		}
	}

}
