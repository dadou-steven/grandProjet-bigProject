package wcs.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spring.jpa.AccessingDataJpaApplication;
import spring.jpa.Customer;
import spring.jpa.CustomerRepository;

@SpringBootApplication
public class DoctorApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DoctorApplication.class);
    }

    // méthodes

    /**
     * Spécification de la méthode demo
     * @param repository référentiel
     */
    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O' Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customers by ID
            Customer customer = repository.findById(1L);
            log.info("Customers found with findAll(1L):");
            log.info("---------------------------------");
            log.info(customer.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customers found with findAll('Bauer'):");
            log.info("--------------------------------------");
            repository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            log.info("");
        };
    }
}
