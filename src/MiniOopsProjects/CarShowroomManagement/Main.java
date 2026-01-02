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
            userChoice = sc.nextInt();

            while (userChoice != 9 && userChoice != 0){
                switch (userChoice){
                    case 1:
                        showroom[showroomCounter] = new Showroom();
                        showroom[showroomCounter].setDetails();
                        showroomCounter++;
                        System.out.println();
                        System.out.println("1.ADD NEW SHOWROOM");
                        System.out.println("9.GO BACK TO MAIN MENU");
                        userChoice = sc.nextInt();
                        break;
                    case 2:
                        employees[employeesCounter] = new Employees();
                        employees[employeesCounter].setDetails();
                        employeesCounter++;
                        System.out.println();
                        System.out.println("1.ADD NEW EMPLOYEES");
                        System.out.println("9.GO BACK TO MAIN MENU");
                        userChoice = sc.nextInt();
                        break;
                    case 3:
                        cars[carCounter] = new Cars();
                        cars[carCounter].setDetails();
                        carCounter++;
                        System.out.println();
                        System.out.println("1.ADD NEW CAR");
                        System.out.println("9.GO BACK TO MAIN MENU");
                        userChoice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroomCounter; i++) {
                            showroom[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9.GO BACK TO MAIN MENU");
                        System.out.println("0.EXIT");
                        userChoice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employeesCounter; i++) {
                            employees[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9.GO BACK TO MAIN MENU");
                        System.out.println("0.EXIT");
                        userChoice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < carCounter; i++) {
                            cars[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9.GO BACK TO MAIN MENU");
                        System.out.println("0.EXIT");
                        userChoice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE");
                        break;

                }
            }
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
