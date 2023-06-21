package wcs.spring.repository;

import org.springframework.data.repository.CrudRepository;
import spring.jpa.Customer;

import java.util.List;

public interface SchoolRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
