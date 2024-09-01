package luiz.sales.school.model.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassesDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String nome;
	private ProfessorDto professor;
	private List<StudentClass> student;
	private Date dtInicio;
	private Date dtFim;
	
}
