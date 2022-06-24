
package br.com.spassu.samplemongodb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spassu.samplemongodb.dto.EstadoDto;
import br.com.spassu.samplemongodb.model.Estado;
import br.com.spassu.samplemongodb.service.EstadoService;

@RestController
@RequestMapping(value = "estados")
public class EstadoController {

	private final EstadoService estadoService;

	@Autowired
	public EstadoController(EstadoService estadoService) {
		this.estadoService = estadoService;
	}

	@GetMapping("/{idEstado}")
	public ResponseEntity<Estado> obterEstado(@PathVariable String idEstado) {

		final Estado estado = this.estadoService.obterEstado(idEstado);
		return ResponseEntity.ok().body(estado);
	}

	@GetMapping
	public ResponseEntity<List<Estado>> listarEstados() {

		final List<Estado> estados = this.estadoService.listarEstados();
		return ResponseEntity.ok().body(estados);
	}

	@PostMapping
	public ResponseEntity<Estado> salvarEstado(@RequestBody EstadoDto estado) {

		final Estado estadoDTOReturn = this.estadoService.salvarEstado(estado);
		return ResponseEntity.ok().body(estadoDTOReturn);
	}

	@DeleteMapping("/{idEstado}")
	public ResponseEntity<Void> excluirEstado(@PathVariable String idEstado) {

		this.estadoService.excluirEstado(idEstado);
		return ResponseEntity.ok().build();
	}

}
