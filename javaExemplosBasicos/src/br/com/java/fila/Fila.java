package br.com.java.fila;

import java.util.LinkedList;
import java.util.List;

import br.com.java.modelo.Aluno;

public class Fila {
	
//	private List<T> objetos = new LinkedList<T>();
	private List<Aluno>alunos = new LinkedList<Aluno>();
	
//	public void insere(T t) {
//		this.objetos.add(t);
//	}
//	
	public void insere(Aluno aluno) {
		this.alunos.add(aluno);
	}
//	public T remove() {
//		return this.objetos.remove(0);
//	}
	public Aluno remove() {
		return this.alunos.remove(0);
	}
	
//	public boolean vazia() {
//		return this.objetos.size() == 0;
//	}
	public boolean vazia() {
		return this.alunos.size() ==0;
	}
}
