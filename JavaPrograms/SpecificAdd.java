//33.	How to add an element at a specific position in an ArrayList (create using <>)


import java.util.*;

public class SpecificAdd {

    public static void main(String[] args) {

                     ArrayList<String> abc=new ArrayList<>();

                     System.out.println("initially arraylist");

                     abc.add("arun");

                     abc.add("maya");

                     System.out.println(abc);

                     System.out.println("to add an element at perticular imdex ");

                     abc.add(1,"chukki");

                     System.out.println(abc);

}

}