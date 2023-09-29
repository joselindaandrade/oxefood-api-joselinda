package br.com.ifpe.oxefood.modelo.entregador;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Entregador")
@Where(clause = "habilitado = true")
@Builder
/**
 * @return
 */
/**
 * @return
 */
/**
 * @return
 */
@Getter
/**
 * @param foneFixo
 */
@Setter
/**
 * @param nome
 * @param dataNascimento
 * @param cpf
 * @param foneCelular
 * @param foneFixo
 */
/**
 * @param nome
 * @param dataNascimento
 * @param cpf
 * @param foneCelular
 * @param foneFixo
 */
@AllArgsConstructor
/**
 * 
 */
@NoArgsConstructor
public class Entregador extends EntidadeAuditavel  {

   @Column
   private String nome;

   @Column
   private String cpf;

   @Column
   private String rg;

   @Column
   private LocalDate dataNascimento;


   @Column
   private String foneCelular;

   @Column
   private String foneFixo;

    @Column
   private String qtdEntregasRealizada;

    @Column
   private String ValorFrete;

    @Column
   private String EnderecoCompleto;
     
   @Column
   private String EnderecoComplemento;



}


