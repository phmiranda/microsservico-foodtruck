/*
 * Project: ironfoodtruck
 * Task/User Story: nº 99
 * Jira Project: GRUPOCDC
 * Description: N/A
 */

package br.com.phmiranda.ironfoodtruck.domain.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "produtos")
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_produto")
    private String nomeProduto;

    @Column(name = "valor_unitario")
    private Double valorUnitario;
}
