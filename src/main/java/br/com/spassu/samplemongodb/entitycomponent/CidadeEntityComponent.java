
package br.com.spassu.samplemongodb.entitycomponent;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.spassu.samplemongodb.model.Cidade;
import br.com.spassu.samplemongodb.repository.CidadeRepository;

@Component
public class CidadeEntityComponent {

	private final CidadeRepository cidadeRepository;

	@Autowired
	public CidadeEntityComponent(CidadeRepository cidadeRepository) {
		this.cidadeRepository = cidadeRepository;
	}

	public Cidade buscarPorId(String idCidade) {

		final Optional<Cidade> cidadeOpt = this.cidadeRepository.findById(UUID.fromString(idCidade));

		if (!cidadeOpt.isPresent()) {
			return null;
		}

		final Cidade cidade = cidadeOpt.get();

		return cidade;
	}

	public List<Cidade> buscarTodos() {

		final List<Cidade> cidades = this.cidadeRepository.findAll();

		return cidades;
	}
}
