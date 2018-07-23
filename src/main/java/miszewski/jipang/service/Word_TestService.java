package miszewski.jipang.service;

import miszewski.jipang.model.Word;
import miszewski.jipang.model.Word_Test;

import java.util.Set;

public interface Word_TestService {

    void create(Word word);
    Set<Word_Test> findAllBy();
    Set<Word_Test> findById(Long id);
}
