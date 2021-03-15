package br.com.java.testes.pilha;

import br.com.java.modelo.Peca;
import br.com.java.pilha.PilhaGenerica;
import br.com.java.pilha.PilhaParametrizada;

public class TestePilhaGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PilhaGenerica pilhaDePecas = new PilhaGenerica();
		PilhaParametrizada<Peca> pilhaDePecas = new PilhaParametrizada<Peca>();
		
		Peca peca = new Peca();
		pilhaDePecas.insere(peca);
		
//		Object pecaRemovida = pilhaDePecas.remove();
		Peca pecaRemovida = pilhaDePecas.remove();
		
		if (peca != pecaRemovida) {
			System.out.println("Erro: A peça removida não é igual a que foi inserida!.");
		}
		if (!pilhaDePecas.vazia()) {
			System.out.println("Erro: A pilha não está vazia!.");
		}
		PilhaParametrizada<String> pilhaDeString = new PilhaParametrizada<String>();
		pilhaDeString.insere("Manoel");
		pilhaDeString.insere("Zuleide");
		
		System.out.println(pilhaDeString.remove());
		System.out.println(pilhaDeString.remove());
	}

}
