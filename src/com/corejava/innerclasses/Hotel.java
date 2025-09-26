package com.corejava.innerclasses;

public class Hotel {
    private String hotelName;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String hotelName, int totalRooms, int reservedRooms) {
        this.hotelName = hotelName;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int numOfRooms){
        class ReservationValidator{
            boolean validate(){
                if (guestName == null || guestName.isBlank()){
                    System.out.println("GuestName can't blank");
                    return false;
                }
                if (numOfRooms < 0){
                    System.out.println("Number of rooms must be positive");
                    return false;
                }
                if (reservedRooms + numOfRooms > totalRooms){
                    System.out.println("Not enough rooms available");
                    return false;
                }
                return true;

            }
        }

        ReservationValidator reservationValidator = new ReservationValidator();
        if (reservationValidator.validate()){
            reservedRooms += numOfRooms;
            System.out.println("Reservation confirmed.");
        }else {
            System.out.println("Reservation Failed - " + "Available rooms :" + (totalRooms - reservedRooms));
        }
    }
}
