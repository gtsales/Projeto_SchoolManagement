package luiz.sales.school.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import luiz.sales.school.model.Student;
import luiz.sales.school.model.dto.DeleteResponseDto;
import luiz.sales.school.repository.StudentRepository;

@Service
@Slf4j
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public DeleteResponseDto deleteStudentService(String cpf) {
		
		DeleteResponseDto deleteResponseDto = new DeleteResponseDto();
		Optional<Student> studentOptional = studentRepository.findById(cpf);
		
		studentRepository.deleteById(cpf);

		String nome = null;
		
		try {
			
			nome = studentOptional.get().getNome();
		} catch (NoSuchElementException e) {

			log.error(String.format("No value found for name. [%s]", nome));
		}
		
		String cpfId = null;
		
		try {
			
			cpfId = studentOptional.get().getCpf();
		} catch (NoSuchElementException e) {

			log.error(String.format("No value found for cpf. [%s]", cpfId));
		}
		
		return deleteResponseDto.responseDelete(nome, cpfId);
	}
}
