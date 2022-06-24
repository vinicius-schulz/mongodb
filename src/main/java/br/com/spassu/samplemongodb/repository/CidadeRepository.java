package br.com.spassu.samplemongodb.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.spassu.samplemongodb.model.Cidade;

public interface CidadeRepository extends MongoRepository<Cidade, UUID> {

}
