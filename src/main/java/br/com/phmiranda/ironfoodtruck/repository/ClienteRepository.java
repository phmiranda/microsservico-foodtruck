/*
 * Project: ironfoodtruck
 * Task/User Story: nº 99
 * Jira Project: GRUPOCDC
 * Description: N/A
 */

package br.com.phmiranda.ironfoodtruck.repository;

import br.com.phmiranda.ironfoodtruck.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
