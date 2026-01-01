package com.corejava.oops.Inheritance;

class GrandFather{
    public void printGrandFather(){
        System.out.println("GrandFather");
    }

}

class Father extends GrandFather{

    public void printFather(){
        System.out.println("Father");
    }
}

class Uncle extends GrandFather{

    public void printUncle(){
        System.out.println("Uncle");
    }
}

public class HierarchyInheritance {
    public static void main(String[] args) {
        Father father = new Father();
        father.printGrandFather();

        Uncle uncle = new Uncle();
        uncle.printGrandFather();

    }
}
