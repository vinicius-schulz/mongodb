
package br.com.spassu.samplemongodb.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cidade {

	@Id
	private UUID id;

	private String codigoIbge;

	private String nome;

	private Estado estado;
}
