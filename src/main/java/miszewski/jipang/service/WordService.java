package miszewski.jipang.service;

import miszewski.jipang.model.Word;

import java.util.Set;

public interface WordService {

    void create(String polish, String japanese);
    Set<Word> findAllBy();
    Set<Word> findById(Long bookId);
    Integer countBy();
}
