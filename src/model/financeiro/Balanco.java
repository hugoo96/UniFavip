package model.financeiro;

import java.util.ArrayList;
import java.util.List;

public class Balanco {
	
	private List<Financeiro> listaTransacoes = new ArrayList<>();
	
	public void adicionarTransacao(Financeiro transacao) {
		this.listaTransacoes.add(transacao);
	}
	
	public void removerTrasacao(Financeiro transacao) {
		this.listaTransacoes.remove(transacao);
	}
	
	public Financeiro buscaTransacaoPorCodigo(int codigoTransacao) {
		
		Financeiro transacao = null;
		
		for (Financeiro financeiro : listaTransacoes) {
			if(codigoTransacao == financeiro.getCodigoTransacao()) {
				transacao = financeiro;
				break;
			} 
		}
		
		return transacao;
	}
	
	public void geradorRelatorio() {
		
		System.out.println("Relatorios de Transa��es.");
		System.out.println("=========================");
		
		for (Financeiro financeiro : listaTransacoes) {
			System.out.println(financeiro);
		}
	}
	

}
