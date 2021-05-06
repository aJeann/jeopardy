package com.example.jeopardy.tables;

import javax.persistence.*;


@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String question1;
    private String answer1;
    private String question2;
    private String answer2;
    private String question3;
    private String answer3;
    private String question4;
    private String answer4;
    private String question5;
    private String answer5;
    private String finalQ;
    private String finalA;
    @ManyToOne(targetEntity = Game.class)
    private Game game;


    public Category() {
    }

    public Category(String name, String question1, String answer1, String question2, String answer2, String question3, String answer3, String question4, String answer4, String question5, String answer5, String finalQ, String finalA, Game game) {
        this.name = name;
        this.question1 = question1;
        this.answer1 = answer1;
        this.question2 = question2;
        this.answer2 = answer2;
        this.question3 = question3;
        this.answer3 = answer3;
        this.question4 = question4;
        this.answer4 = answer4;
        this.question5 = question5;
        this.answer5 = answer5;
        this.finalQ = finalQ;
        this.finalA = finalA;
        this.game = game;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getQuestion4() {
        return question4;
    }

    public void setQuestion4(String question4) {
        this.question4 = question4;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getQuestion5() {
        return question5;
    }

    public void setQuestion5(String question5) {
        this.question5 = question5;
    }

    public String getAnswer5() {
        return answer5;
    }

    public void setAnswer5(String answer5) {
        this.answer5 = answer5;
    }

    public String getFinalQ() {
        return finalQ;
    }

    public void setFinalQ(String finalQ) {
        this.finalQ = finalQ;
    }

    public String getFinalA() {
        return finalA;
    }

    public void setFinalA(String finalA) {
        this.finalA = finalA;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
