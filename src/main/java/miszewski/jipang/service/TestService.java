package miszewski.jipang.service;

import miszewski.jipang.model.Test;
import miszewski.jipang.model.Word_Test;

import java.util.Set;

public interface TestService {

    void create(Set<Word_Test> word_tests);
    Set<Test> findAllBy();
    Set<Test> findById(Long id);
}
