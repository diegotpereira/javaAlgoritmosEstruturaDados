package br.com.java.testes.pilha;

import br.com.java.modelo.Peca;
import br.com.java.pilha.Pilha;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha <Peca> pilha = new Pilha<Peca>();
		
		Peca peca = new Peca();
		pilha.insere(peca);
		 
		if (pilha.vazia()) {
			System.out.println("A pilha está vazia!.");
		}
		Pilha<String> pilha2 = new Pilha<String>();
		pilha2.insere("Adalberto");
		pilha2.insere("Maria");
		
		String maria = pilha2.remove();
		String adalberto = pilha2.remove();
		
		System.out.println(maria);
		System.out.println(adalberto);
	}

}
