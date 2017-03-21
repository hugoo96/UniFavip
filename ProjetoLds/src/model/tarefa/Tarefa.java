package model.tarefa;

import java.sql.Date;

public class Tarefa {
	
	private String nome;
	private Date Data;
	
	
	public Tarefa(String nome, Date data) {
		this.nome = nome;
		Data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return Data;
	}
	public void setData(Date data) {
		Data = data;
	}
	@Override
	public String toString() {
		return "tarefa [nome=" + nome + ", Data=" + Data + "]";
	}


}
