package model.projeto;

import java.util.Date;

public class Site extends Projeto{
	
    private String url;    
    
    public Site(String nome, Date prazo, String url) {
        super(nome, prazo);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public double calculaOrcamento(Date d) {
        Date atual = new Date();
        int dias;
        for(dias = 0; d.after(atual); dias++){
            d.setDate(d.getDate()-1);
        }
        return dias*80;
    }
    
         @Override
    public String toString() {
        return "\nNome do Projeto: "+nome+"\nPrazo de entra: "+prazo+"\nEndereço do site: "+url+"\nValor do projeto: "+orcamento;
    } 

}
