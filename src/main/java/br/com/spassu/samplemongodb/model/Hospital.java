
package br.com.spassu.samplemongodb.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hospital {

	@Id
	private UUID id;

	private String cnpj;

	private String nome;

	private Cidade cidade;
}
