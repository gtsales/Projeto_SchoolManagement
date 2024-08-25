package luiz.sales.school.api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import luiz.sales.school.model.Student;
import luiz.sales.school.model.dto.DeleteResponseDto;
import luiz.sales.school.model.dto.StudentDto;

public interface StudentControllerApi {

	@PostMapping("/register-student")
	void registerStudent(@RequestBody StudentDto studentDto);
	
	@GetMapping("/find-student/{cpf}")
	Optional<Student> getStudentByCpf(String cpf);
	
	@GetMapping("/find-student/all")
	List<Student> getAllStudents();
	
	@DeleteMapping("/delete-student")
	DeleteResponseDto deleteStudent(@RequestParam String Cpf);
}
