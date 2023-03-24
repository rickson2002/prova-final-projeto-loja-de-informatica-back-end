package br.com.tech4me.informaticaloja.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.informaticaloja.service.InformaticaLojaService;
import br.com.tech4me.informaticaloja.shared.InformaticaLojaDto;
import br.com.tech4me.informaticaloja.shared.InformaticaLojaDtoCompleto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/montagem")
public class InformaticaLojaController {
    @Autowired
    private  InformaticaLojaService servico;

    @PostMapping
    public ResponseEntity<InformaticaLojaDtoCompleto> cadastrarPc(@RequestBody @Valid InformaticaLojaDtoCompleto pc){
      return new ResponseEntity<>(servico.cadastrarPc(pc), HttpStatus.CREATED); 
    }
  
    @GetMapping
    public ResponseEntity<List<InformaticaLojaDtoCompleto>> obterTodas() {
      return new ResponseEntity<>(servico.obterTodas(), HttpStatus.OK);
    }
  
    @GetMapping("/{id}")
    public ResponseEntity<InformaticaLojaDto> obterPc(@PathVariable String id) {
      Optional<InformaticaLojaDto> retorno = servico.obterPorId(id);
  
      if (retorno.isPresent()) {
        return new ResponseEntity<>(retorno.get(), HttpStatus.OK);
      } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
  
    }
  
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirpc(@PathVariable String id){
      servico.excluirPorId(id);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
  
    @PutMapping("/{id}")
    public ResponseEntity<InformaticaLojaDtoCompleto> atualizarPc(@PathVariable String id, @RequestBody InformaticaLojaDtoCompleto pc){
      Optional<InformaticaLojaDtoCompleto> retorno = servico.atualizarPorId(id, pc); 
  
      if (retorno.isPresent()) {
        return new ResponseEntity<>(retorno.get(), HttpStatus.ACCEPTED);
      } else {
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
      }
     
    }
  
    @GetMapping("/porta")
    public String obterPorta(@Value("${local.server.port}") String porta){
      return "A instância que respondeu a requisição está rodando na porta" + porta;
    }
    
  }
  


    


    

