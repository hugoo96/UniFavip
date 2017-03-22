package model.cliente;

public abstract class Cliente {
	protected String nome;
	protected String telefone;
	protected String email;
	protected String cnpj;
	
	public Cliente(String nome, String telefone, String email, String cnpj){
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.cnpj = cnpj;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	@Override
	public String toString() {
		return "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail=" + email + "\nCnpj: "+cnpj;
	}
	
	public boolean validarCnpj(String cnpj){
		//implementação
		return true;
	}
	
	
}
