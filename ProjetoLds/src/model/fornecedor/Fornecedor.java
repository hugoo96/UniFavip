package model.fornecedor;

public abstract class Fornecedor {
	private int cod;
	private String nome;
	
	private double preco;
	public Fornecedor(int cod, String nome){
		this.cod = cod;
		this.nome = nome;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double calculaCusto(double quantidade){
		return this.preco*quantidade;
	}
}
