
package br.com.spassu.samplemongodb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spassu.samplemongodb.model.Cidade;
import br.com.spassu.samplemongodb.service.CidadeService;

@RestController
@RequestMapping(value = "cidades")
public class CidadeController {

	private final CidadeService cidadeService;

	@Autowired
	public CidadeController(CidadeService cidadeService) {
		this.cidadeService = cidadeService;
	}

	@GetMapping("/{idCidade}")
	public ResponseEntity<Cidade> obterCidade(@PathVariable String idCidade) {

		final Cidade cidade = this.cidadeService.obterCidade(idCidade);
		return ResponseEntity.ok().body(cidade);
	}

	@GetMapping
	public ResponseEntity<List<Cidade>> listarCidades() {

		final List<Cidade> cidades = this.cidadeService.listarCidades();
		return ResponseEntity.ok().body(cidades);
	}
}
