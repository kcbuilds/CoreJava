package MiniOopsProjects.CarShowroomManagement;

import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements Utility{
    String empID;
    String empName;
    int empAge;
    String empDepartment;

    @Override
    public void getDetails() {
        System.out.println("ID: " +empID);
        System.out.println("Name: " +empName);
        System.out.println("Age: " +empAge);
        System.out.println("Department: " +empDepartment);
        System.out.println("Showroom Name: " +showroomName);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        empID = String.valueOf(uuid);

        System.out.println("=========== *** ENTER EMPLOYEE DETAILS *** ==========");
        System.out.println();
        System.out.println("EMPLOYEE NAME: ");
        empName = sc.nextLine();
        System.out.println("EMPLOYEE AGE: ");
        empAge = sc.nextInt();
        sc.nextLine();
        System.out.println("EMPLOYEE DEPARTMENT: ");
        empDepartment = sc.nextLine();
        System.out.println("SHOWROOM NAME: ");
        showroomName = sc.nextLine();
    }
}
