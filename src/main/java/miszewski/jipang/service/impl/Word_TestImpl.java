package miszewski.jipang.service.impl;

import miszewski.jipang.dto.Word_TestDto;
import miszewski.jipang.model.Test;
import miszewski.jipang.model.Word;
import miszewski.jipang.model.Word_Test;
import miszewski.jipang.repository.TestRepository;
import miszewski.jipang.repository.WordRepository;
import miszewski.jipang.repository.Word_TestRepository;
import miszewski.jipang.service.Word_TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class Word_TestImpl implements Word_TestService {

    private Word_TestRepository word_testRepository;
    private WordRepository wordRepository;
    private TestRepository testRepository;

    @Autowired
    public Word_TestImpl(Word_TestRepository word_testRepository, WordRepository wordRepository, TestRepository testRepository) {
        this.word_testRepository = word_testRepository;
        this.wordRepository = wordRepository;
        this.testRepository = testRepository;
    }

    @Override
    public void create(Word word, Test test) {
        Word_Test word_test = new Word_Test();
        word_test.setWord(word);
        word_test.setTest(test);
        word_testRepository.save(word_test);
    }

    @Override
    public Set<Word_TestDto> findAllBy() {
        return word_testRepository.findAllBy().stream().map(Word_TestDto::new).collect(Collectors.toSet());

    }

    @Override
    public Set<Word_Test> findById(Long id) {
        return word_testRepository.findById(id);
    }
}
