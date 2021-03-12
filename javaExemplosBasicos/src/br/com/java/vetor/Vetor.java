package br.com.java.vetor;

import java.util.Arrays;

import br.com.java.modelo.Aluno;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private Object[] objetos = new Object[100000];
	private int totalDeAlunos = 0;
	private int totalDeObjetos = 0;
	
	// GENERALIZAÇÂO
	// Adiciona objetos
//	public void adiciona(Object objeto) {
//		this.garantaEspaco();
//		this.objetos[this.totalDeObjetos] = objeto;
//		this.totalDeObjetos++;
//	}
//	//Adiciona objetos em dada posição
//	public void adiciona(int posicao, Object objeto) {
//		this.garantaEspaco();
//		if (!posicaoValida(posicao)) {
//			throw new IllegalArgumentException("Posicao inválida!.");
//		}
//	}
	// 
//	public Object pegaObjeto(int posicao) {
//		if (!this.posicaoOcupada(posicao)) {
//			throw new IllegalArgumentException("Posição inválida!.");
//		}
//		return this.objetos[posicao];
//	}

	// Adiciona aluno
	public void adiciona(Aluno aluno) {
		this.garantaEspaco();
		this.alunos[this.totalDeAlunos] = aluno;
//		this.objetos[this.tamanho()] = objeto;
		this.totalDeAlunos++;
	}
	//adiciona aluno em dada posição
	public void adiciona(int posicao, Aluno aluno) {
		this.garantaEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida!.");
		}
		for(int i = this.totalDeAlunos -1; i >= posicao; i-=1) {
			this.alunos[i + 1] = this.alunos[i];
		}
		this.alunos[posicao] = aluno;
		this.totalDeAlunos++;
	}
	//Busca posição dejada
	public Aluno pega(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida!.");
		}
		return this.alunos[posicao];
	}
	//verifica se posição está ocupada
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.tamanho();
	}
	//
	public int tamanho() {
		return this.totalDeAlunos;
	}
	//
	public String toString() {
		if (this.totalDeAlunos == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < this.totalDeAlunos - 1; i++) {
			builder.append(this.alunos[i]);
			builder.append(",");
		}
		builder.append(this.alunos[this.totalDeAlunos -1]);
		builder.append("]");
		return builder.toString();
	}
	// Verifica se a posição é valida ou não
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeAlunos;
	}
	//
	public boolean contem (Aluno aluno) {
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (aluno == this.alunos[i]) {
				return true;
			}
		}
		return false;
	}
	// Remove objeto de uma dada posição
	public void remove (int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!.");
		}
		for(int i = posicao; i < this.totalDeAlunos; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}
		this.totalDeAlunos--;
	}
	// Verifica se array está cheio, caso esteja cheio cria um novo array
	private void garantaEspaco() {
		if (this.totalDeAlunos == this.alunos.length) {
			Aluno[] novaArray = new Aluno[this.alunos.length * 2];
			for (int i = 0; i < this.alunos.length; i++) {
				novaArray[i] = this.alunos[i];
			}
			this.alunos = novaArray;
		}
	}
}

