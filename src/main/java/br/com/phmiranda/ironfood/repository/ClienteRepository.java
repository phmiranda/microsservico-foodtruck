/*
 * Author: Pedro
 * Project: ironfood
 * User Story: HUXXX - TITLE OF USER HISTORY
 * Description: DESCRIPTION OF USER HISTORY
 * Date: 07/07/2021
 */

package br.com.phmiranda.ironfood.repository;

import br.com.phmiranda.ironfood.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
