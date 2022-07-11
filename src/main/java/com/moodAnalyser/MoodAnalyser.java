package com.moodAnalyser;

public class MoodAnalyser {
    private final String message;

    public MoodAnalyser(String message) {
        this.message = message;
        analyseMood();
    }
    public String analyseMood() {
        if (message.contains("Sad"))
            return "Sad";
//        else if (message.contains("Happy"))
//            return "HAPPY";
        else
            return "Happy";

    }
}
