package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaBowlingGameTest {
    private JavaBowlingGame javaBowlingGame;
    @Test
    public void testGutterGame(){
         javaBowlingGame=new JavaBowlingGame();
        for(int i=0;i<20;i++) {
            javaBowlingGame.roll(0);
        }
        assertEquals(0,javaBowlingGame.score());
    }

    @Test
    public void testforAllOnes(){
         javaBowlingGame=new JavaBowlingGame();
        for(int i=0;i<20;i++) {
            javaBowlingGame.roll(1);
        }
        assertEquals(20,javaBowlingGame.score());
    }
    @Test
    public void testforSpare(){
         javaBowlingGame=new JavaBowlingGame();
        for(int i=0;i<10;i++) {
            javaBowlingGame.roll(5);
            javaBowlingGame.roll(5);
        }
        javaBowlingGame.roll(5);
        assertEquals(150,javaBowlingGame.score());
    }

    @Test
    public void testForStrike(){
         javaBowlingGame=new JavaBowlingGame();
        for(int i=0;i<12;i++){
            javaBowlingGame.roll(10);
        }
        assertEquals(300,javaBowlingGame.score());
    }
    @Test
    public void testforNines(){
        javaBowlingGame=new JavaBowlingGame();
        for(int i=0;i<10;i++){
            javaBowlingGame.roll(9);
            javaBowlingGame.roll(0);
        }
        assertEquals(90,javaBowlingGame.score());
    }
    @Test
    public void testforMixedRolls(){
        javaBowlingGame=new JavaBowlingGame();
        int rolls[]={4,6,10,2,3,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for(int pins : rolls){
            javaBowlingGame.roll(pins);
        }
        assertEquals(45,javaBowlingGame.score());
    }
}
