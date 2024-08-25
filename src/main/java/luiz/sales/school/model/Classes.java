package luiz.sales.school.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "class")
public class Classes implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	private String nome;
	private Professor professor;
	private List<Student> Student;
	private Date dtInicio;
	private Date dtFim;
}
