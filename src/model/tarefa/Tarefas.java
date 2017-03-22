package model.tarefa;

import java.util.ArrayList;

public class Tarefas {
	
private static Tarefas instancia;
	
	private ArrayList<CriacaoAudioVisual> listaCriacaoAudioVisual;
	private ArrayList<CriacaoGrafica> listaCriacaoGrafica;
	private ArrayList<CriacaoEditorial>listaCriacaoEditorial;
	

	private Tarefas() {
		this.listaCriacaoAudioVisual = new ArrayList<CriacaoAudioVisual>();
		this.listaCriacaoGrafica = new ArrayList<CriacaoGrafica>();
		this.listaCriacaoEditorial = new ArrayList<CriacaoEditorial>();
	}

	public static Tarefas getInstancia() {

		if (instancia == null) {
			synchronized (Tarefas.class) {
				if (instancia == null) {
					instancia = new Tarefas();
				
			}
		}
			
		}
		return instancia;
	}
	
	public void adicionarCriacaoAudioVisual(CriacaoAudioVisual cav){
        this.listaCriacaoAudioVisual.add(cav);
	}
	public void adicionarCriacaoGrafica(CriacaoGrafica cg){
		this.listaCriacaoGrafica.add(cg);
	}
	public void adicionarCriacaoEditorial(CriacaoEditorial ce){
		this.listaCriacaoEditorial.add(ce);
	}
	public void removerCriacaoAudioVisual(CriacaoAudioVisual cav){
        this.listaCriacaoAudioVisual.remove(cav);
	}
	public void removerCriacaoGrafica(CriacaoGrafica cg){
		this.listaCriacaoGrafica.remove(cg);
	}
	public void removerCriacaoEditorial(CriacaoEditorial ce){
		this.listaCriacaoEditorial.remove(ce);
	}
	

}
