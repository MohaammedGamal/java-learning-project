// This is single line comment
/*
* This is multiline comment
* */

import java.util.LinkedList;

/** docs */
public class Main {
    public static void main(String[] args) {

        // For loops
        int i = 0;
        for (;;) {
            System.out.println(i + " ) Hello " + i);
            if (i < 5) {
                System.out.println(i + " ) Hello " + i);
            } else {
                break;
            }
            i++;
        }

        for (int x = 1; x < 5; x++) {
            for (int z = 0; z < 10; z++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        print_values(0);

        // While loops
        int counter = 0;
        while(counter <= 5) {
            System.out.println("I am a counter number " + counter + " from inside a while loop ...");
            counter++;
        }

        do {
            System.out.println("Test do ... while loop");
        } while (0 > 1);

    }

    public static void print_values(int value) {
        if (value <= 0)
            return; // Here we used return to just go out and back to normal code out of the function

        for (int y = value; y >= 0; y--) {
            System.out.println("--) " + y);
        }
    }

}

