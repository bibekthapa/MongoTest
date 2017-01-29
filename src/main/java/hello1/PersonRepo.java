package hello1;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepo extends MongoRepository<Person, Long> {

}
