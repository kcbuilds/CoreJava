package MiniOopsProjects.InternshipwithGemini;

public abstract class Person {
    protected int Id;
    protected String name;

    public abstract String getRole();

    public Person(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }
}




