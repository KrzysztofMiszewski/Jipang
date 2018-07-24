package miszewski.jipang.controllers;

import miszewski.jipang.model.Word;
import miszewski.jipang.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/words")
public class WordController {

    private WordService wordService;

    @Autowired
    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @PostMapping
    public void create(@RequestParam String polish,
                       @RequestParam String japanese) {
        Word word = new Word();
        word.setJapanese(japanese);
        word.setPolish(polish);

        wordService.create(polish, japanese);

    }

    @GetMapping
    public Set<Word> findAll() {
        return  wordService.findAllBy();
    }
}
