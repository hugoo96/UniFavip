package model.funcionario;

public class Horista extends Funcionario {
	private double valorHora;
	private int quantidadeDeHoras;
	
	public int getQuantidadeDeHoras() {
		return quantidadeDeHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public void setQuantidadeDeHoras(int quantidadeDeHoras) {
		this.quantidadeDeHoras = quantidadeDeHoras;
	}
	
	public void salarioPorHoras(){
		double salario = this.getValorHora() * this.getQuantidadeDeHoras();
		
		this.setSalario(salario);
		
	}

	@Override
	public String toString() {
		return "Horista [valorHora=" + valorHora + ", quantidadeDeHoras=" + quantidadeDeHoras + ", codigo=" + codigo
				+ ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	
	
	
}
