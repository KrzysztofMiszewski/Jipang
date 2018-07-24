package miszewski.jipang.dto;

import miszewski.jipang.model.Word_Test;

public class Word_TestDto {

    private String polish;
    private String japanese;
    private Long rightAnswers;
    private Long numberOfAnswers;
    private Boolean isCorrect;

    public Word_TestDto(Word_Test word_test) {
        this.polish = word_test.getWord().getPolish();
        this.japanese = word_test.getWord().getJapanese();
        this.rightAnswers = word_test.getWord().getRightAnswers();
        this.numberOfAnswers = word_test.getWord().getNumberOfAnswers();
        this.isCorrect = word_test.getCorrect();
    }

    public String getPolish() {
        return polish;
    }

    public String getJapanese() {
        return japanese;
    }

    public Long getRightAnswers() {
        return rightAnswers;
    }

    public Long getNumberOfAnswers() {
        return numberOfAnswers;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }
}
