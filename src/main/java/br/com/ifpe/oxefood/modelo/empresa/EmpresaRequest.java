public class EmpresaRequest {

    private String chave;


    private String fone;

    private String foneAlternativo;
    
    private String email;

    private String password;
    
    private String perfil;
    
    public Empresa buildEmpresa() {

	Object inscricaoEstadual;
    Object nomeEmpresarial;
    Object nomeFantasia;
    Object cnpj;
    Object site;
    Empresa empresa = Empresa.builder()
		.chave(chave)
		.usuario(buildUsuario())
		.site(site)
		.cnpj(cnpj)
		.inscricaoEstadual(inscricaoEstadual)
		.nomeEmpresarial(nomeEmpresarial)
		.nomeFantasia(nomeFantasia)
		.fone(fone)
		.foneAlternativo(foneAlternativo)
		.build();

	return empresa;
    }
    
    public Empresa buildUsuario() {
	
	return Empresa.builder()
		.username(email)
		.password(password)
		.build();
    }
}
