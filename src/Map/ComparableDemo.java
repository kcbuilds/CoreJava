package Map;

import com.corejava.practicequestion.datatypes.Student;

import java.util.*;

class Student1 implements Comparable<Student1>{
    private int ID;
    private String name;

    public Student1(int id, String name){
        this.ID = id;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student1 o) {
        return this.getID() - o.getID();
    }
}


public class ComparableDemo {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(01,"KC"));
        list.add(new Student1(02,"KC"));
        list.add(new Student1(03,"KC"));

        list.sort(null);
        System.out.println(list);
    }
}
