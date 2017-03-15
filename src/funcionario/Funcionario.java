package funcionario;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	protected int quantidadeDeHoras;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getQuantidadeDeHoras() {
		return quantidadeDeHoras;
	}
	public void setQuantidadeDeHoras(int quantidadeDeHoras) {
		this.quantidadeDeHoras = quantidadeDeHoras;
	}
	
	@Override
	public String toString() {
		return "nome=" + nome + ", salario=" + salario + ", quantidadeDeHoras=" + quantidadeDeHoras;
	}
	
	public double verificaValorHora(){
		
		int quantidade = (this.quantidadeDeHoras * 5) * 5;
		
		return (this.salario/quantidade);
		
	}
	
}
