package model.projeto;

import java.util.ArrayList;

public class Projetos {
	
    private static Projetos instance;
    private ArrayList<Aplicativo> listaAplicativo;
    private ArrayList<Campanha> listaCampanha;
    private ArrayList<Site> listaSite;
    private ArrayList<Projeto> listaProjetos = new ArrayList<>();
    
    private Projetos(){
        this.listaAplicativo = new ArrayList<>();
        this.listaCampanha = new ArrayList<>();
        this.listaSite = new ArrayList<>();
    }
    
    public synchronized Projetos getInstance(){
        if(instance == null){
            synchronized (Projetos.class) {
                if (instance == null){
                    instance = new Projetos();
                }
            }
        }
        return instance;
    }
    
    public void adicionaAplicativo(Aplicativo aplicativo){
        this.listaAplicativo.add(aplicativo);
    }
    public void excluiAplicativo(Aplicativo aplicativo){
        this.listaAplicativo.remove(aplicativo);
    }
    public ArrayList<Aplicativo> listarAplicativo(){
        return this.listaAplicativo;
    }
    public double lucroEmAplicativos(){
        double valorAplicativos = 0;
        for(int i = 0; i <= listaAplicativo.size(); i++){
            valorAplicativos = valorAplicativos+listaAplicativo.get(i).getOrcamento();
        }
        return valorAplicativos;
    }
    
    public void adicionaCampanha(Campanha campanha){
        this.listaCampanha.add(campanha);
    }
    public void excluiCampanha(Campanha campanha){
        this.listaCampanha.remove(campanha);
    }
    public ArrayList<Campanha> listarCampanhas(){
        return this.listaCampanha;
    }
    public double lucroEmCampanhas(){
        double valorCampanhas = 0;
        for(int i = 0; i <= listaCampanha.size(); i++){
            valorCampanhas = valorCampanhas+listaCampanha.get(i).getOrcamento();
        }
        return valorCampanhas;
    }
    
    public void adicionaSite(Site site){
        this.listaSite.add(site);
    }
    public void excluiSite(Site site){
        this.listaSite.remove(site);
    }
    public ArrayList<Site> listarSites(){
        return this.listaSite;
    }
    public double lucroSites(){
        double valorSites = 0;
        for(int i = 0; i <= listaSite.size(); i++){
            valorSites = valorSites+listaSite.get(i).getOrcamento();
        }
        return valorSites;
    }
    
    public ArrayList<Projeto> listaTodos(){

        
        if(this.listaAplicativo.size() > 0){
            for(Projeto projetos: this.listaAplicativo){
                listaProjetos.add(projetos);
            }
        }
    
        if(this.listaCampanha.size() > 0){
            for(Projeto projetos: this.listaCampanha){
                listaProjetos.add(projetos);
            }
        }
        if(this.listaSite.size() > 0){
            for(Projeto projetos: this.listaSite){
                listaProjetos.add(projetos);
            }
        }
        
        return listaProjetos;
    }
    
    public int quantidadeProjetos(){
        return this.listaProjetos.size();
    }
    
    public double lucroTotal(){
        double valor = 0;
        for(int i = 0; i <= listaProjetos.size(); i++){
            valor = valor+listaProjetos.get(i).getOrcamento();
        }
        return valor;
    }

}
