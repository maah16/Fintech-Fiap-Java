package br.com.fiap.fintech.cadastro;
import Pessoa;

public class PessoaTelefone extends Pessoa {
	private Pessoa pessoa;
	private String tipo;
	private int ddd;
	private int numero;
	private int ddi;
	
	// constructor
	public PessoaTelefone (Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public PessoaTelefone (Pessoa pessoa, String tipo, int ddd, int numero, int ddi) {
		this.pessoa = pessoa;
		this.tipo = tipo;
		this.ddd = ddd;
		this.ddi = ddi;
	}

	// getters and setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getDdd() {
		return ddd;
	}
	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDdi() {
		return ddi;
	}
	public void setDdi(Integer ddi) {
		this.ddi = ddi;
	}

	// methods
	public void read() {
		System.out.println("Tipo: " + this.tipo);
		System.out.println("DDD: " + this.ddd);
		System.out.println("Numero: " + this.numero);
		System.out.println("DDI: " + this.ddi);
	}

	public void adicionarTelefone() {
		System.out.println("Adicionando o telefone" + this.numero + " para " + this.pessoa.getNome() +" no banco de dados...");
		System.out.println("Telefone adicionado com sucesso!");
	}

	public void removerTelefone() {
		System.out.println("Removendo o telefone " + this.numero + " do banco de dados...");
		System.out.println("Telefone removido com sucesso!");
	}

	public void atualizarDDD(int ddd) {
		System.out.println("Atualizando DDD...");
		this.setDdd(ddd);
		System.out.println("DDD atualizado com sucesso!");
	}

	public void atualizarNumero(int numero) {
		System.out.println("Atualizando numero...");
		this.setNumero(numero);
		System.out.println("Numero atualizado com sucesso!");
	}

	public void atualizarDDI(int ddi) {
		System.out.println("Atualizando DDI...");
		this.setDdi(ddi);
		System.out.println("DDI atualizado com sucesso!");
	}

	public void atualizarTipo(String tipo) {
		System.out.println("Atualizando tipo...");
		this.setTipo(tipo);
		System.out.println("Tipo atualizado com sucesso!");
	}
}
