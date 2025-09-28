package MiniOopsProjects.InternshipwithGemini;

public class Professor extends Person{
    @Override
    public String getRole() {
        return "English Teaching.";
    }

    public Professor(int id, String name) {
        super(id, name);
    }
}
