package br.com.tech4me.vendas.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.vendas.httpClient.VendaClient;
import br.com.tech4me.vendas.model.Vendas;
import br.com.tech4me.vendas.repository.VendasRepository;
import br.com.tech4me.vendas.shared.VendasCompletoDto;
import br.com.tech4me.vendas.shared.VendasDto;

@Service
public class VendasServiceimpl implements VendasService {
    
    @Autowired
    private VendasRepository repository;

    @Autowired
    private VendaClient vendaclient;


    @Override
    public List<VendasCompletoDto> obterVendas() {
        List<Vendas> vendas = repository.findAll();
        List<VendasCompletoDto> dto = vendas.stream().map(p -> new ModelMapper().map(p,  VendasCompletoDto.class)).collect(Collectors.toList());
        return dto;
    }

    @Override
    public Optional<VendasDto> obterVendaPorId(String id) {
        
        Optional<Vendas> venda = repository.findById(id);
        if(venda.isPresent()){
            VendasDto vendaComPc = new  ModelMapper().map(venda,  VendasDto.class);
            vendaComPc.setDadosPc(vendaclient.obterPc(vendaComPc.getIdGabrinete()));
            return Optional.of(vendaComPc);
        } else{
            return Optional.empty();

        }
    
    }

    @Override
    public void excluirVenda(String id) {
        repository.deleteById(id);
        
    }

    @Override
    public VendasCompletoDto CadastrarVenda(VendasCompletoDto dto) {
        Vendas venda = new ModelMapper().map(dto,  Vendas.class);
        repository.save(venda);

        return new ModelMapper().map(venda, VendasCompletoDto.class);
    }

    @Override
    public Optional<VendasDto> atualizarVendaPorId(String id, VendasDto dto) {
        Optional<Vendas> retorno =  repository.findById(id);


        if(retorno.isPresent()){
            Vendas vendaRetorno = new ModelMapper().map(dto, Vendas.class);
            vendaRetorno.setId(id);
            repository.save(vendaRetorno);
            return Optional.of(new ModelMapper().map(vendaRetorno, VendasDto.class));


        }else{
            return Optional.empty();
        
            
        }




        
    }

}
