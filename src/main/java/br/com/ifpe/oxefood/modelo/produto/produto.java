package br.com.ifpe.oxefood.modelo.produto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="Produto")
@Where(clause = "habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto extends EntidadeAuditavel  {

    @ManyToOne
   private CategoriaProduto categoria;

   
    @Column
   private String codigo;

   @Column
   private String  titulo;

   @Column
   private String descricao;

   @Column
   private Double valorUnitario;
   
   @Column
   private Integer tempoEntregaMinimo;

    @Column
   private Integer tempoEntregaMaximo;

    public Produto save(Produto produtoNovo) {
        return null;
    }

    public Produto findById(Long id) {
        return null;
    }

    public void update(Long id, Produto produto) {
    }

    public void delete(Long id) {
    }

    public List<Produto> filtrar(String codigo2, String titulo2, Long idCategoria) {
        return null;
    }

    public List<Produto> findAll() {
        return null;
    }

}