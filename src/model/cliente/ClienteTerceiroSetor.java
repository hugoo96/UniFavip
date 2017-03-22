package model.cliente;

public class ClienteTerceiroSetor extends Cliente{
	private boolean statutoSocial;
	
	public ClienteTerceiroSetor(String nome, String telefone, String email, String cnpj, boolean statutoSocial) {
		super(nome, telefone, email, cnpj);
		this.statutoSocial = statutoSocial;
	}

	public boolean getStatutoSocial() {
		return statutoSocial;
	}

	public void setStatutoSocial(boolean statutoSocial) {
		this.statutoSocial = statutoSocial;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail=" + email + "\nCnpj: "+cnpj+"\nStatuto social: "+possuiStatuto();
	}
	
	public String possuiStatuto(){
		return (getStatutoSocial())?"Sim":"Não";
	}
	
	
	
	
}
