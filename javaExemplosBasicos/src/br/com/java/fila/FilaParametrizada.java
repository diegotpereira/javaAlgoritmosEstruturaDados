package br.com.java.fila;

import java.util.LinkedList;
import java.util.List;

public class FilaParametrizada<T> {
	
	private List<T>obejetos = new LinkedList<T>();
	
	public void insere(T t) {
		this.obejetos.add(t);
	}
	public T remove() {
		return this.obejetos.remove(0);
	}
	public boolean vazia() {
		return this.obejetos.size() == 0;
	}
}
