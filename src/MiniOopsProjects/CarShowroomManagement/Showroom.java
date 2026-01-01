package MiniOopsProjects.CarShowroomManagement;

import java.util.Scanner;

public class Showroom implements Utility{

    String showroomName;
    String showroomAddress;
    int totalEmployees;
    int totalCarInStock = 0;
    String managerName;

    @Override
    public void getDetails() {
        System.out.print("Showroom Name: " +showroomName);
        System.out.print("Showroom Address: " +showroomAddress);
        System.out.print("Manager Name: " +managerName);
        System.out.print("Total Employees: " +totalEmployees);
        System.out.print("Total Car In Stock: " +totalCarInStock);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========== *** ENTER SHOWROOM DETAILS *** ==========");
        System.out.println();
        System.out.println("Showroom Name: ");
        showroomName = sc.nextLine();

        System.out.println("Showroom Address: ");
        showroomAddress = sc.nextLine();

        System.out.println("Manager Name: ");
        managerName = sc.nextLine();

        System.out.println("Total Employees: ");
        totalEmployees = sc.nextInt();

        System.out.println("Total Car In Stock: ");
        totalCarInStock = sc.nextInt();


    }
}
