package inheritance;


import java.util.Objects;

public class Car extends Vehicle{

    private String color;

    public Car() {
        super();
    }

    public Car(String brand, String color, String model, int year) {
        super(brand, model, year);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Car{" +
               "color='" + color + '\'' +
               ", brand='" + brand + '\'' +
               ", model='" + model + '\'' +
               ", year=" + year +
               '}';
    }
}
