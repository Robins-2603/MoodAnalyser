package com.moodAnalyser;

public class MoodAnalyser {
    public static String message;
    //constructor
    public MoodAnalyser(String message){
        this.message = message;
        analyseMood();
    }
    public String analyseMood() {
        try{
            if (message.contains("Sad"))
                return "SAD";
            else if (message.contains("Happy"))
                return "HAPPY";

        }catch (NullPointerException e){
            System.out.println("Please Enter the Valid Mood.");
        }
        return "HAPPY";
    }
}
