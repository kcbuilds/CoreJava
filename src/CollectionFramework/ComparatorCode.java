package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1; // Descending Order
        // return o1 - o2; // Ascending Order

        /*
          If 5-3=2 -- Positive- o1 come first & o2 second
          If 3-5=-2 -- Negative- o2 come first & o1 second
          if 0 -- Both have same
        */
    }
}

class MyComparator2 implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2 .length();
    }
}

class Student{
    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}



public class ComparatorCode {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(5);
        num.add(2);
        num.add(5);

        System.out.println(num);

        num.sort(new MyComparator());
        System.out.println(num);

        List<String> list = Arrays.asList("Monday", "Auesday", "Wednesday");
        list.sort(new MyComparator2());
        System.out.println(list);


        List<String> list1 = Arrays.asList("Applef","Egg","Orange","Mango");
        list1.sort((a,b) -> b.length()-a.length());
        System.out.println(list1);

        List<Student> student = new ArrayList<>();
        student.add(new Student("Karan", 7.0));
        student.add(new Student("Deepak", 5.0));
        student.add(new Student("Prem", 7.5));
        student.add(new Student("Viru", 6.3));
//        student.sort((o1, o2) ->{
//            if (o2.getGpa() - o1.getGpa() > 0) {
//                return 1;
//            } else if (o2.getGpa() - o1.getGpa() < 0) {
//                return -1;
//            }else {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        
        //Using Java 8 Features

        Comparator<Student> comparing = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);

        student.sort(comparing);
        for (Student s: student){
            System.out.println(s.getName() + ": " +s.getGpa());
        }


    }
}
