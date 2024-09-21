// This is single line comment
/*
* This is multiline comment
* */

import java.sql.Array;
import java.util.LinkedList;

/** docs */
public class Main {

    public void print_greetings() {
        System.out.println("Hello ...");
    }

    public static void main(String[] args) {

        Main main_app = new Main();
        main_app.print_greetings();

        Car car = new Car();
        StrOps str = new StrOps("www.fawry.com");
        System.out.println(str.string_to_array()[0]);

        Book book1 = new Book("Predator", "Gemy", 200, 2024);
        book1.open_book();
        book1.open_book();
        book1.close_book();
        book1.close_book();

    }

}

