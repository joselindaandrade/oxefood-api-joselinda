package br.com.ifpe.oxefood.modelo.empresa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefood.modelo.acesso.Usuario;
import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Empresa")
@Where(clause = "habilitado = true")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Empresa extends EntidadeAuditavel {

    //@ManyToOne
    //@JoinColumn(nullable = false)
    //private Usuario usuario;

    @Column
    private String site;

    @Column
    private String cnpj;

    @Column
    private String inscricaoEstadual;

    @Column
    private String nomeEmpresarial;

    @Column
    private String nomeFantasia;

    @Column
    private String fone;

    @Column
    private String foneAlternativo;

}