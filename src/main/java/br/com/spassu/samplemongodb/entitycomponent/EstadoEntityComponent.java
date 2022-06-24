
package br.com.spassu.samplemongodb.entitycomponent;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.spassu.samplemongodb.dto.EstadoDto;
import br.com.spassu.samplemongodb.model.Estado;
import br.com.spassu.samplemongodb.repository.EstadoRepository;

@Component
public class EstadoEntityComponent {

	private final EstadoRepository estadoRepository;

	@Autowired
	public EstadoEntityComponent(EstadoRepository estadoRepository) {
		this.estadoRepository = estadoRepository;
	}

	public Estado buscarPorId(String idEstado) {

		final Optional<Estado> estadoOpt = this.estadoRepository.findById(UUID.fromString(idEstado));

		if (!estadoOpt.isPresent()) {
			return null;
		}

		final Estado estado = estadoOpt.get();

		return estado;
	}
	
	public List<Estado> buscarTodos() {

		final List<Estado> estados = this.estadoRepository.findAll();
		
		return estados;
	}

	public Estado criarEstado(EstadoDto estadoDto) {

		Estado estado = new Estado();
		estado.setCodigoIbge(estadoDto.getCodigoIbge());
		estado.setNome(estadoDto.getNome());
		estado.setUf(estadoDto.getUf());

		estado = this.estadoRepository.save(estado);

		return estado;
	}

	public void removerPorId(String idEstado) {

		final Estado estado = this.buscarPorId(idEstado);
		this.estadoRepository.delete(estado);

	}
}
