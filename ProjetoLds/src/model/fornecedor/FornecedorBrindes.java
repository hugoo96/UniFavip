package model.fornecedor;

public class FornecedorBrindes extends Fornecedor{
	public FornecedorBrindes(int cod, String nome) {
		super(cod, nome);
		// TODO Auto-generated constructor stub
	}
	private float tamanho;
	private int quantidadeMin;
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	public int getQuantidadeMin() {
		return quantidadeMin;
	}
	public void setQuantidadeMin(int quantidadeMin) {
		this.quantidadeMin = quantidadeMin;
	}
}
