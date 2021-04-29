/**
 * User: phmiranda
 * Project: ironfood
 * Description: this class execute...!
 * Date: 15/06/2020
 */

package br.com.phmiranda.ironfood.repository;

import br.com.phmiranda.ironfood.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

}
