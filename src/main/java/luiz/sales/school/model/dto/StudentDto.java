package luiz.sales.school.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String dtNascimento;
	private String sexo;
	private String telefone;
	private AddressDto address;
	private String nomePai;
	private String nomeMae;
	private String cpf;
}
