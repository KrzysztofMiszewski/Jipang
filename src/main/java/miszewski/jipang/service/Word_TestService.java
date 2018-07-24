package miszewski.jipang.service;

import miszewski.jipang.dto.Word_TestDto;
import miszewski.jipang.model.Test;
import miszewski.jipang.model.Word;
import miszewski.jipang.model.Word_Test;

import java.util.Set;

public interface Word_TestService {

    void create(Word word, Test test);
    Set<Word_TestDto> findAllBy();
    Set<Word_Test> findById(Long id);
}
