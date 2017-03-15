package funcionario;

import java.util.ArrayList;

public class Funcionarios {

	private static Funcionarios instancia;

	private ArrayList<Gerente> listaGerentes;
	private ArrayList<Desenvolvedor> listaDesenvolvedores;
	private ArrayList<Design> listaDesigns;

	private Funcionarios() {
		this.listaGerentes = new ArrayList<>();
		this.listaDesenvolvedores = new ArrayList<>();
		this.listaDesigns = new ArrayList<>();
	}

	public static Funcionarios getInstancia() {

		if (instancia == null) {
			synchronized (Funcionarios.class) {
				if (instancia == null) {
					instancia = new Funcionarios();
				}
			}
		}

		return instancia;
	}

	public void adicionarGerente(Gerente gerente) {
		this.listaGerentes.add(gerente);

	}

	public void adicionarDesign(Design design) {
		this.listaDesigns.add(design);
	}

	public void adicionarDesenvolvedor(Desenvolvedor desenvolvedor) {
		this.listaDesenvolvedores.add(desenvolvedor);
	}

	public void removerGerente(Gerente gerente) {
		this.listaGerentes.remove(gerente);
	}

	public void removerDesign(Design design) {
		this.listaDesigns.remove(design);
	}

	public void removerDesenvolvedor(Desenvolvedor desenvolvedor) {
		this.listaDesenvolvedores.remove(desenvolvedor);
	}

	public ArrayList<Funcionario> listaTodos() {
		ArrayList<Funcionario> lista = new ArrayList<>();

		if (this.listaDesenvolvedores.size() > 0) {
			for (Funcionario funcionario : this.listaDesenvolvedores) {
				lista.add(funcionario);
			}
		}

		if (this.listaGerentes.size() > 0) {
			for (Funcionario funcionario : this.listaGerentes) {
				lista.add(funcionario);
			}
		}

		if (this.listaDesigns.size() > 0) {
			for (Funcionario funcionario : this.listaDesigns) {
				lista.add(funcionario);
			}
		}

		return lista;

	}

	public ArrayList<Gerente> retornaGerentes() {
		return this.listaGerentes;
	}

	public ArrayList<Desenvolvedor> retornaDesenvolvedores() {
		return this.listaDesenvolvedores;
	}

	public ArrayList<Design> retornaDesigns() {
		return this.listaDesigns;
	}

	public Funcionario funcionarioComMaiorSalario() {
		ArrayList<Funcionario> lista = new ArrayList<>();
		Funcionario get = null;
		if (this.listaDesenvolvedores.size() > 0) {
			for (Funcionario funcionario : this.listaDesenvolvedores) {
				lista.add(funcionario);
			}
		}

		if (this.listaGerentes.size() > 0) {
			for (Funcionario funcionario : this.listaGerentes) {
				lista.add(funcionario);
			}
		}

		if (this.listaDesigns.size() > 0) {
			for (Funcionario funcionario : this.listaDesigns) {
				lista.add(funcionario);
			}
		}
		get = lista.get(0);
		for (Funcionario funcionario : lista) {
			if (funcionario.getSalario() > get.getSalario()){
				get = funcionario;
			}
		}
		
		return get;
		
	}
	
	public Funcionario funcionarioComMaiorHorasTrabalhadas(){
		ArrayList<Funcionario> lista = new ArrayList<>();
		Funcionario get = null;
		if (this.listaDesenvolvedores.size() > 0) {
			for (Funcionario funcionario : this.listaDesenvolvedores) {
				lista.add(funcionario);
			}
		}

		if (this.listaGerentes.size() > 0) {
			for (Funcionario funcionario : this.listaGerentes) {
				lista.add(funcionario);
			}
		}

		if (this.listaDesigns.size() > 0) {
			for (Funcionario funcionario : this.listaDesigns) {
				lista.add(funcionario);
			}
		}
		get = lista.get(0);
		for (Funcionario funcionario : lista) {
			if (funcionario.getQuantidadeDeHoras() > get.getQuantidadeDeHoras()){
				get = funcionario;
			}
		}
		
		return get;
		
	}
	
	public int quantidadeDeFuncionarios(){
		ArrayList<Funcionario> lista = new ArrayList<>();

		if (this.listaDesenvolvedores.size() > 0) {
			for (Funcionario funcionario : this.listaDesenvolvedores) {
				lista.add(funcionario);
			}
		}

		if (this.listaGerentes.size() > 0) {
			for (Funcionario funcionario : this.listaGerentes) {
				lista.add(funcionario);
			}
		}

		if (this.listaDesigns.size() > 0) {
			for (Funcionario funcionario : this.listaDesigns) {
				lista.add(funcionario);
			}
		}

		return lista.size();
	}
	
	public int quantidadeDesenvolvedores(){
		return this.listaDesenvolvedores.size();
	}
	
	public int quantidadeDesign(){
		return this.listaDesigns.size();
	}
	
	public int quantidadeGerentes(){
		return this.listaGerentes.size();
	}
	

}
