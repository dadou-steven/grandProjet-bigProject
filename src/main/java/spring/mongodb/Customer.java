package spring.mongodb;

import org.springframework.data.annotation.Id;

public class Customer {

    // déclaration de variables d'instance

    @Id
    public String id;
    public String firstName;
    public String lastName;

    // constructor

    public Customer(String alice, String smith) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
    }
}
