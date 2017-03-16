package model.fornecedor;

public class fornecedorGrafica extends Fornecedor{
	public fornecedorGrafica(int cod, String nome) {
		super(cod, nome);
		// TODO Auto-generated constructor stub
	}
	private float dimX;
	private float dimY;
	public float getDimX() {
		return dimX;
	}
	public void setDimX(float dimX) {
		this.dimX = dimX;
	}
	public float getDimY() {
		return dimY;
	}
	public void setDimY(float dimY) {
		this.dimY = dimY;
	}
	
}
