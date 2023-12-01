package br.com.ifpe.oxefood.modelo.empresa;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefood.modelo.produto.CategoriaProdutoService;
import br.com.ifpe.oxefood.modelo.produto.Produto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/produto")
@CrossOrigin
public class EmpresaController extends GenericController {

    @Autowired
    private EmpresaService empresaService;

    @PostMapping
    public ResponseEntity<Empresa> save(@RequestBody @Valid EmpresaRequest request) {

	Empresa empresa = request.buildEmpresa();
	
	if (request.getPerfil() != null && !"".equals(request.getPerfil())) {
	    if (request.getPerfil().equals("Usuario")) {
		empresa.getUsuario().getRoles().add(Usuario.ROLE_EMPRESA_USER);
	    } else if (request.getPerfil().equals("Admin")) {
		empresa.getUsuario().getRoles().add(Usuario.ROLE_EMPRESA);
	    }
	}
	
	Empresa empresaCriada = empresaService.save(empresa);
	return new ResponseEntity<Empresa>(empresaCriada, HttpStatus.CREATED);
    }



    

    // Alterar
    @PutMapping("/{id}")
    public ResponseEntity<Produto> update(@PathVariable("id") Long id, @RequestBody EmpresaRequest request) {

        Empresa empresa = request.build();
        empresa.setCategoria(categoriaEmpresaService.findById(request.getIdCategoria()));
        EmpresaService.update(id, empresa);

        return ResponseEntity.ok().build();
    }

    // Desabilitar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        empresaService.delete(id);
        return ResponseEntity.ok().build();

    }

    @PostMapping("/filtrar")
    public List<Produto> filtrar(
            @RequestParam(value = "codigo", required = false) String codigo,
            @RequestParam(value = "titulo", required = false) String titulo,
            @RequestParam(value = "idCategoria", required = false) Long idCategoria) {

        return empresaService.filtrar(codigo, titulo, idCategoria);
    }

}

