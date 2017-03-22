package model.fornecedor;

import java.util.ArrayList;
import java.util.List;

public class AglutinadorFornecedor {
	
	private List<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
	
	public void addFornecedor(Fornecedor forn){
		listaFornecedores.add(forn);
	}
	public List<Fornecedor> returnListFornecedores(){
		return listaFornecedores;
	}
	
	
	public Fornecedor fornecedorMenorPreco(){
		if(!listaFornecedores.isEmpty()){
			Fornecedor forn = listaFornecedores.get(0);
			for (Fornecedor fornecedor : listaFornecedores) {
				if(fornecedor.getPreco() < forn.getPreco()){
					forn = fornecedor;
				}
			}
			return forn;
		}
		return null;
	}
	
	public Fornecedor fornecedorMaiorPreco() {
		if (!listaFornecedores.isEmpty()) {
			Fornecedor forn = listaFornecedores.get(0);
			for (Fornecedor fornecedor : listaFornecedores) {
				if (fornecedor.getPreco() > forn.getPreco()) {
					forn = fornecedor;
				}

			}
		}
		return null;
	}
}
