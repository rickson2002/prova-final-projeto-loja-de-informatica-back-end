package br.com.tech4me.vendas.shared;

import br.com.tech4me.vendas.model.InfomaticaLoja;



public class VendasDto {
    private String nomeCliente;
    private String idGabrinete;
    private InfomaticaLoja dadosPc;
    private Double  valorTotal;

    
    public InfomaticaLoja getDadosPc() {
        return dadosPc;
    }
    public void setDadosPc(InfomaticaLoja dadosPc) {
        this.dadosPc = dadosPc;
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