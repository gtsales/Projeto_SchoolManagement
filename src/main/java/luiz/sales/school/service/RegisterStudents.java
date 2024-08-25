package luiz.sales.school.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import luiz.sales.school.model.Address;
import luiz.sales.school.model.Student;
import luiz.sales.school.model.dto.StudentDto;
import luiz.sales.school.repository.StudentRepository;

@Service
public class RegisterStudents {

	@Autowired
	private StudentRepository studentRepository;
	
	public void register(StudentDto studentDto) {
		
		Student student = new Student();
		Address address = new Address();
		
		BeanUtils.copyProperties(studentDto, student);
		
		student.setAddress(address.toAddress(studentDto.getAddress()));
		
		studentRepository.save(student);
	}
}
