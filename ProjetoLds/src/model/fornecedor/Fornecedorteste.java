package model.fornecedor;

import java.util.Iterator;

public class Fornecedorteste {
	public static void main(String args[]){
		FornecedorBrindes brindes = new FornecedorBrindes(01,"jc brindes");
		FornecedorVideo video = new FornecedorVideo(002, "videolar filmagens");
		fornecedorGrafica grafica = new fornecedorGrafica(003, "express grafica");
		AglutinadorFornecedor aglut = new AglutinadorFornecedor();
		aglut.addFornecedor(brindes);
		aglut.addFornecedor(video);
		aglut.addFornecedor(grafica);
		for (Object forn : aglut.returnLista()) {
			forn.toString();
		}
	}
}
