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

		Estado estado = estadoRepository.findByUf("ES");

		cidades.add(criarCidade(UUID.randomUUID(), "Afonso Cláudio", "320010", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Águia Branca", "320013", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Água Doce do Norte", "320016", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Alegre", "320020", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Alfredo Chaves", "320030", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Alto Rio Novo", "320035", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Anchieta", "320040", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Apiacá", "320050", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Aracruz", "320060", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Atilio Vivacqua", "320070", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Baixo Guandu", "320080", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Barra de São Francisco", "320090", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Boa Esperança", "320100", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Bom Jesus do Norte", "320110", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Brejetuba", "320115", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Cachoeiro de Itapemirim", "320120", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Cariacica", "320130", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Castelo", "320140", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Colatina", "320150", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Conceição da Barra", "320160", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Conceição do Castelo", "320170", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Divino de São Lourenço", "320180", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Domingos Martins", "320190", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Dores do Rio Preto", "320200", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Ecoporanga", "320210", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Fundão", "320220", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Governador Lindenberg", "320225", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Guaçuí", "320230", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Guarapari", "320240", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Ibatiba", "320245", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Ibiraçu", "320250", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Ibitirama", "320255", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Iconha", "320260", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Irupi", "320265", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Itaguaçu", "320270", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Itapemirim", "320280", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Itarana", "320290", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Iúna", "320300", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Jaguaré", "320305", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Jerônimo Monteiro", "320310", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "João Neiva", "320313", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Laranja da Terra", "320316", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Linhares", "320320", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Mantenópolis", "320330", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Marataízes", "320332", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Marechal Floriano", "320334", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Marilândia", "320335", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Mimoso do Sul", "320340", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Montanha", "320350", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Mucurici", "320360", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Muniz Freire", "320370", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Muqui", "320380", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Nova Venécia", "320390", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Pancas", "320400", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Pedro Canário", "320405", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Pinheiros", "320410", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Piúma", "320420", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Ponto Belo", "320425", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Presidente Kennedy", "320430", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Rio Bananal", "320435", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Rio Novo do Sul", "320440", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Santa Leopoldina", "320450", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Santa Maria de Jetibá", "320455", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Santa Teresa", "320460", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "São Domingos do Norte", "320465", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "São Gabriel da Palha", "320470", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "São José do Calçado", "320480", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "São Mateus", "320490", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "São Roque do Canaã", "320495", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Serra", "320500", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Sooretama", "320501", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Vargem Alta", "320503", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Venda Nova do Imigrante", "320506", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Viana", "320510", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Vila Pavão", "320515", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Vila Valério", "320517", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Vila Velha", "320520", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Vitória", "320530", estado));

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
