package br.com.tech4me.informaticaloja.service;



import java.util.List;
import java.util.Optional;

import br.com.tech4me.informaticaloja.shared.InformaticaLojaDto;
import br.com.tech4me.informaticaloja.shared.InformaticaLojaDtoCompleto;


public interface InformaticaLojaService {

    List<InformaticaLojaDtoCompleto> obterTodas();
    Optional<InformaticaLojaDto> obterPorId(String id);
    void excluirPorId(String id);
    InformaticaLojaDtoCompleto cadastrarPc(InformaticaLojaDtoCompleto dto);
    Optional<InformaticaLojaDtoCompleto> atualizarPorId(String id, InformaticaLojaDtoCompleto dto);
    

}
