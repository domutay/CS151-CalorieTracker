package mdbspringboot;
import mdbspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public abstract class MdbSpringBootApplication implements CommandLineRunner {

    @Autowired
    UserRepository userItemRepo;

    public static void main(String[] args) {

        SpringApplication.run(MdbSpringBootApplication.class, args);
    }
}
