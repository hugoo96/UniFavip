package funcionario;

public class Gerente extends Funcionario {
	private double gratificacao;

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
	
	public boolean temGratificao(){
		if (getGratificacao() == 0){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public String toString() {
		return "Gerente [gratificacao=" + gratificacao + ", nome=" + nome + ", salario=" + salario
				+ ", quantidadeDeHoras=" + quantidadeDeHoras + "]";
	}
	
	
	
}
