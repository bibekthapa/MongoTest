package hello1;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepo extends MongoRepository<Address, Long>{

}
