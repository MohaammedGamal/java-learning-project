public class Car {
    int initial_speed;
    int speed;
    int max_speed;

    Car() {
        this.initial_speed = 0;
        this.speed = this.initial_speed;
    }

    void get_speed() {
        System.out.println(this.speed);
    }

    void set_speed(int s) {
        this.speed += s;
        System.out.println("Current speed increased to " + this.speed );
    }

}
