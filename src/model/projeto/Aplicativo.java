package model.projeto;

import java.util.Date;

public class Aplicativo extends Projeto{
	
    private double custoHospedagem;

    public Aplicativo(String nome, Date prazo, double custoHospedagem) {
        super(nome, prazo);
    }

    public double getCustoHospedagem() {
        return custoHospedagem;
    }

    public void setCustoHospedagem(double custoHospedagem) {
        this.custoHospedagem = custoHospedagem;
    }

    @Override
    public double calculaOrcamento(Date d) {
        Date atual = new Date();
        int dias;
        for(dias = 0; d.after(atual); dias++){
            d.setDate(d.getDate()-1);
        }
        return dias*140;
    }
    
     @Override
    public String toString() {
        return "\nNome do Projeto: "+nome+"\nPrazo de entra: "+prazo+"\nCusto da hospedagem: "+custoHospedagem+"\nValor do projeto: "+orcamento;
    }   

}
