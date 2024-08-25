package luiz.sales.school.model.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import luiz.sales.school.model.Classes;
import luiz.sales.school.model.Professor;
import luiz.sales.school.model.Student;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassesDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String nome;
	private Professor professor;
	private List<Student> student;
	private Date dtInicio;
	private Date dtFim;
	
	public Classes convertToClasses(ClassesDto classesDto) {
		
		Classes classes = new Classes();
		
		List<Student> studentConvert =  classesDto.getStudent();
		
		classes.setNome(classesDto.getNome());
		classes.setProfessor(classesDto.getProfessor());
		
		if (studentConvert != null && !studentConvert.isEmpty()) {
			
			for (Student student : studentConvert) {
				
				classes.getStudent().add(student);
			}
		}
		
		classes.setDtInicio(classesDto.getDtInicio());
		classes.setDtFim(classesDto.getDtFim());
		
		return classes;
	}
}
