package br.com.tech4me.informaticaloja.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.informaticaloja.model.InformaticaLoja;

public interface InformaticaLojaRepositorio extends MongoRepository<InformaticaLoja, String> {
    


}
