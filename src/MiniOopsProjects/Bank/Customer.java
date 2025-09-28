package MiniOopsProjects.Bank;

public class Customer {

    public String name;
    public int id;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void showDetails(){
        System.out.println(name);
        System.out.println(id);
    }

}
