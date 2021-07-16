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
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pedidos")
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "data_lancamento")
    private Date dataLancamento;

    @Column(name = "valor_total")
    private Double valorTotal;

    @ManyToOne(optional = true)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToMany
    @Cascade(CascadeType.MERGE)
    @JoinColumn(name = "produto_id")
    private List<Produto> produto;
}
