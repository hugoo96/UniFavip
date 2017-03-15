package funcionario;

import java.util.ArrayList;

import funcionario.Desenvolvedor;
import funcionario.Design;
import funcionario.Funcionario;
import funcionario.Funcionarios;
import funcionario.Gerente;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desenvolvedor desenvolvedor = new Desenvolvedor();
		
		desenvolvedor.setNome("Desenvolvedor teste");
		desenvolvedor.setSalario(2000);
		desenvolvedor.setQuantidadeDeHoras(8);
		desenvolvedor.setEducacao("superior");
		desenvolvedor.mudaSalarioPorEducacao();
		
		System.out.println(desenvolvedor);
		
		Design design = new Design();
		design.setNome("Design teste");
		design.setSalario(1500);
		design.setQuantidadeDeHoras(8);
		design.setNivelDeExperiencia(0);
		
		System.out.println(design);
		
		Gerente gerente = new Gerente();
		gerente.setNome("Gerente teste");
		gerente.setSalario(5000);
		gerente.setQuantidadeDeHoras(8);
		gerente.setGratificacao(200);
		System.out.println(gerente);
		if (gerente.temGratificao()){
			System.out.println("Gerente tem gratificação");
		}else {
			System.out.println("Gerente não tem gratificação");

		}
		
		Funcionarios funcionarios = Funcionarios.getInstancia();
		
		funcionarios.adicionarDesenvolvedor(desenvolvedor);
		funcionarios.adicionarDesign(design);
		funcionarios.adicionarGerente(gerente);
		
		ArrayList<Funcionario> lista = funcionarios.listaTodos();
		for (Funcionario teste : lista) {
			System.out.println(teste);
		}
		
		System.out.println(funcionarios.funcionarioComMaiorSalario());
	}

}
