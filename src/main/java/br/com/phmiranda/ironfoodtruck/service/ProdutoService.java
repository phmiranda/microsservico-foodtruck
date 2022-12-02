/*
 * Project: ironfoodtruck
 * Task/User Story: nº 99
 * Jira Project: GRUPOCDC
 * Description: N/A
 */

package br.com.phmiranda.ironfoodtruck.service;

import br.com.phmiranda.ironfoodtruck.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;
}
