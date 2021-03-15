	package br.com.java.testes.listaLigadas;

import java.util.LinkedList;

import br.com.java.modelo.Aluno;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno maria = new Aluno();
		maria.setNome("Maria");
		
		Aluno manoel = new Aluno();
		manoel.setNome("Manoel");
		
		Aluno joaquim = new Aluno();
		joaquim.setNome("Joaquim");
		
		LinkedList listaLigada = new LinkedList();
		listaLigada.add(maria);
		listaLigada.add(manoel);
		listaLigada.add(1, joaquim);
		
		for(int i = 0; i < listaLigada.size(); i++) {
			System.out.println(listaLigada.get(i));
		}
		
	}

}
