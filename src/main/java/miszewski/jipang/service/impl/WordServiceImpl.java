package miszewski.jipang.service.impl;

import miszewski.jipang.model.Word;
import miszewski.jipang.repository.WordRepository;
import miszewski.jipang.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

@Service
public class WordServiceImpl implements WordService {

    private WordRepository wordRepository;

    @Autowired
    public WordServiceImpl(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @Override
    public void create(String polish, String japanese) {
        Word word = new Word();
        word.setPolish(polish);
        word.setJapanese(japanese);
        wordRepository.save(word);
    }

    @Override
    public Set<Word> findAllBy() {
        return wordRepository.findAllBy();
    }

    @Override
    public Set<Word> findById(Long bookId) {
        return wordRepository.findById(bookId);
    }

    @Override
    public Integer countBy() {
        return wordRepository.countBy();
    }
}
