package wcs.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import spring.jpa.Customer;
import wcs.spring.entity.School;

import java.util.List;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
