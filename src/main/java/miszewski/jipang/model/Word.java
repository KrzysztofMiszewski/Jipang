package miszewski.jipang.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Word {

    @Id
    @GeneratedValue
    private Long id;
    private String polish;
    private String japanese;
    private Long rightAnswers;
    private Long numberOfAnswers;

    public Long getId() {
        return id;
    }

    public String getPolish() {
        return polish;
    }

    public void setPolish(String polish) {
        this.polish = polish;
    }

    public String getJapanese() {
        return japanese;
    }

    public void setJapanese(String japanese) {
        this.japanese = japanese;
    }

    public Long getRightAnswers() {
        return rightAnswers;
    }

    public void setRightAnswers(Long rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Long getNumberOfAnswers() {
        return numberOfAnswers;
    }

    public void setNumberOfAnswers(Long numberOfAnswers) {
        this.numberOfAnswers = numberOfAnswers;
    }
}
