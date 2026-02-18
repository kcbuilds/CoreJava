package Java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String name = null;

//        Using old Java ->
//        if (name != null){
//            System.out.println(name.length());
//        }else {
//            System.out.println("Null");
//        }

//        Optional -> Java8
        Optional<String> valuedString = Optional.of("Java");
        Optional<String> emptyString = Optional.empty();
        Optional<String> nullString = Optional.ofNullable(null);

        // -> Check
        System.out.println(valuedString.isPresent());
        System.out.println(emptyString.isPresent());
        System.out.println(nullString.isPresent());

        // -> Get
        System.out.println(valuedString.get());
//        System.out.println(emptyString.get());  // -> NoSuchElementException
//        System.out.println(nullString.get());  // -> NoSuchElementException


//        -> Safe way to retrieve value

//      orElse -> if value present -> value otherwise default-value
        System.out.println(valuedString.orElse("default"));
        System.out.println(nullString.orElse("default"));
        System.out.println(nullString.orElse(null));

//      orElseGet -> (<Supplier>)
        String generatedValue = nullString.orElseGet(() -> {
            System.out.println("Generated Value");
            return "default";
        });

//      orElseThrows
//       nullString.orElseThrow(() -> new RuntimeException("Null value present!"));

//      FunctionalOperations ->
        Optional<String> optionalS = Optional.of("Java");

        // isPresent()
        System.out.println(optionalS.isPresent());

        // Map
        Optional<String> optionalS1 = optionalS.map(String::toUpperCase);
        System.out.println(optionalS1.get());

        // filter
        Optional<String> optionalS2 = optionalS.filter(x -> x.startsWith("J"));

        // Combined Operations
        optionalS.filter(x -> x.startsWith("J"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);


    }
}
