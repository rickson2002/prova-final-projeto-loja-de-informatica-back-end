package br.com.tech4me.vendas.model;

import java.util.List;

public class InfomaticaLoja {
    
    private String modeloDoGabinete;
    private List<String> listaDePecas;
    private String tamanhoDoGabinete;

    public String getModeloDoGabinete() {
        return modeloDoGabinete;
    }
    public void setModeloDoGabinete(String modeloDoGabinete) {
        this.modeloDoGabinete = modeloDoGabinete;
    }
    public List<String> getListaDePecas() {
        return listaDePecas;
    }
    public void setListaDePecas(List<String> listaDePecas) {
        this.listaDePecas = listaDePecas;
    }
    public String getTamanhoDoGabinete() {
        return tamanhoDoGabinete;
    }
    public void setTamanhoDoGabinete(String tamanhoDoGabinete) {
        this.tamanhoDoGabinete = tamanhoDoGabinete;
    }
    

  
}
