package com.techreturners;

public class JavaBowlingGame {
    private int score=0;
    public void roll(int pins) {
        score +=pins;
    }

    public int score() {
        return score;
    }
}
