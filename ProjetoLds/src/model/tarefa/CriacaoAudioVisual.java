package model.tarefa;

import java.sql.Date;

public class CriacaoAudioVisual extends Tarefa {
	
	private String tipo;

	public CriacaoAudioVisual(String nome, Date data) {
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
		return "CriacaoAudioVisual [tipo=" + tipo + "]";
	}


	
	}
