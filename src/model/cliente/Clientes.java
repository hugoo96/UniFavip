package model.cliente;

import java.util.ArrayList;

public class Clientes {
	private static Clientes instancia;
	
	private ArrayList<ClienteSetorPrivado> listaClientesSetorPrivado;
	private ArrayList<ClienteSetorPublico> listaClientesSetorPublico;
	private ArrayList<ClienteTerceiroSetor> listaClientesTerceiroSetor;

	private Clientes() {
		this.listaClientesSetorPrivado = new ArrayList<>();
		this.listaClientesSetorPublico = new ArrayList<>();
		this.listaClientesTerceiroSetor = new ArrayList<>();
	}

	public static Clientes getInstancia() {

		if (instancia == null) {
			synchronized (Clientes.class) {
				if (instancia == null) {
					instancia = new Clientes();
				}
			}
		}
		return instancia;
	}
	
	public void addClienteSetorPrivado(ClienteSetorPrivado csp){
		this.listaClientesSetorPrivado.add(csp);
	}
	
	public void addClienteSetorPublico(ClienteSetorPublico csp){
		this.listaClientesSetorPublico.add(csp);
	}
	
	public void addClienteTerceiroSetor(ClienteTerceiroSetor cts){
		this.listaClientesTerceiroSetor.add(cts);
	}
	
	public void removerClienteSetorPrivado(ClienteSetorPrivado csp){
		this.listaClientesSetorPrivado.remove(csp);
	}
	public void removerClienteSetorPublico(ClienteSetorPublico csp){
		this.listaClientesSetorPublico.remove(csp);
	}
	public void removerClienteTerceiroSetor(ClienteTerceiroSetor cts){
		this.listaClientesTerceiroSetor.remove(cts);
	}
}
