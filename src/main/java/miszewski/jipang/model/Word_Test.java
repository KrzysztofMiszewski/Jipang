package miszewski.jipang.model;

import javax.persistence.*;

@Entity
public class Word_Test {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Word word;
    @ManyToOne
    private Test test;
    private Boolean isCorrect;

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Long getId() {
        return id;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }
}
