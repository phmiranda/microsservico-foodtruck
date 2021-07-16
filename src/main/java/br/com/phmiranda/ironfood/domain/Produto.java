/**
 * User: phmiranda
 * Project: ironfood
 * Description: this class execute...!
 * Date: 15/06/2020
 */

package br.com.phmiranda.ironfood.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "produtos")
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
