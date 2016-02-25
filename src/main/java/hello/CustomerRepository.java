package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Jenkins on 25/02/2016.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByFirstName(String firstName);
}
