package luiz.sales.school.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import luiz.sales.school.api.ClassControllerApi;
import luiz.sales.school.model.Classes;
import luiz.sales.school.model.dto.ClassesDto;
import luiz.sales.school.repository.ClassesRepository;

@RestController
@RequestMapping("/class")
public class ClassController implements ClassControllerApi{

	@Autowired
	private ClassesRepository classesRepository;
	
	public void registerClass(@RequestBody ClassesDto classDto) {
		
		Classes classes = classDto.convertToClasses(classDto);
		classesRepository.save(classes);
	}
	
	public Optional<Classes> findClass(@RequestParam Long id) {
		
		return classesRepository.findById(id);
	}
}
