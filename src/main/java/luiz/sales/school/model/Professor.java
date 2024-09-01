package luiz.sales.school.model;

import java.io.Serializable;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professor implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	private String nome;
	private String cpf;
	private String materia;
}
