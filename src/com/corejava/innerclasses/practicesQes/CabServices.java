package com.corejava.innerclasses.practicesQes;

public class CabServices {
    void bookCab() {
        // Local Inner Class (inside a method)
        class ReceiptGenerator {
            void generateReceipt() {
                System.out.println("Receipt : Cab booked successfully.");
            }
        }

        // Create object of local inner class inside the method
        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        receiptGenerator.generateReceipt();
    }

    public static void main(String[] args) {
        CabServices cabServices = new CabServices();
        cabServices.bookCab();
    }
}
