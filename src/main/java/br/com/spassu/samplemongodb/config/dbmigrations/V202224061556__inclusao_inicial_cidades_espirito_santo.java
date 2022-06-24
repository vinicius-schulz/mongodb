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
public class V202224061556__inclusao_inicial_cidades_espirito_santo {

	@ChangeSet(order = "001", id = "V202224061556__inclusao_inicial_cidades", author = "Vinicius Schulz")
	public void inclusaoInicialEstados(EstadoRepository estadoRepository, CidadeRepository cidadeRepository) {

		List<Cidade> cidades = new ArrayList<>();

		cidades.add(criarCidade(UUID.randomUUID(), "Afonso Cláudio", "320010", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Águia Branca", "320013", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Água Doce do Norte", "320016", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Alegre", "320020", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Alfredo Chaves", "320030", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Alto Rio Novo", "320035", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Anchieta", "320040", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Apiacá", "320050", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Aracruz", "320060", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Atilio Vivacqua", "320070", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Baixo Guandu", "320080", estadoRepository.findByUf("ES")));
		cidades.add(
				criarCidade(UUID.randomUUID(), "Barra de São Francisco", "320090", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Boa Esperança", "320100", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Bom Jesus do Norte", "320110", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Brejetuba", "320115", estadoRepository.findByUf("ES")));
		cidades.add(
				criarCidade(UUID.randomUUID(), "Cachoeiro de Itapemirim", "320120", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Cariacica", "320130", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Castelo", "320140", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Colatina", "320150", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Conceição da Barra", "320160", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Conceição do Castelo", "320170", estadoRepository.findByUf("ES")));
		cidades.add(
				criarCidade(UUID.randomUUID(), "Divino de São Lourenço", "320180", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Domingos Martins", "320190", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Dores do Rio Preto", "320200", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Ecoporanga", "320210", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Fundão", "320220", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Governador Lindenberg", "320225", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Guaçuí", "320230", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Guarapari", "320240", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Ibatiba", "320245", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Ibiraçu", "320250", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Ibitirama", "320255", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Iconha", "320260", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Irupi", "320265", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Itaguaçu", "320270", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Itapemirim", "320280", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Itarana", "320290", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Iúna", "320300", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Jaguaré", "320305", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Jerônimo Monteiro", "320310", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "João Neiva", "320313", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Laranja da Terra", "320316", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Linhares", "320320", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Mantenópolis", "320330", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Marataízes", "320332", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Marechal Floriano", "320334", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Marilândia", "320335", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Mimoso do Sul", "320340", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Montanha", "320350", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Mucurici", "320360", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Muniz Freire", "320370", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Muqui", "320380", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Nova Venécia", "320390", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Pancas", "320400", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Pedro Canário", "320405", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Pinheiros", "320410", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Piúma", "320420", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Ponto Belo", "320425", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Presidente Kennedy", "320430", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Rio Bananal", "320435", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Rio Novo do Sul", "320440", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Santa Leopoldina", "320450", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Santa Maria de Jetibá", "320455", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Santa Teresa", "320460", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "São Domingos do Norte", "320465", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "São Gabriel da Palha", "320470", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "São José do Calçado", "320480", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "São Mateus", "320490", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "São Roque do Canaã", "320495", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Serra", "320500", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Sooretama", "320501", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Vargem Alta", "320503", estadoRepository.findByUf("ES")));
		cidades.add(
				criarCidade(UUID.randomUUID(), "Venda Nova do Imigrante", "320506", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Viana", "320510", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Vila Pavão", "320515", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Vila Valério", "320517", estadoRepository.findByUf("ES")));
		cidades.add(criarCidade(UUID.randomUUID(), "Vila Velha", "320520", estadoRepository.findByUf("ES")));
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
