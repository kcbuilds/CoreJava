package com.corejava.Enums.PracticesQ;

public class CabBooking {

    enum CabType{
        MINI,SEDAN,SUV
    }

    private CabType cabType;

    public CabBooking(CabType cabType) {
        this.cabType = cabType;
    }

    public void showBookingDetails() {
        switch (cabType) {
            case MINI:
                System.out.println("You booked a MINI. Fare: ₹100");
                break;
            case SEDAN:
                System.out.println("You booked a SEDAN. Fare: ₹200");
                break;
            case SUV:
                System.out.println("You booked an SUV. Fare: ₹300");
                break;
        }
    }

    // Main method
    public static void main(String[] args) {
        CabBooking booking1 = new CabBooking(CabType.MINI);
        booking1.showBookingDetails();

        CabBooking booking2 = new CabBooking(CabType.SUV);
        booking2.showBookingDetails();
    }
}
