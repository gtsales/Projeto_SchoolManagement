package luiz.sales.school.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "students")
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String nome;
	private String dtNascimento;
	private String sexo;
	private String telefone;
	
	@Id
	@Indexed(unique = true)
	private String cpf;
	private String nomePai;
	private String nomeMae;
	private Address address;
}
