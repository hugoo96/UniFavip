package model.funcionario;

public class Fixo extends Funcionario {
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double salarioComBonus(){
		
		if (getBonus() != 0){
			return this.getSalario() + getBonus();
		}else {
			return this.getSalario();
		}
		
	}

	@Override
	public String toString() {
		return "Fixo [bonus=" + bonus + ", codigo=" + codigo + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	
}
