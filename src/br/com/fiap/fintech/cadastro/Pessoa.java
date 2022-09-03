package br.com.fiap.fintech.cadastro;

import java.time.LocalDate;

public class Pessoa {
	protected String nome;
	private LocalDate dataNascimento;
	private Integer numeroCPF;
	private String sexo;
	
	public Pessoa () {}
	
	public Pessoa (String nome, LocalDate dataNascimento, Integer numeroCPF, String sexo) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.numeroCPF = numeroCPF;
		this.sexo = sexo;
	}
	
	/***
	 * {@summary} Getters and Setters
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(Integer numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
