package com.corejava;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder ();
        // char array(default 16), if full it increase 2x
        // thread-safe
        // mutable
        // method chaining

        sb.append("Hello");
        sb.insert(5, "Java");
//        sb.replace(4,6, "JS");  // Start + 1

//        sb.delete(5,8); // Start+1 --> end-1
          sb.reverse();
        System.out.println(sb.charAt(0));

        System.out.println(sb.substring(1,4)); // end-1
        System.out.println(sb);
    }
}
