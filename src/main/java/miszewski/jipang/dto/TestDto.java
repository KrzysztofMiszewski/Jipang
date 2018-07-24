package miszewski.jipang.dto;

import miszewski.jipang.model.Test;

import java.util.Set;
import java.util.stream.Collectors;

public class TestDto {

    private Set<Word_TestDto> word_testDtos;

    public Set<Word_TestDto> getWord_testDtos() {
        return word_testDtos;
    }

    public TestDto(Test test) {
        word_testDtos = test.getWord_tests().stream().map(Word_TestDto::new).collect(Collectors.toSet());
    }

}
