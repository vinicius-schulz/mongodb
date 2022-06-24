package br.com.spassu.samplemongodb.config.dbmigrations;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

import br.com.spassu.samplemongodb.model.Cidade;
import br.com.spassu.samplemongodb.model.Estado;
import br.com.spassu.samplemongodb.repository.CidadeRepository;
import br.com.spassu.samplemongodb.repository.EstadoRepository;

/**
 * Update collection.
 */
@ChangeLog(order = "V202224061556__inclusao_inicial_cidades")
public class V202224061556__inclusao_inicial_cidades {

	@ChangeSet(order = "001", id = "V202224061556__inclusao_inicial_cidades", author = "Vinicius Schulz")
	public void inclusaoInicialEstados(EstadoRepository estadoRepository, CidadeRepository cidadeRepository) {

		List<Cidade> cidades = new ArrayList<>();

		cidades.add(criarCidade(UUID.randomUUID(), "Vitória", "320530", estadoRepository.findByUf("ES")));

		cidadeRepository.saveAll(cidades);
	}

	private Cidade criarCidade(UUID uuid, String nome, String codigoIbge, Estado estado) {
		Cidade cidade = new Cidade();

		cidade.setId(uuid);
		cidade.setCodigoIbge(codigoIbge);
		cidade.setEstado(estado);
		cidade.setNome(nome);

		return cidade;
	}
}
