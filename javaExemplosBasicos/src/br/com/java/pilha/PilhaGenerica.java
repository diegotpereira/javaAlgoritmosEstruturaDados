package br.com.java.pilha;

import java.util.LinkedList;
import java.util.List;

public class PilhaGenerica {
	
	private List<Object> obejetos = new LinkedList<Object>();
	
	public void insere(Object obejto) {
		this.obejetos.add(obejto);
	}
	public Object remove() {
		return this.obejetos.remove(this.obejetos.size() - 1);
	}
	public boolean vazia() {
		return this.obejetos.size() == 0;
	}
}
