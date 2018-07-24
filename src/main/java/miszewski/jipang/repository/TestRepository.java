package miszewski.jipang.repository;

import miszewski.jipang.model.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TestRepository extends CrudRepository<Test, Long> {

    Set<Test> findAllBy();
    Set<Test> findById(Long id);
}
