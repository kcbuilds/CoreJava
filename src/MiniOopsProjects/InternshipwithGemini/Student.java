package MiniOopsProjects.InternshipwithGemini;

public class Student extends Person{


    @Override
    public String getRole() {
        return "Focus in class..";
    }

    public Student(int id, String name) {
        super(id, name);
    }
}
