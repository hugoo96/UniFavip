package model.fornecedor;

import java.util.List;

public class AglutinadorFornecedor {
	private List<Object> listaForn;
	public void addFornecedor(Object fornecedor){
		if(fornecedor.getClass().getSuperclass().equals(fornecedor)){
			listaForn.add(fornecedor);
		}
	}
	public List<Object> returnLista(){
		return listaForn;
	}
}
