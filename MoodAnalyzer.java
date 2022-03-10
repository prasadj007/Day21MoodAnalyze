package com.bridgelabz.moodAnalyze;

public class MoodAnalyzer {

	  private String msg;
	    public MoodAnalyzer() {
	    }

	    public MoodAnalyzer(String msg){
	        this.msg = msg;
	    }

	    public String analyzeMood(String msg) {
	        if(msg.contains("Sad")){
	            return "Sad";
	        }
	        return "Happy";
	    }

	}

