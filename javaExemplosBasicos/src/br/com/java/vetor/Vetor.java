package br.com.java.vetor;

import java.util.Arrays;

import br.com.java.modelo.Aluno;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private Object[] objetos = new Object[100000];
	private int totalDeAlunos = 0;
	private int totalDeObjetos = 0;

	public void adiciona(Aluno aluno) {
//		this.garantaEspaco();
		this.alunos[this.totalDeAlunos] = aluno;
//		this.objetos[this.tamanho()] = objeto;
		this.totalDeAlunos++;
	}
	public void adiciona(int posicao, Aluno aluno) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida!.");
		}
		for(int i = this.totalDeAlunos -1; i >= posicao; i-=1) {
			this.alunos[i + 1] = this.alunos[i];
		}
		this.alunos[posicao] = aluno;
		this.totalDeAlunos++;
	}
	//Busca posição livre
	public Aluno pega(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida!.");
		}
		return this.alunos[posicao];
	}
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.tamanho();
	}
	public int tamanho() {
		return this.totalDeAlunos;
	}
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
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeAlunos;
	}
	public boolean contem (Aluno aluno) {
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (aluno.equals(this.alunos[i])) {
				return true;
			}
		}
		return false;
	}
	public void remove (int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!.");
		}
		for(int i = posicao; i < this.totalDeAlunos; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}
		this.totalDeAlunos--;
	}
}

