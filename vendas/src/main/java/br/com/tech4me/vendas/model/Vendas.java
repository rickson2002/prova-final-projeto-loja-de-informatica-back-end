package br.com.tech4me.vendas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("vendas")
public class Vendas {
    
    @Id
    private String id;
    private String nomeCliente;
    private String idGabrinete;
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
