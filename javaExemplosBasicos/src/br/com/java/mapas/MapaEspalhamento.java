package br.com.java.mapas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.java.modelo.Carro;
public class MapaEspalhamento {
	
	private List<List<Associacao>> tabela = new ArrayList<List<Associacao>>();
	
	public MapaEspalhamento() {
		for (int i= 0; i< 100; i++) {
			this.tabela.add(new LinkedList<Associacao>());
		}
	}
	public int calculaIndiceDaTabela(String placa) {
		return Math.abs(placa.hashCode()) % this.tabela.size();
	}
	public boolean contemChave(String placa) {
		int indice = this.calculaIndiceDaTabela(placa);
		List<Associacao> lista = this.tabela.get(indice);
		
		for (int i = 0; i < lista.size(); i++) {
			Associacao associacao = lista.get(i);
			
			if (associacao.getPlaca().equals(placa)) {
				return true;
			}
		}
		return false;
	}
	public void remove(String placa) {
		int indice = this.calculaIndiceDaTabela(placa);
		List<Associacao>lista = this.tabela.get(indice);
		
		for(int i = 0; i < lista.size(); i++) {
			Associacao associacao = lista.get(i);
			
			if (associacao.getPlaca().equals(placa)) {
				lista.remove(i);
				return;
			}
		}
		throw new IllegalArgumentException("A chave n�o existe!.");
	}
	public void adiciona(String placa, Carro carro) {
		if (this.contemChave(placa)) {
			this.remove(placa);
		}
		int indicce = this.calculaIndiceDaTabela(placa);
		List<Associacao> lista = this.tabela.get(indicce);
		lista.add(new Associacao(placa, carro));
	}
	public Carro pega(String placa) {
		int indice = this.calculaIndiceDaTabela(placa);
		List<Associacao>lista = this.tabela.get(indice);
		
		for(int i = 0; i < lista.size(); i ++) {
			Associacao associacao = lista.get(i);
			if (associacao.getPlaca().equals(placa)) {
				return associacao.getCarro();
			}
		}
		throw new IllegalArgumentException("A chave n�o existe!.");
	}
}
