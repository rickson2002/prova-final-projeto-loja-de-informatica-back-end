package br.com.tech4me.vendas.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.vendas.shared.VendasCompletoDto;
import br.com.tech4me.vendas.shared.VendasDto;

public interface VendasService {

    List<VendasCompletoDto> obterVendas();
    Optional<VendasDto> obterVendaPorId(String id);
    void excluirVenda(String id);
    VendasCompletoDto CadastrarVenda(VendasCompletoDto venda);
    Optional<VendasDto> atualizarVendaPorId(String id, VendasDto dto);


}
