package br.com.tech4me.informaticaloja.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.informaticaloja.model.InformaticaLoja;
import br.com.tech4me.informaticaloja.repository.InformaticaLojaRepositorio;
import br.com.tech4me.informaticaloja.shared.InformaticaLojaDto;
import br.com.tech4me.informaticaloja.shared.InformaticaLojaDtoCompleto;
@Service
public class InformaticaLojaServiceimpl  implements InformaticaLojaService {
    @Autowired
        private InformaticaLojaRepositorio repositorio;


    @Override
    public List<InformaticaLojaDtoCompleto> obterTodas() {
        List<InformaticaLoja> pcs = repositorio.findAll();

 return pcs.stream()
        .map(p -> new ModelMapper().map(p, InformaticaLojaDtoCompleto.class))
        .collect(Collectors.toList());
}
        
    

    @Override
    public Optional<InformaticaLojaDto> obterPorId(String id) {
        Optional<InformaticaLoja> pc  = repositorio.findById(id);
        if (pc.isPresent()) {
            return Optional.of(new ModelMapper().map(pc.get(), InformaticaLojaDto.class));
          }
          return Optional.empty();
        }
    

    @Override
    public void excluirPorId(String id) {
        repositorio.deleteById(id);
        
    }

    @Override
    public InformaticaLojaDtoCompleto cadastrarPc(InformaticaLojaDtoCompleto dto) {
        InformaticaLoja pc = new ModelMapper().map(dto, InformaticaLoja.class);
        repositorio.save(pc);
        return new ModelMapper().map(pc, InformaticaLojaDtoCompleto.class);  
    }

    @Override
    public Optional<InformaticaLojaDtoCompleto> atualizarPorId(String id, InformaticaLojaDtoCompleto dto) {
        Optional<InformaticaLoja> retorno = repositorio.findById(id);

        if (retorno.isPresent()) {
            InformaticaLoja pc = new ModelMapper().map(dto, InformaticaLoja.class);
            pc.setId(id);
            repositorio.save(pc);
            return Optional.of(new ModelMapper().map(pc, InformaticaLojaDtoCompleto.class));
          } else {
            return Optional.empty();
          }
          
         
        }
}
    
  


