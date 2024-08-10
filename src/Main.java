// This is single line comment
/*
* This is multiline comment
* */

import java.util.LinkedList;

/** docs */
public class Main {
    public static void main(String[] args) {

        char T = 'T';
        char F = 'F';
        char z = 'ز';

        System.out.println(T);
        System.out.println(F);
        System.out.println(z);

        String name = new String("Mohamed");
//        String name = "Mohamed";
        System.out.println(name.charAt(5));
        System.out.println(name.length());

        for (int i = 0; i < name.length(); i++) {
            System.out.println("Character number " + (i + 1) + " is " + name.charAt(i));
        }

//        if (name.equals("mohamed"))
        if (name.equalsIgnoreCase("mohamed"))
            System.out.println("======= Success =======");
        else
            System.out.println("======= Failed =======");


    }

}

