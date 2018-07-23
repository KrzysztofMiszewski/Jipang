package miszewski.jipang.controllers;

import miszewski.jipang.service.Word_TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Word_TestController {

    private Word_TestService word_testService;

    @Autowired
    public Word_TestController(Word_TestService word_testService) {
        this.word_testService = word_testService;
    }
}
