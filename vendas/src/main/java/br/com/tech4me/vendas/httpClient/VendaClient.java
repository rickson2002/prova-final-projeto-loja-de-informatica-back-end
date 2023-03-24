package br.com.tech4me.vendas.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tech4me.vendas.model.InfomaticaLoja;


@FeignClient("informatica")
public interface VendaClient {

    @RequestMapping(method = RequestMethod.GET, value ="/montagem/{id}")
    InfomaticaLoja obterPc(@PathVariable String id);

    
}
