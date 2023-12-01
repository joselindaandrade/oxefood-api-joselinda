package br.com.ifpe.oxefood.modelo.empresa;

Service
public class EmpresaService extends GenericService {

    @Autowired
    private EmpresaRepository repository;
    
    @Autowired
    private UsuarioService usuarioService;

    @Transactional
    public Empresa save(Empresa empresa) {
	
	usuarioService.save(empresa.getUsuario());

	super.preencherCamposAuditoria(empresa);
	return repository.save(empresa);
    }

}
