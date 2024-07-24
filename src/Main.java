// This is single line comment
/*
* This is multiline comment
* */
/** docs */
public class Main {
    public static void main(String[] args) {

        String name = "test";
        String nick_name = "Gemy";
        String another_name = "Muhamed ahmed";

        if (name.equals("Mohamed")){
            System.out.println("Hello " + name + " i am from inside if statement ...");
        }
        else if (nick_name.equals("Gemy")) {
            System.out.println("Hello " + nick_name + " i am from inside if statement ...");
        }
        else if (another_name.equals("Muhamed ahmed")) {
            System.out.println("Hello " + another_name + " i am from inside if statement ...");
        }

        switch (name) {
            case "Mohamed":
                System.out.println("Descent ...");
                break;
            case "Jamjoom":
                System.out.println("Funky ...");
                break;
            default:
                System.out.println("Check it your self ...");
        };

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

