// This is single line comment
/*
* This is multiline comment
* */
/** docs */
public class Main {
    public static void main(String[] args) {

        String name = "Mohamed";
        String nick_name = "Gemy";

        if (name.equals("Mohamed"))
            System.out.println("Hello " + name + " i am from inside if statement ...");

        Car mazda = new Car();
        System.out.println("1 - Current speed is " + mazda.get_speed());
        mazda.set_speed(260);
        System.out.println("2 - Current speed is " + mazda.get_speed());
        if (mazda.get_speed() > 250) {
            System.out.print("Your current speed is ".toUpperCase() + mazda.get_speed() + " and you need to slow down ...".toUpperCase());
        } else {
            System.out.println("Your current speed is " + mazda.get_speed() + " and it's legal speed ...");
        }
    }

}

