package luiz.sales.school.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String cep;
	private String uf;
	private String municipio;
	private String bairro;
	private String rua;
	private String numero;
}
