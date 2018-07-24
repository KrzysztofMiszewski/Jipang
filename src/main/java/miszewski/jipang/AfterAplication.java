package miszewski.jipang;

import miszewski.jipang.model.Word;
import miszewski.jipang.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AfterAplication implements CommandLineRunner {

    private WordRepository wordRepository;

    @Autowired
    public AfterAplication(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @Override
    public void run(String... strings) {
        if (wordRepository.findAllBy().isEmpty()) {
            createWord("jeden","ichi");
            createWord("dwa","ni");
            createWord("trzy","san");
            createWord("cztery","yon");
            createWord("pięć","go");
            createWord("sześć","roku");
            createWord("siedem","nana");
            createWord("osiem","hachi");
            createWord("dziewięć","kyuu");
            createWord("dziesięć","juu");
        }
    }

    private void createWord(String polish, String japanese) {
        Word word = new Word();
        word.setPolish(polish);
        word.setJapanese(japanese);
        wordRepository.save(word);
    }
}
