package model.tarefa;

import java.sql.Date;

public class CriacaoGrafica extends Tarefa{
	
	private String tipo;

	public CriacaoGrafica(String nome, Date data) {
		super(nome, data);
		
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "CriacaoGrafica [tipo=" + tipo + "]";
	}
	
	
	

	
}
