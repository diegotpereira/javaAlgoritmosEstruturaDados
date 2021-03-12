package br.com.java.testes.compara;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestePerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> vetor = new ArrayList<String>();
		LinkedList<String> lista = new LinkedList<String>();
		int numeroDeElementos = 40000;
		
		//Adionando no começo
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			vetor.add(0, "" + i);
		}
		long fim = System.currentTimeMillis();
		
		System.out.println("Vetor adiciona no começo: " + (fim - inicio) / 1000.0);
		
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			lista.add(0, "" + i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Lista ligada adiciona no começo: " + (fim - inicio) / 1000.0);
		
		// Percorrendo
		inicio =  System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			vetor.get(i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Vetor percorrendo: " + (fim - inicio) / 1000.0);
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			lista.get(i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Lista ligada percorrendo: " + (fim - inicio) / 1000.0);
		
		// Removendo do começo
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			vetor.remove(0);
		}
		fim = System.currentTimeMillis();
		System.out.println("Vetor remove do começo: " + (fim - inicio) / 1000.0);
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			lista.remove(0);
		}
		fim = System.currentTimeMillis();
		System.out.println("Lista ligada remove do começo: " + (fim - inicio) / 1000.0);
	}
	

}
