package br.com.tech4me.vendas.shared;

import jakarta.validation.constraints.Positive;

public class VendasCompletoDto {
    
    private String id;
    private String nomeCliente;
    private String idGabrinete;
    @Positive
    private Double  valorTotal;


    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getIdGabrinete() {
        return idGabrinete;
    }
    public void setIdGabrinete(String idGabrinete) {
        this.idGabrinete = idGabrinete;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
