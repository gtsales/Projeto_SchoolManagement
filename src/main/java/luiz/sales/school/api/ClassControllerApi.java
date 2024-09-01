package luiz.sales.school.api;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import luiz.sales.school.model.Classes;
import luiz.sales.school.model.dto.ClassesDto;

public interface ClassControllerApi {

	@PostMapping("/register-class")
	void registerClass(@RequestBody ClassesDto classDto);
	
	@GetMapping("/find-class")
	 Optional<Classes> findClass(@RequestParam String nome);
}
