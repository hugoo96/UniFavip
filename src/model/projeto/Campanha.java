package model.projeto;

import java.util.Date;

public class Campanha extends Projeto{
	
    private String local;

public Campanha(String nome, Date prazo, String local) {
    super(nome, prazo);
}

public String getLocal() {
    return local;
}

public void setLocal(String local) {
    this.local = local;
}

@Override
public double calculaOrcamento(Date d) {
    Date atual = new Date();
    int dias;
    for(dias = 0; d.after(atual); dias++){
        d.setDate(d.getDate()-1);
    }
    return dias*120;
}

@Override
public String toString() {
    return "\nNome do Projeto: "+nome+"\nPrazo de entra: "+prazo+"\nLocal da campanha: "+local+"\nValor do projeto: "+orcamento;
}

}
