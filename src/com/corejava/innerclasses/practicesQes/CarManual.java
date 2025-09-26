package com.corejava.innerclasses.practicesQes;

public class CarManual {

    static class InfoSection {   // static inner class
        void printInfo() {
            System.out.println("Car Manual : Always wear seatbelt.");
        }
    }

    public static void main(String[] args) {
        InfoSection infoSection = new InfoSection();  // no outer object needed
        infoSection.printInfo();
    }
}
