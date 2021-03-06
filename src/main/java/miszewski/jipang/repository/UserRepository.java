package miszewski.jipang.repository;

import miszewski.jipang.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Set<User> findAllBy();
    Set<User> findById(Long id);
}
