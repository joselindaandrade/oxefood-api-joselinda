package br.com.ifpe.oxefood.modelo.cliente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import br.com.ifpe.oxefood.util.entity.EntidadeNegocio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EnderecoCliente")
@Where(clause = "habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoCliente extends EntidadeAuditavel {

   @Column
   private String descricao;

public void setCliente(Cliente cliente) {
}

public Object getRua() {
    return null;
}

public void setRua(Object rua) {
}

public Object getNumero() {
    return null;
}

public Object getBairro() {
    return null;
}

public Object getCep() {
    return null;
}

public Object getCidade() {
    return null;
}

public Object getEstado() {
    return null;
}

public Object getComplemento() {
    return null;
}

public void setNumero(Object numero) {
}

public void setCidade(Object cidade) {
}

public void setBairro(Object bairro) {
}

public void setCep(Object cep) {
}

public void setEstado(Object estado) {
}

public void setComplemento(Object complemento) {
}

public EntidadeNegocio getCliente() {
    return null;
}

}