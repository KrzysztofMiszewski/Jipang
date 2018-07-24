package miszewski.jipang.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Test {

    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(mappedBy = "test")
    private Set<Word_Test> word_tests;

    public Long getId() {
        return id;
    }

    public Set<Word_Test> getWord_tests() {
        return word_tests;
    }

    public void setWord_tests(Set<Word_Test> word_tests) {
        this.word_tests = word_tests;
    }
}
