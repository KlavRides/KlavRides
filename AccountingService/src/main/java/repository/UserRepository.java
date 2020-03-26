package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.UserAccount;

public interface UserRepository extends MongoRepository<UserAccount, String> {

}
