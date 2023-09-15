package br.com.ifpe.oxefood.api.Produto;

public class ProdutoRequest {


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequest {

   

   private String codigo;

   private String titulo;

   private String descricao;

   private Double valorUnitario;

   private Interger tempoEntregaMinimo;

   private Interger tempoEntregaMaximo;


   
   public Produto build() {

       return Produto.builder()
               .codigo(codigo)
               .titulo(titulo)
               .descricao(descricao)
               .valorUnitario(valorUnitario)
               .tempoEntregaMinimo(tempoEntregaMinimo)
               .tempoEntregaMaximo(tempoEntregaMaximo)
               .build();
   }
}

}