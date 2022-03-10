package com.bridgelabz.moodAnalyze;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;
import org.junit.Assert;

class MoodAnalyzerTest {

    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer.analyzeMood("Sad");
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyzer.analyzeMood("Happy");
        Assert.assertEquals("Happy",mood);
    }
}
