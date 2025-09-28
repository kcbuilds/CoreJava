package MiniOopsProjects.InternshipwithGemini;

public class main {
    public static void main(String[] args) {
        Person stu = new Student(1001,"Deepak");
        Person prof = new Professor(101,"Ravi");

        System.out.println("Student Id: " + stu.getId());
        System.out.println("Student name: " +stu.getName());
        System.out.println("Student name: " +stu.getRole());


        System.out.println("Professor Id: " +prof.getId());
        System.out.println("Professor name: "+prof.getName());
        System.out.println("Professor name: "+prof.getRole());


    }
}
