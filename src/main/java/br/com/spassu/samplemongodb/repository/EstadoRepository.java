package br.com.spassu.samplemongodb.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.spassu.samplemongodb.model.Estado;

public interface EstadoRepository extends MongoRepository<Estado, UUID> {

	@Query("{uf:'?0'}")
	public Estado findByUf(String uf);

}
