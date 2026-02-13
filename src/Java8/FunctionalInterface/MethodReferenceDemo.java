package Java8.FunctionalInterface;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }

}



public class MethodReferenceDemo {

    public static void printList(String list){
        System.out.println(list);
    }


    public static void main(String[] args) {

        // Method Reference -->
        // use method without invoking
        // used in place of lambda expression
        // making code cleaner and more readable
        // Only calls an existing method

        List<String> fruitList = Arrays.asList("Apple", "Orange", "Mango");
//      fruitList.forEach(System.out::println);
        fruitList.forEach(MethodReferenceDemo::printList);


        // Constructor Reference -->
        List<String> names = Arrays.asList("Karan", "Ritesh", "Vishal");
        List<Student> studentList = names.stream().map(Student::new).collect(Collectors.toList());

        System.out.println(studentList);


    }
}
