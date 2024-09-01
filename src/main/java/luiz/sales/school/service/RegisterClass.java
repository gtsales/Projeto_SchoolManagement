package luiz.sales.school.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import luiz.sales.school.model.Classes;
import luiz.sales.school.model.dto.ClassesDto;
import luiz.sales.school.repository.ClassesRepository;

@Service
@Slf4j
public class RegisterClass {

	@Autowired
	private ClassesRepository classesRepository;
	
	public void registerClasses(ClassesDto classesDto) {
		
		Classes classes = new Classes();
		
		BeanUtils.copyProperties(classesDto, classes);
		
		try {
			
			classesRepository.insert(classes);
		} catch (DuplicateKeyException e) {
			
			log.error("Error trying to insert new class in base, duplicate key!");
		}
	}
}
