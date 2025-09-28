package com.corejava.Enums;


public class main {

    public enum Months{
        JAN,FEB,MARCH,APRIL,MAY,JUNE,JULY,AUG,SEP,OCT,NOV,DEC
    }


    public static void main(String[] args) {
//        System.out.println("MONDAY");
//        System.out.println("MONDAY");
//        System.out.println("MONDAY");
//        System.out.println("MONDAY");
//        System.out.println("MONDAY");

//      Using Class to create CONSTANT
        System.out.println(DayClass.MONDAY);
        System.out.println(DayClass.SUNDAY);
        System.out.println(DayClass.WEDNESDAY);

//      Using Interface to create CONSTANT
        System.out.println(DayInterface.MONDAY);
        System.out.println(DayInterface.SUNDAY);
        System.out.println(DayInterface.WEDNESDAY);

//      Using Enums to create CONSTANT
        System.out.println(DayEnums.MONDAY);
        System.out.println(DayEnums.TUESDAY);
        System.out.println(DayEnums.WEDNESDAY);
        System.out.println(DayEnums.SUNDAY);

        DayEnums monday = DayEnums.MONDAY;
        System.out.println(monday.ordinal());
        System.out.println(monday.name().toLowerCase());

        try {
            DayEnums dayEnums = DayEnums.valueOf("MONDAY"); // Display only when word match.
            System.out.println(dayEnums);
        }catch (Exception e){
            System.out.println(e);
        }

        DayEnums[] values = DayEnums.values();
        for (DayEnums i : values){
            System.out.println(i);
        }

        System.out.println(monday.getEnglish());
        System.out.println(monday.getHindi());

//      Using SwitchCase (Old Java)
        switch (monday){
            case MONDAY:{
                System.out.println("Monday");
                break;
            }
            case TUESDAY:{
                System.out.println("Tuesday");
                break;
            }
            default:{
                System.out.println("WeekEnd");
            }
        }

//      Using SwitchCase (Java12)
        String res = switch (monday){
//            case MONDAY -> System.out.println("Monday");
//            case TUESDAY -> System.out.println("Tuesday");
            case MONDAY -> "M";   //Return
            case TUESDAY -> "T";
            default -> "Weekend";
        };

        System.out.println(res);


        System.out.println(Months.JAN);
    }
}
