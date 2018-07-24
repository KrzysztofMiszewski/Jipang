package miszewski.jipang.service;

import miszewski.jipang.dto.TestDto;
import miszewski.jipang.model.Test;
import miszewski.jipang.model.Word_Test;

import java.util.Set;

public interface TestService {

    Test create();
    Set<TestDto> findAllBy();
    Set<Test> findById(Long id);
}
