package br.com.fiap.fintech.cadastro;

public class Usuario extends Pessoa{
	private String email;
	private String password;
	private String confirmPassword;
	
	public Usuario() {}
	
	/**
	 * @name constructor
	 * @param nome
	 * @param email
	 * @param password
	 * @param confirmPassword
	 */
	public Usuario(String email, String password, String confirmPassword) {
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	
	/***
	 * {@summary} getter and setters
	 */
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/***
	 * {@summary} Methods
	 */
	
	/***
	 * @TODO implementar metodo CRUD
	 */
	public String AlterarSenha(String email, String newPassword, String oldPassword) {
		final String EMAIL_INVALIDO = "Email invalido";
		final String SENHA_INVALIDA = "Senha invalida";
		final String CONFIRMAR_TROCA = "Senha alterada com sucesso!";
		
		if(email != this.getEmail()) {
			System.out.println(EMAIL_INVALIDO);
			return EMAIL_INVALIDO;
		}
		
		if(oldPassword != this.getPassword()) {
			System.out.println(SENHA_INVALIDA);
			return SENHA_INVALIDA;
		}
		
		this.setPassword(newPassword);
		return CONFIRMAR_TROCA;
		
	}
	
	/***
	 * @TODO Verificar melhor forma de return um objeto do mesmo tipo.
	 */
	public Usuario ConsultarUsuario() {
		return new Usuario(this.email, password, confirmPassword);
	}
	
	/***
	 * @TODO implementar metodo CRUD
	 */
	public Void AdicionarUsuario(String email, String nome, String password) {
		this.setEmail(email);
		this.setPassword(password);
		
		System.out.println("Usuario adicionado com sucesso!");
		
		return null;
	}
	
	/***
	 * @TODO implementar metodo CRUD
	 */
	public Void ExcluirUsuario() {
		System.out.println("Usuario removido!");
		return null;
	}
}
