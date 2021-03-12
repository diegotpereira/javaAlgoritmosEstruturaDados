package br.com.java.modelo;

import java.util.Arrays;

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
}

