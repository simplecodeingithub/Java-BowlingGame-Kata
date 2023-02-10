package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaBowlingGameTest {
    @Test
    public void testGutterGame(){
        JavaBowlingGame javaBowlingGame=new JavaBowlingGame();
        for(int i=0;i<20;i++) {
            javaBowlingGame.roll(0);
        }
        assertEquals(0,javaBowlingGame.score());
    }

    @Test
    public void testforAllOnes(){
        JavaBowlingGame javaBowlingGame=new JavaBowlingGame();
        for(int i=0;i<20;i++) {
            javaBowlingGame.roll(1);
        }
        assertEquals(20,javaBowlingGame.score());
    }
    @Test
    public void testforSpare(){
        JavaBowlingGame javaBowlingGame=new JavaBowlingGame();
        for(int i=0;i<10;i++) {
            javaBowlingGame.roll(5);
            javaBowlingGame.roll(5);
        }
        javaBowlingGame.roll(5);
        assertEquals(150,javaBowlingGame.score());
    }

    @Test
    public void testForStrike(){
        JavaBowlingGame javaBowlingGame=new JavaBowlingGame();
        for(int i=0;i<12;i++){
            javaBowlingGame.roll(10);
        }
        assertEquals(300,javaBowlingGame.score());
    }
}
