package model.cliente;

public class ClienteSetorPrivado extends Cliente {
	private String tipoSetor; //produto//serviço//varejo
	
	public ClienteSetorPrivado(String nome, String telefone, String email, String cnpj, String tipoSetor) {
		super(nome, telefone, email, cnpj);
		this.tipoSetor = tipoSetor;
	}

	public String getTipoSetor() {
		return tipoSetor;
	}

	public void setTipoSetor(String tipoSetor) {
		this.tipoSetor = tipoSetor;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail=" + email + "\nCnpj: "+cnpj+"\nSetor: "+tipoSetor;
	}
	
	
	
	
}
