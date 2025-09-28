package com.corejava.Enums.PracticesQ;

public class test {
    public static void main(String[] args) {
//        System.out.println(DayEnums.MONDAY);
//
//        DayEnums day = DayEnums.MONDAY;
//        DayEnums[] values = DayEnums.values();
//        for (DayEnums i : values){
//            System.out.println(i);
//        }

        DayEnums light = DayEnums.RED;
        String traffic = switch (light){
            case RED -> "Stop";
            case YELLOW -> "Ready";
            case GREEN -> "Go";
            default -> "TrafficLight Closed";
        };

        System.out.println(traffic);



    }
}
