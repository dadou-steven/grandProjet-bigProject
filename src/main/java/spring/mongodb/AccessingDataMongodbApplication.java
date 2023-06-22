package spring.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.jpa.AccessingDataJpaApplication;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

    @Autowired
    private spring.mongodb.CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save couple of customers
        repository.save(new spring.mongodb.Customer("Alice", "Smith"));
        repository.save(new spring.mongodb.Customer("Bob", "Smith"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (spring.mongodb.Customer customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customers found with findAll('Alice'):");
        System.out.println("---------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        // fetch customers by last name
        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------------");
        for (Customer customer : repository.findByLastName("Smith")) {
            System.out.println(customer);
        }
    }
}
