package br.com.tech4me.vendas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.vendas.service.VendasService;
import br.com.tech4me.vendas.shared.VendasCompletoDto;
import br.com.tech4me.vendas.shared.VendasDto;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/vendas")
public class VendasController {
    
    @Autowired
    private VendasService servico;

    @PostMapping
    public ResponseEntity<VendasCompletoDto> cadastrarVenda(@RequestBody @Valid VendasCompletoDto venda)
    {
        return new ResponseEntity<>(servico.CadastrarVenda(venda), HttpStatus.CREATED);
    
    }
    
    @GetMapping
    public ResponseEntity<List<VendasCompletoDto>> obterVendas()
    {
            return new  ResponseEntity<>(servico.obterVendas(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VendasDto> obterVendaPorId(@PathVariable String id)
    {

            Optional<VendasDto> retorno = servico.obterVendaPorId(id);

            if(retorno.isPresent()){
                return new ResponseEntity<>(retorno.get(), HttpStatus.FOUND);
            }else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }    

        }

        @DeleteMapping("/{id}")
         public ResponseEntity<Void> excluirVenda(@PathVariable String id)
         {
            servico.excluirVenda(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

         }


         @PutMapping("/{id}")
         public ResponseEntity<VendasDto> atualizarVenda(@PathVariable String id, @Valid VendasDto venda){
                Optional<VendasDto> retorno = servico.atualizarVendaPorId(id, venda);

                if(retorno.isPresent()){
                    return new ResponseEntity<>(retorno.get(),HttpStatus.ACCEPTED);
                }else{
                    return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
                }
            }


         }