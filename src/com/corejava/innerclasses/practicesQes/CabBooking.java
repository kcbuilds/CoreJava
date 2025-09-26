public class CabBooking {
    void bookCab() {
        // Local inner class declared inside a method
        class Receipt {
            void generate() {
                System.out.println("Receipt: Cab booked successfully.");
            }
        }

        // Object of local inner class created inside the method
        Receipt receipt = new Receipt();
        receipt.generate();
    }

    public static void main(String[] args) {
        CabBooking cabBooking = new CabBooking();
        cabBooking.bookCab();
    }
}
