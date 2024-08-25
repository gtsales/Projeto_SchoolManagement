package luiz.sales.school.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import luiz.sales.school.model.Student;


@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
