package com.techreturners;

public class JavaBowlingGame {
    private int[] rolls=new int[21];//21 elements in array 10 frames,each frames 2 rolls with 1 additional for 10th frame
    private int currentRoll=0;
    private int score=0;
    public void roll(int pins) {
        //roll method is used to record the no of pins knocked down in each roll
        rolls[currentRoll++]=pins;
    }

    public int score() {
        int score=0;
        int frameIndex=0;
        for(int frame=0;frame <10;frame++){
            if(isSpare(frameIndex)){
                score +=10 + spareBonus(frameIndex);
                frameIndex +=2;
            }else if(isStrike(frameIndex)) {
                score += 10 + strikeBonus(frameIndex);
                frameIndex++;
            }else{
                score +=rolls[frameIndex] + rolls[frameIndex +1];
                frameIndex +=2;
            }
        }
        return score;
    }

    private boolean isSpare(int frameIndex){
        return rolls[frameIndex] + rolls[frameIndex + 1]==10;
    }
    private int spareBonus(int frameIndex){
        return rolls[frameIndex + 2];
    }

    private boolean isStrike(int frameIndex){
        return rolls[frameIndex]==10;
    }
    private int strikeBonus(int frameIndex){
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }
}
