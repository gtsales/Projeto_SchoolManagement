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
import luiz.sales.school.service.RegisterClass;

@RestController
@RequestMapping("/class")
public class ClassController implements ClassControllerApi{

	@Autowired
	private ClassesRepository classesRepository;
	
	@Autowired
	private RegisterClass registerClass;
	
	public void registerClass(@RequestBody ClassesDto classesDto) {
		
		registerClass.registerClasses(classesDto);
	}
	
	public Optional<Classes> findClass(@RequestParam String nome) {
		
		return classesRepository.findById(nome);
	}
}
