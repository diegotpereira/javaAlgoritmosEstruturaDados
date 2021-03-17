package br.com.java.conjuntos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {
	
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
//	private List<List<String>>tabela = new ArrayList<<List<String>>();
	private int tamanho = 0;
	
	public ConjuntoEspalhamento() {
		for (int i = 0; i < 26; i++) {
			LinkedList<String> lista = new LinkedList<String>();
			tabela.add(lista);
		}
	}
	private int calculaIndiceDaTabela(String palavra) {
//		return palavra.toLowerCase().charAt(0) % 26;
		int codigoDeEspelhamento = this.calculaCodigoDeEspalhamento(palavra);
		codigoDeEspelhamento = Math.abs(codigoDeEspelhamento);
		return codigoDeEspelhamento % this.tabela.size();
	}
	
	public void adiciona(String palavra) {
		
		if (!this.contem(palavra)) {
			this.verificaCarga();
			int indice = this.calculaIndiceDaTabela(palavra);
			List<String>lista = this.tabela.get(indice);
			lista.add(palavra);
		}
		
	}
	
	public void remove(String palavra) {
		if (this.contem(palavra)) {
			this.verificaCarga();
			int indice = this.calculaIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.remove(palavra);
			this.tamanho--;
		}
	}
	
	public boolean contem(String palavra) {
		int indice = this.calculaIndiceDaTabela(palavra);
		List<String> lista = this.tabela.get(indice);
		return lista.contains(palavra);
	}
	public List<String>pegaTodas(){
		List<String>palavras = new ArrayList<String>();
		
		for (int i = 0; i < this.tabela.size(); i++) {
			palavras.addAll(this.tabela.get(i));
		}
		return palavras;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	private int calculaCodigoDeEspalhamento(String palavra) {
		int codigo = 1;
		for(int i =0; i < palavra.length(); i++) {
			codigo = 31 * codigo + palavra.charAt(i);
		}
		return codigo;
	}
	public void imprimiTabela() {
		for(List<String> lista : this.tabela) {
			System.out.println("[");
			for(int i = 0; i < lista.size(); i++) {
				System.out.print("*");
			}
			System.out.println("]");
		} 
	}
	private void redimensionaTabela(int novaCapacidade){
		List<String>palavras = this.pegaTodas();
		this.tabela.clear();
		
		for(int i = 0; i < novaCapacidade; i++) {
			this.tabela.add(new LinkedList<String>());
		}
		for(String palavra : palavras) {
			this.adiciona(palavra);
		}
	}
	private void verificaCarga() {
//		int capacidade = this.tabela.size();
		
		double carga = (double)this.tamanho / this.tabela.size();
		
		if (carga > 0.75) {
			this.redimensionaTabela(this.tamanho * 2);
		}else if (carga < 0.25) {
			this.redimensionaTabela(Math.max(this.tamanho / 2, 10));
		}
	}
	public List<String> pegaTodas(){
		List<String> palavras = new ArrayList<String>();
		
		for(int i = 0; i < this.tabela.size(); i++) {
			palavras.addAll(this.tabela.get(i));
		}
		return palavras;
	}
}
