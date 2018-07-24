package miszewski.jipang.service.impl;

import miszewski.jipang.model.Word;
import miszewski.jipang.model.Word_Test;
import miszewski.jipang.repository.WordRepository;
import miszewski.jipang.repository.Word_TestRepository;
import miszewski.jipang.service.Word_TestService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class Word_TestImpl implements Word_TestService {

    private Word_TestRepository word_testRepository;
    private WordRepository wordRepository;

    @Override
    public void create(Word word) {
        Word_Test word_test = new Word_Test();
        word_test.setWord(word);
        word_testRepository.save(word_test);
    }

    @Override
    public Set<Word_Test> findAllBy() {
        return word_testRepository.findAllBy();
    }

    @Override
    public Set<Word_Test> findById(Long id) {
        return word_testRepository.findById(id);
    }
}
