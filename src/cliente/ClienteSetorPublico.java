package cliente;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

public class ClienteSetorPublico extends Cliente {
	private String nivelOrgão;//municipal,estadual,federal
	
	public ClienteSetorPublico(String nome, String telefone, String email, String cnpj, String nivelOrgao) {
		super(nome, telefone, email, cnpj);
		this.nivelOrgão = nivelOrgão;
	}

	public String getNivelOrgão() {
		return nivelOrgão;
	}

	public void setNivelOrgão(String nivelOrgão) {
		this.nivelOrgão = nivelOrgão;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail=" + email + "\nCnpj: "+cnpj+"\nNivel do orgao: "+nivelOrgão;
	}
	
	
}
