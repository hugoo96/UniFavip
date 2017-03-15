package funcionario;

public class Design extends Funcionario {

	private int nivelDeExperiencia;

	public int getNivelDeExperiencia() {
		return nivelDeExperiencia;
	}

	public void setNivelDeExperiencia(int nivelDeExperiencia) {
		this.nivelDeExperiencia = nivelDeExperiencia;
	}

	@Override
	public String toString() {
		return "Design [nivelDeExperiencia=" + nivelDeExperiencia + ", nome=" + nome + ", salario=" + salario
				+ ", quantidadeDeHoras=" + quantidadeDeHoras + "]";
	}

	public void mudaSalarioNivelExperiencia() {

		if (getNivelDeExperiencia() > 0) {
			switch (getNivelDeExperiencia()) {
			case 2:
				this.setSalario(this.salario + 200);
				break;
			case 3:
				this.setSalario(this.salario + 400);
				break;
			case 4:
				this.setSalario(this.salario + 600);
				break;
			case 5:
				this.setSalario(this.salario + 1000);
				break;
			default:
				break;
			}
		}else{
			System.out.println("Adicione um nível de experiência antes");
		}

	}

}
