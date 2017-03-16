package model.funcionario;

import java.util.ArrayList;

public class Funcionarios {

	private ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
	
	
	public void adicionarFuncionario(Funcionario funcionario) {
		this.listaFuncionarios.add(funcionario);
	}
	
	public void removerFuncionario(Funcionario funcionario){
		this.listaFuncionarios.remove(funcionario);
	}

	public Funcionario funcionarioComMaiorSalario() {
		Funcionario get = null;
		get = listaFuncionarios.get(0);
		for (Funcionario funcionario : listaFuncionarios) {
			if (funcionario.getSalario() > get.getSalario()) {
				get = funcionario;
			}
		}

		return get;
	}
	
	
	
	public ArrayList<Funcionario> listaFuncionarios (){
		return this.listaFuncionarios;
	}
	
	
	public Funcionario getFuncionario(int codigo) {
		Funcionario get = null;
		for (Funcionario funcionario : listaFuncionarios) {
			if (funcionario.getCodigo() == codigo) {
				get = funcionario;
				break;
			}
		}

		return get;
	}
	
	
	
}
