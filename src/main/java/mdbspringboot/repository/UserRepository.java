package mdbspringboot.repository;

import mdbspringboot.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

// References: https://www.mongodb.com/compatibility/spring-boot

public interface UserRepository extends MongoRepository<UserModel, String> {

    @Query("{firstName:'?0'}")
    UserModel findUserByFirstName(String firstName);

    @Query("{lastName: '?0'}")
    UserModel findUserByLastName(String lastName);

    public long count();
}
