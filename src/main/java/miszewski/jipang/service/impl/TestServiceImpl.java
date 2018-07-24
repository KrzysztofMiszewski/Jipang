package miszewski.jipang.service.impl;

import miszewski.jipang.dto.TestDto;
import miszewski.jipang.dto.Word_TestDto;
import miszewski.jipang.model.Test;
import miszewski.jipang.model.Word_Test;
import miszewski.jipang.repository.TestRepository;
import miszewski.jipang.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TestServiceImpl implements TestService {

    private TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public Test create() {
        Test test = new Test();
        return testRepository.save(test);
    }

    @Override
    public Set<TestDto> findAllBy() {
        return testRepository.findAllBy().stream().map(TestDto::new).collect(Collectors.toSet());
    }

    @Override
    public Set<Test> findById(Long id) {
        return testRepository.findById(id);
    }
}
