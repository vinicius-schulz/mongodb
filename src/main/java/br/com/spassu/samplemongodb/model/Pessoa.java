
package br.com.spassu.samplemongodb.model;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "pessoas")
public class Pessoa {

	@Id
	private UUID id;

	private String cpf;

	private LocalDate dataNascimento;

	private Boolean ativo;

	private String nome;

	private Pessoa mae;

	private Pessoa pai;

	private Hospital hospital;

}
