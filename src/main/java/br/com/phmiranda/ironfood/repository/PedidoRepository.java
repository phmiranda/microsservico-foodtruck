/**
 * Project: ironfood
 * Date: 15/06/2020
 * User: phmiranda
 * Descrição:
 */
package br.com.phmiranda.ironfood.repository;

import br.com.phmiranda.ironfood.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {

}
