/**
 * Project: ironfood
 * Date: 15/06/2020
 * User: phmiranda
 * Descrição:
 */
package br.com.phmiranda.ironfood.repository;

import br.com.phmiranda.ironfood.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

}
