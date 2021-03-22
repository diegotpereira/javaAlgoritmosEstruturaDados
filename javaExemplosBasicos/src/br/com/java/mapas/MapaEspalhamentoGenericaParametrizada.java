package br.com.java.mapas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.java.modelo.Carro;

public class MapaEspalhamentoGenericaParametrizada <C, V>{
	
	MapaEspalhamentoGenericaParametrizada<String, Carro> mapa = new MapaEspalhamentoGenericaParametrizada<String, Carro>();
	
	private List<List<AssociacaoGenericaParametrizada<C, V>>> tabela = new ArrayList<List<AssociacaoGenericaParametrizada<C, V>>>();
	
	public MapaEspalhamentoGenericaParametrizada(){
		for (int i = 0; i < 100; i++) {
			this.tabela.add(new LinkedList<AssociacaoGenericaParametrizada<C, V>>());
		}
	}
	public boolean contemChave(C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<AssociacaoGenericaParametrizada<C, V>> lista = this.tabela.get(indice);
		
		for (int i = 0; i < lista.size(); i++) {
			AssociacaoGenericaParametrizada<C, V> associacaoGenericaParametrizada = lista.get(indice);
			
			if (associacaoGenericaParametrizada.getChave().equals(chave)) {
				return true;
			}
		}
		return false;
	}
	public void remove(C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<AssociacaoGenericaParametrizada<C, V>> lista = this.tabela.get(indice);
		
		for (int i = 0; i < lista.size(); i++) {
			AssociacaoGenericaParametrizada<C, V> associacaoGenericaParametrizada = lista.get(i);
			if (associacaoGenericaParametrizada.getChave().equals(chave)) {
				lista.remove(i);
				return;
			}
		}
		throw new IllegalArgumentException("A chave não existe!.");
	}
	public void adiciona (C chave, V valor) {
		if (this.contemChave(chave)) {
			this.remove(chave);
		}
		int indice = this.calculaIndiceDaTabela(chave);
		List<AssociacaoGenericaParametrizada<C, V>> lista = this.tabela.get(indice);
		lista.add(new AssociacaoGenericaParametrizada<C, V> (chave, valor));
	}
	public V pega (C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<AssociacaoGenericaParametrizada<C, V>>lista = this.tabela.get(indice);
		
		for (int i = 0; i < lista.size(); i++) {
			AssociacaoGenericaParametrizada<C, V> associacaoGenericaParametrizada = lista.get(i);
			
			if (associacaoGenericaParametrizada.getChave().equals(chave)) {
				return associacaoGenericaParametrizada.getValor();
			}
		}
		throw new IllegalArgumentException("A chave não existe!.");
	}
	private int calculaIndiceDaTabela(C chave) {
		return Math.abs(chave.hashCode()) % this.tabela.size();
	}
	private List<AssociacaoGenericaParametrizada<C, V>>pegaTodas(){
		ArrayList<AssociacaoGenericaParametrizada<C, V>> associacoes = new ArrayList<AssociacaoGenericaParametrizada<C,V>>();
		
		for (List<AssociacaoGenericaParametrizada<C, V>> lista : this.tabela) {
			associacoes.addAll(lista);
		}
		return associacoes;
	}
	@Override
	public String toString() {
		return this.pegaTodas().toString();
	}
	
}
