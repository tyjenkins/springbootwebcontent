package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Jenkins on 26/02/2016.
 */
public interface UsersRepository extends CrudRepository<Users, Long> {
    List<Users> findByUsername(String username);
    List<Users> findByPassword(String password);
    List<Users> findByEnabled(Boolean enabled);
    List<Users> findByUsernameAndPassword(String username, String password);

    @Query("select u from Users u where u.username = :user1 or u.username = :user2")
    List<Users> findByUser1OrUser2(@Param("user1") String user1, @Param("user2") String user2);

    // List example @Query("FROM item i WHERE i.type = ?1 AND i.state IN (?2)")
}
