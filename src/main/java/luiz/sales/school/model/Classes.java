package luiz.sales.school.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import luiz.sales.school.model.dto.ProfessorDto;
import luiz.sales.school.model.dto.StudentClass;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "class")
public class Classes implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Indexed(unique = true)
	private String nome;
	
	private ProfessorDto professor;
	private List<StudentClass> student;
	private Date dtInicio;
	private Date dtFim;
}
