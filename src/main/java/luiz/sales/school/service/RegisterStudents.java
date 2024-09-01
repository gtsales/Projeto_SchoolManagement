package luiz.sales.school.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.mongodb.MongoWriteException;

import lombok.extern.slf4j.Slf4j;
import luiz.sales.school.model.Address;
import luiz.sales.school.model.Student;
import luiz.sales.school.model.dto.StudentDto;
import luiz.sales.school.repository.StudentRepository;

@Service
@Slf4j
public class RegisterStudents {

	@Autowired
	private StudentRepository studentRepository;
	
	public void register(StudentDto studentDto) {
		
		Student student = new Student();
		Address address = new Address();
		
		BeanUtils.copyProperties(studentDto, student);
		
		student.setAddress(address.toAddress(studentDto.getAddress()));
		
		try {
			
			studentRepository.insert(student);
		} catch (DuplicateKeyException e) {
			
			log.error("Error trying to insert student in base, duplicate key!");
		} catch (MongoWriteException e) {
			
			log.error("Error trying to insert student in base, duplicate key!");
		}
	}
}
