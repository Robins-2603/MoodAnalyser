package com.moodAnalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Sad mood.");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        Assertions.assertEquals("SAD" , result);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In a Happy mood.");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        Assertions.assertEquals("HAPPY" , result);
    }
    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        Assertions.assertEquals("HAPPY" , result);
    }
}
