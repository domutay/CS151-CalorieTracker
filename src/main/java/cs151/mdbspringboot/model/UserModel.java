package cs151.mdbspringboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Reference:  https://www.mongodb.com/compatibility/spring-boot
// Specify the MongoDB document’s primary key _id using the @Id annotation. If we don’t specify anything, MongoDB will generate an _id field while creating the document.

@Document("users")
public class UserModel {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public UserModel(String id, String firstName, String lastName, String email, String password) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}
