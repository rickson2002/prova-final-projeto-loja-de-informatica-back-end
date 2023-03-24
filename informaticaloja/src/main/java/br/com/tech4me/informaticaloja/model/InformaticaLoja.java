package br.com.tech4me.informaticaloja.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("pc")
public class InformaticaLoja {

    @Id
    private String id;
    private String modeloDoGabinete;
    private List<String> listaDePecas;
    private String tamanhoDoGabinete;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
