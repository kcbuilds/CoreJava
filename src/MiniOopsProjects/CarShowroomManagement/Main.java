package MiniOopsProjects.CarShowroomManagement;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employees[] = new Employees[5];
        Cars cars[] = new Cars[5];
        int carCounter = 0;
        int showroomCounter = 0;
        int employeesCounter = 0;
        int userChoice = 100;

        while (userChoice != 0){
            mainMenu();
        }

        switch (userChoice){
            case 1:
        }
    }

    public static void mainMenu(){
        System.out.println();
        System.out.println("=========== *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** ==========");
        System.out.println();
        System.out.println("========== *** ENTER YOUR CHOICE *** ==========");
        System.out.print("1.ADD SHOWROOM \t\t\t 2.ADD EMPLOYEES \t\t\t 3.ADD CARS");
        System.out.println();
        System.out.print("4.GET SHOWROOM \t\t\t 5.GET EMPLOYEES \t\t\t 6.GET CARS");
        System.out.println();
        System.out.print("0.EXIT");
        System.out.println();
    }
}
