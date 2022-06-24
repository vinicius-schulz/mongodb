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
@ChangeLog(order = "V202224061657__inclusao_inicial_cidades_rio_de_janeiro")
public class V202224061657__inclusao_inicial_cidades_rio_de_janeiro {

	@ChangeSet(order = "001", id = "V202224061657__inclusao_inicial_cidades_rio_de_janeiro", author = "Vinicius Schulz")
	public void inclusaoInicialEstados(EstadoRepository estadoRepository, CidadeRepository cidadeRepository) {

		List<Cidade> cidades = new ArrayList<>();

		Estado estado = estadoRepository.findByUf("RJ");

		cidades.add(criarCidade(UUID.randomUUID(), "Angra Dos Reis", "330010", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Aperibé", "330015", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Araruama", "330020", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Areal", "330022", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Armação Dos Búzios", "330023", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Arraial do Cabo", "330025", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Barra do Piraí", "330030", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Barra Mansa", "330040", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Belford Roxo", "330045", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Bom Jardim", "330050", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Bom Jesus do Itabapoana", "330060", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Cabo Frio", "330070", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Cachoeiras de Macacu", "330080", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Cambuci", "330090", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Carapebus", "330093", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Comendador Levy Gasparian", "330095", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Campos Dos Goytacazes", "330100", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Cantagalo", "330110", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Cardoso Moreira", "330115", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Carmo", "330120", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Casimiro de Abreu", "330130", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Conceição de Macabu", "330140", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Cordeiro", "330150", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Duas Barras", "330160", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Duque de Caxias", "330170", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Engenheiro Paulo de Frontin", "330180", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Guapimirim", "330185", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Iguaba Grande", "330187", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Itaboraí", "330190", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Itaguaí", "330200", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Italva", "330205", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Itaocara", "330210", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Itaperuna", "330220", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Itatiaia", "330225", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Japeri", "330227", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Laje do Muriaé", "330230", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Macaé", "330240", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Macuco", "330245", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Magé", "330250", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Mangaratiba", "330260", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Maricá", "330270", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Mendes", "330280", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Mesquita", "330285", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Miguel Pereira", "330290", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Miracema", "330300", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Natividade", "330310", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Nilópolis", "330320", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Niterói", "330330", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Nova Friburgo", "330340", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Nova Iguaçu", "330350", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Paracambi", "330360", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Paraíba do Sul", "330370", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Parati", "330380", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Paty do Alferes", "330385", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Petrópolis", "330390", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Pinheiral", "330395", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Piraí", "330400", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Porciúncula", "330410", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Porto Real", "330411", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Quatis", "330412", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Queimados", "330414", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Quissamã", "330415", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Resende", "330420", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Rio Bonito", "330430", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Rio Claro", "330440", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Rio Das Flores", "330450", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Rio Das Ostras", "330452", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Rio de Janeiro", "330455", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Santa Maria Madalena", "330460", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Santo Antônio de Pádua", "330470", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "São Francisco de Itabapoana", "330475", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "São Fidélis", "330480", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "São Gonçalo", "330490", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "São João da Barra", "330500", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "São João de Meriti", "330510", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "São José de Ubá", "330513", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "São José do Vale do Rio Preto", "330515", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "São Pedro da Aldeia", "330520", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "São Sebastião do Alto", "330530", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Sapucaia", "330540", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Saquarema", "330550", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Seropédica", "330555", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Silva Jardim", "330560", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Sumidouro", "330570", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Tanguá", "330575", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Teresópolis", "330580", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Trajano de Morais", "330590", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Três Rios", "330600", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Valença", "330610", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Varre-sai", "330615", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Vassouras", "330620", estado));
		cidades.add(criarCidade(UUID.randomUUID(), "Volta Redonda", "330630", estado));

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
