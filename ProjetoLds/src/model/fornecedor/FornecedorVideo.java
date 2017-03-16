package model.fornecedor;

public class FornecedorVideo extends Fornecedor{
	public FornecedorVideo(int cod, String nome) {
		super(cod, nome);
		// TODO Auto-generated constructor stub
	}

	private int tempo;

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
}
