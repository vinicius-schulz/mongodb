
package br.com.spassu.samplemongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spassu.samplemongodb.dto.EstadoDto;
import br.com.spassu.samplemongodb.entitycomponent.EstadoEntityComponent;
import br.com.spassu.samplemongodb.model.Estado;

@Service
public class EstadoService {

	private final EstadoEntityComponent estadoEntityComponent;

	@Autowired
	public EstadoService(EstadoEntityComponent estadoEntityComponent) {
		this.estadoEntityComponent = estadoEntityComponent;

	}

	public Estado obterEstado(String idEstado) {

		final Estado estado = this.estadoEntityComponent.buscarPorId(idEstado);

		return estado;
	}

	public Estado salvarEstado(EstadoDto estadoDto) {

		final Estado estado = this.estadoEntityComponent.criarEstado(estadoDto);

		return estado;
	}

	public void excluirEstado(String idEstado) {

		this.estadoEntityComponent.removerPorId(idEstado);
	}

	public List<Estado> listarEstados() {
		
		final List<Estado> estados = this.estadoEntityComponent.buscarTodos();
		
		return estados;
	}
}
