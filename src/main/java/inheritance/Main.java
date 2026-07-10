package inheritance;

public class Main {

    static void main() {


        Car car1 = new Car("BMW", "Black", "X5", 2020);

        car1.setColor("Weiß");
        car1.setBrand("Audi");

        System.out.println(car1);

        new Car();
        new Vehicle();
    }
}
