package wcs.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.jpa.Customer;
import wcs.spring.entity.Wizard;

import java.util.List;
@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long> {
}

