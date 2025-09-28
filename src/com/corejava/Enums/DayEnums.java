package com.corejava.Enums;

public enum DayEnums {
//    private String English;               Enums ke body mein first write constant after that do whatever.

    SUNDAY("SUNDAY","Ravivar"),
    MONDAY("MONDAY","Somvar"),
    TUESDAY("TUESDAY","Mangvar"),
    WEDNESDAY("WEDNESDAY","Bhudvar");

    private String english;
    private String hindi;

    DayEnums(String english, String hindi) {
        System.out.println("Constructor Called");
        this.english = english;
        this.hindi = hindi;
    }

    public String getEnglish() {
        return english;
    }

    public String getHindi() {
        return hindi;
    }

    public void display(){
        System.out.println("Today is " + this.name());
    }

}
