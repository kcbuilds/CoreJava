package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " : " + salary;
    }
}

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> studentMarks = new ArrayList<>();

        studentMarks.add(45);
        studentMarks.add(90);
        studentMarks.add(12);
        studentMarks.add(67);
        studentMarks.add(34);
        System.out.println(studentMarks);

        studentMarks.remove(2);
        System.out.println(studentMarks);

        System.out.println(studentMarks.get(2));

        for (int marks : studentMarks){
            System.out.print(marks +" ");
        }
        System.out.println();

//        studentMarks.sort(null);
//        System.out.println(studentMarks);

        Collections.sort(studentMarks, (a,b) -> a - b);
        System.out.println(studentMarks);

        Collections.sort(studentMarks, (a,b) -> b-a);
        System.out.println(studentMarks);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Deepak",30000));
        employees.add(new Employee("Karan",50000));
        employees.add(new Employee("Ritesh",40000));
        employees.add(new Employee("Vishwajeet",50000));



        if (employees.isEmpty()){
            System.out.println("No Data");
        } else {
            employees.sort(Comparator.comparing((Employee e) -> e.salary).thenComparing(e -> e.name).reversed());
            for (Employee e : employees){
                System.out.println(e);
            }
        }

        // Student Ranking System

        ArrayList<StudentRankingSystem> studentRankingSystems = new ArrayList<>();
        studentRankingSystems.add(new StudentRankingSystem("Karan",95,24));
        studentRankingSystems.add(new StudentRankingSystem("Deepak",80,23));
        studentRankingSystems.add(new StudentRankingSystem("Prem",70,24));
        studentRankingSystems.add(new StudentRankingSystem("Amar",95,23));

        if (studentRankingSystems.isEmpty()){
            System.out.println("No Data Available");
        } else {
            studentRankingSystems.sort(
                    // Less Prof..
//                  Comparator.comparing((StudentRankingSystem s) -> s.getMarks())
//                          .reversed()
//                          .thenComparing(s -> s.getAge()));

                    // More Prof...
                    Comparator.comparing(StudentRankingSystem :: getMarks)
                            .reversed()
                            .thenComparing(StudentRankingSystem::getAge));

        }

        for (StudentRankingSystem system: studentRankingSystems){
            System.out.println(system);
        }



    }

    static class StudentRankingSystem{
        private String name;
        private int marks;
        private int age;

        public StudentRankingSystem(String name, int marks, int age) {
            this.name = name;
            this.marks = marks;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student Name: " +name +"," +" Age: " +age +"," +" Marks: " +marks ;
        }
    }
}
