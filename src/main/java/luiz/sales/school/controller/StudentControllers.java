package luiz.sales.school.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import luiz.sales.school.api.StudentControllerApi;
import luiz.sales.school.model.Student;
import luiz.sales.school.model.dto.DeleteResponseDto;
import luiz.sales.school.model.dto.StudentDto;
import luiz.sales.school.repository.StudentRepository;
import luiz.sales.school.service.RegisterStudents;
import luiz.sales.school.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentControllers implements StudentControllerApi{

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	RegisterStudents registerStudents;
	
	@Autowired
	StudentService studentService;
	
	public void registerStudent(@RequestBody StudentDto studentDto) {
		
		registerStudents.register(studentDto);
	}
	
	public Optional<Student> getStudentByCpf(@PathVariable String cpf) {
		
		return studentRepository.findById(cpf);
	}
	
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	public DeleteResponseDto deleteStudent(@RequestParam String cpf) {
		
		studentRepository.deleteById(cpf);
		
		return studentService.deleteStudentService(cpf);
	}
}
