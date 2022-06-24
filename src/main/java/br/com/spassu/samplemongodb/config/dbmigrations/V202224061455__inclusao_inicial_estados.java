package br.com.spassu.samplemongodb.config.dbmigrations;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

import br.com.spassu.samplemongodb.model.Estado;
import br.com.spassu.samplemongodb.repository.EstadoRepository;

/**
 * Update collection.
 */
@ChangeLog(order = "V202224061455__inclusao_inicial_registros")
public class V202224061455__inclusao_inicial_estados {

	@ChangeSet(order = "001", id = "V202224061455__inclusao_inicial_registros", author = "Vinicius Schulz")
	public void inclusaoInicialEstados(EstadoRepository estadoRepository) {

		List<Estado> estados = new ArrayList<>();

		estados.add(criarEstado(UUID.randomUUID(), "Rondônia", "RO", "11"));
		estados.add(criarEstado(UUID.randomUUID(), "Acre", "AC", "12"));
		estados.add(criarEstado(UUID.randomUUID(), "Amazonas", "AM", "13"));
		estados.add(criarEstado(UUID.randomUUID(), "Roraima", "RR", "14"));
		estados.add(criarEstado(UUID.randomUUID(), "Pará", "PA", "15"));
		estados.add(criarEstado(UUID.randomUUID(), "Amapá", "AP", "16"));
		estados.add(criarEstado(UUID.randomUUID(), "Tocantins", "TO", "17"));
		estados.add(criarEstado(UUID.randomUUID(), "Maranhão", "MA", "21"));
		estados.add(criarEstado(UUID.randomUUID(), "Piauí", "PI", "22"));
		estados.add(criarEstado(UUID.randomUUID(), "Ceará", "CE", "23"));
		estados.add(criarEstado(UUID.randomUUID(), "Rio Grande do Norte", "RN", "24"));
		estados.add(criarEstado(UUID.randomUUID(), "Paraíba", "PB", "25"));
		estados.add(criarEstado(UUID.randomUUID(), "Pernambuco", "PE", "26"));
		estados.add(criarEstado(UUID.randomUUID(), "Alagoas", "AL", "27"));
		estados.add(criarEstado(UUID.randomUUID(), "Sergipe", "SE", "28"));
		estados.add(criarEstado(UUID.randomUUID(), "Bahia", "BA", "29"));
		estados.add(criarEstado(UUID.randomUUID(), "Minas Gerais", "MG", "31"));
		estados.add(criarEstado(UUID.randomUUID(), "Espírito Santo", "ES", "32"));
		estados.add(criarEstado(UUID.randomUUID(), "Rio de Janeiro", "RJ", "33"));
		estados.add(criarEstado(UUID.randomUUID(), "São Paulo", "SP", "35"));
		estados.add(criarEstado(UUID.randomUUID(), "Paraná", "PR", "41"));
		estados.add(criarEstado(UUID.randomUUID(), "Santa Catarina", "SC", "42"));
		estados.add(criarEstado(UUID.randomUUID(), "Rio Grande do Sul", "RS", "43"));
		estados.add(criarEstado(UUID.randomUUID(), "Mato Grosso do Sul", "MS", "50"));
		estados.add(criarEstado(UUID.randomUUID(), "Mato Grosso", "MT", "51"));
		estados.add(criarEstado(UUID.randomUUID(), "Goiás", "GO", "52"));
		estados.add(criarEstado(UUID.randomUUID(), "Distrito Federal", "DF", "53"));

		estadoRepository.saveAll(estados);
	}

	private Estado criarEstado(UUID uuid, String nome, String uf, String codigoIbge) {
		Estado estado = new Estado();
		estado.setCodigoIbge(codigoIbge);
		estado.setId(uuid);
		estado.setNome(nome);
		estado.setUf(uf);
		return estado;
	}
}
