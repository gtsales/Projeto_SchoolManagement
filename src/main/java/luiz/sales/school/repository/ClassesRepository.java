package luiz.sales.school.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import luiz.sales.school.model.Classes;

public interface ClassesRepository extends MongoRepository<Classes, Long>{

}
