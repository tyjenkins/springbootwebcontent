package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Jenkins on 26/02/2016.
 */
public interface UsersRepository extends CrudRepository<Users, Long> {
    List<Users> findByUsername(String username);
    List<Users> findByPassword(String password);
    List<Users> findByEnabled(Boolean enabled);
    List<Users> findByUsernameAndPassword(String username, String password);
}
