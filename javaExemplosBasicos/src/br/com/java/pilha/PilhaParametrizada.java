package br.com.java.pilha;

import java.util.LinkedList;
import java.util.List;

public class PilhaParametrizada<T> {
	private List<T> obejetos = new LinkedList<T>();
	
	public void insere(T t) {
		this.obejetos.add(t);
	}
	public T remove() {
		return this.obejetos.remove(this.obejetos.size() - 1);
	}
	public boolean vazia() {
		return this.obejetos.size() == 0;
	}
}
