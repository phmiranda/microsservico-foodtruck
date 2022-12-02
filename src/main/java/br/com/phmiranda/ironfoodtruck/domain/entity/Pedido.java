/*
 * Project: ironfoodtruck
 * Task/User Story: nº 99
 * Jira Project: GRUPOCDC
 * Description: N/A
 */

package br.com.phmiranda.ironfoodtruck.domain.entity;

import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "pedidos")
@EqualsAndHashCode
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
