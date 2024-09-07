// This is single line comment
/*
* This is multiline comment
* */

import java.sql.Array;
import java.util.LinkedList;

/** docs */
public class Main {
    public static void main(String[] args) {

//        String channels[] = new String[3];
//        String[] channels = new String[3];
        String channels [] = {"MyFawry", "Bank", "External", "Merchant"};
        int [] x, y; // both are arrays
        int z[], c; // z is an array, c is a normal int variable
        channels[0] = "MyFawry";
        channels[1] = "Bank";
        channels[2] = "External";
        float f = 1.2f;
        double d = 1.222222222222;
        short s = 2535;
        long l = 1515181818111111111L;


        int length = channels.length; // arrtibute
        "mohamed".length(); // method

        // foreach loop
        for (String channel : channels) {
            System.out.println("I am channel " + channel);
        }

        Car car = new Car();
        car.print_values(channels);

        System.out.println("===================");

        int [][] multi = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int [][] multi2 = new int[2][3]; // 2 rows, 3 columns

//        System.out.println(multi[0]);
//        System.out.println(multi[1]);
//        System.out.println(multi[2]);

        for(int ii = 0; ii < multi.length; ii++) {
            for (int jj = 0; jj < multi[ii].length; jj++) {
                System.out.println(multi[ii][jj]);
            }
        }


    }

}

