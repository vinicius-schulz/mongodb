
package br.com.spassu.samplemongodb.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Estado {

	@Id
	private UUID id;

	private String codigoIbge;

	private String nome;

	private String uf;
}
