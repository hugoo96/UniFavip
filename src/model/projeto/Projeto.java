package model.projeto;

import java.util.Date;

public abstract class Projeto {

    protected String nome;
    protected Date prazo;
    protected double orcamento;

    public Projeto(String nome, Date prazo){
        this.nome = nome;
        this.prazo = prazo;
        this.orcamento = calculaOrcamento(prazo);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }
    
    public abstract double calculaOrcamento(Date d);

    @Override
    public String toString() {
        return "\nNome do Projeto: "+nome+"\nPrazo de Entrega: "+prazo+"\nValor do Projeto: "+orcamento;
    }
    
}
