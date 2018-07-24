package miszewski.jipang.service.impl;

import miszewski.jipang.model.Test;
import miszewski.jipang.model.Word_Test;
import miszewski.jipang.repository.TestRepository;
import miszewski.jipang.service.TestService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TestServiceImpl implements TestService {

    private TestRepository testRepository;

    @Override
    public void create(Set<Word_Test> word_tests) {
        Test test = new Test();
        test.setWord_tests(word_tests);
        testRepository.save(test);
    }

    @Override
    public Set<Test> findAllBy() {
        return testRepository.findAllBy();
    }

    @Override
    public Set<Test> findById(Long id) {
        return testRepository.findById(id);
    }
}
