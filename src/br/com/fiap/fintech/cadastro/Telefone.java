package br.com.fiap.fintech.cadastro;

public class Telefone {
	private Pessoa pessoa;
	private String tipo;
	private int ddd;
	private int numero;
	private int ddi;
	
	public Telefone (Pessoa pessoa) {
		this.setPessoa(pessoa);
	}

	public Telefone (Pessoa pessoa, String tipo, int ddd, int numero, int ddi) {
		this.setPessoa(pessoa);
		this.tipo = tipo;
		this.ddd = ddd;
		this.ddi = ddi;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getDiscagemDiretaDistancia() {
		return ddd;
	}
	public void setDiscagemDiretaDistancia(Integer ddd) {
		this.ddd = ddd;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getDiscagemDiretaInternacional() {
		return ddi;
	}
	public void setDiscagemDiretaInternacional(Integer ddi) {
		this.ddi = ddi;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
