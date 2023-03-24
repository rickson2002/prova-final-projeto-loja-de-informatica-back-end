package br.com.tech4me.informaticaloja.shared;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class InformaticaLojaDtoCompleto {
    private String id;
    @NotEmpty(message="modelo do gabinete tem que ser informado")
    @NotBlank(message="ERROR falta de Caracteres  Falta informação")
    private String modeloDoGabinete;
    private List<String> listaDePecas;
    @Size(min=3, max=3, message="Informe 21, 22, ou 27")
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

