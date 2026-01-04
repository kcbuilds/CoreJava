package Generics;



public class Main {
    public static void main(String[] args) {
//        Box<String> box = new Box<>();  //Box is now type safe,
//        box.setValue("Karan");

//        String value = (String) box.getValue();
//        System.out.println(box.getValue());

        Pair<String, String> pair = new Pair<>("Name","Karan");
        System.out.println(pair.getKey() +" : " +pair.getValue());

        GenericsImplements<Integer> genericsImplements = new GenericsImplements<>();
        genericsImplements.add(5);
        System.out.println(genericsImplements.get());

        Box2<Integer> box2 = new Box2<>();
        box2.setValue(40);
        System.out.println(box2.getValue());

    }
}
