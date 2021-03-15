package br.com.java.pilha;

import java.util.LinkedList;
import java.util.List;

import br.com.java.modelo.Peca;

public class Pilha <T>{
	
	private LinkedList<T> objetos = new LinkedList<T>();
	
	public void insere(T t) {
		this.objetos.add(t);
	}
	
	public T remove() {
		return this.objetos.remove(this.objetos.size() - 1);
	}
	public boolean vazia() {
		return this.objetos.size() == 0;
	}
}
