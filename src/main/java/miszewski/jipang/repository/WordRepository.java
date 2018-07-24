package miszewski.jipang.repository;

import miszewski.jipang.model.Word;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface WordRepository extends CrudRepository<Word, Long> {

    Set<Word> findAllBy();
    Set<Word> findById(Long bookId);
    Integer countBy();
}
