package miszewski.jipang.controllers;

import miszewski.jipang.dto.TestDto;
import miszewski.jipang.model.Test;
import miszewski.jipang.model.Word;
import miszewski.jipang.model.Word_Test;
import miszewski.jipang.service.TestService;
import miszewski.jipang.service.WordService;
import miszewski.jipang.service.Word_TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/tests")
public class TestController {

    private TestService testService;
    private WordService wordService;
    private Word_TestService word_testService;

    @Autowired
    public TestController(TestService testService, WordService wordService, Word_TestService word_testService) {
        this.testService = testService;
        this.wordService = wordService;
        this.word_testService = word_testService;
    }

    @GetMapping
    public Set<TestDto> findAll() {
        return testService.findAllBy();
    }

    @GetMapping("/new")
    public void generateNewTest() {
        int size = wordService.countBy();
        Test test = testService.create();
        ArrayList<Word> list = new ArrayList<>(wordService.findAllBy());
        for (int i = 0; i < 10; i++) {
            Word word = list.get((int) (Math.random() * size));
            word_testService.create(word, test);
        }
    }

    @PostMapping("/new{n}")
    public void generateNewTest(@RequestParam int n) {
        int size = wordService.countBy();
        Test test = testService.create();
        ArrayList<Word> list = new ArrayList<>(wordService.findAllBy());
        for (int i = 0; i < n; i++) {
            Word word = list.get((int) (Math.random() * size));
            word_testService.create(word, test);
        }
    }
}
