package br.com.ifpe.oxefood.modelo.cliente;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {

   @NotNull(message = "O Nome é de preenchimento obrigatório")//n nulo
   @NotBlank(message = "O Nome é de preenchimento obrigatório")//n vazio
   @Length(max = 100, message = "O Nome deverá ter no máximo {max} caracteres")




   private String Titulo;

   @NotBlank(message = "O Email é de preenchimento obrigatório")
   @Email
   private String email;

   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataNascimento;




     @NotNull(message = "O CPF é de preenchimento obrigatório")
   @NotBlank(message = "O CPF é de preenchimento obrigatório")
   @CPF

   private String cpf;

   @Length(min = 8, max = 20, message = "O campo Fone tem que ter entre {min} e {max} caracteres")//tamanho min/max
   private String foneCelular;

   private String foneFixo;

   public Cliente build() {

      return Cliente.builder()
            .email(email)
            .nome(Titulo)
            .dataNascimento(dataNascimento)
            .cpf(cpf)
            .foneCelular(foneCelular)
            .foneFixo(foneFixo)
            .build();
   }

}
