package com.moodAnalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a Happy Mood");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        Assertions.assertEquals("Happy" , result);
    }
}
