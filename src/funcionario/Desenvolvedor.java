package funcionario;

public class Desenvolvedor extends Funcionario {
	private String educacao;

	
	@Override
	public String toString() {
		return "Desenvolvedor [educacao=" + educacao + ", nome=" + nome + ", salario=" + salario
				+ ", quantidadeDeHoras=" + quantidadeDeHoras + "]";
	}

	public String getEducacao() {
		return educacao;
	}

	public void setEducacao(String educacao) {
		this.educacao = educacao;
	}

	public void mudaSalarioPorEducacao() {
		if (getEducacao() != "") {
			switch (getEducacao()) {
			case "superior":
				this.setSalario(this.salario + 500);
				break;
			case "pós-graduação":
				this.setSalario(this.salario + 1000);
				break;
			default:
				break;
			}
		}else{
			System.out.println("Adicione uma educação ao Desenvolvedor");
		}
	}

}
