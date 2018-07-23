package miszewski.jipang.repository;

import miszewski.jipang.model.Word_Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface Word_TestRepository extends CrudRepository<Word_Test, Long> {

    Set<Word_Test> findAllBy();
    Set<Word_Test> findById(Long id);
}
