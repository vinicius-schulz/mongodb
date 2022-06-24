
package br.com.spassu.samplemongodb.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class EstadoDto {

	private String codigoIbge;

	private String nome;

	private String uf;

}
