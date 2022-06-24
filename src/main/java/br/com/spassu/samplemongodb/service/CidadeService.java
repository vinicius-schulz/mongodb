
package br.com.spassu.samplemongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spassu.samplemongodb.entitycomponent.CidadeEntityComponent;
import br.com.spassu.samplemongodb.model.Cidade;

@Service
public class CidadeService {

	private final CidadeEntityComponent cidadeEntityComponent;

	@Autowired
	public CidadeService(CidadeEntityComponent cidadeComponent) {
		this.cidadeEntityComponent = cidadeComponent;
	}

	public Cidade obterCidade(String idCidade) {

		final Cidade cidade = this.cidadeEntityComponent.buscarPorId(idCidade);

		return cidade;
	}

	public List<Cidade> listarCidades() {

		final List<Cidade> cidades = this.cidadeEntityComponent.buscarTodos();

		return cidades;
	}
}
