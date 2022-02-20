
public class Car {

    protected final String name;
    protected final String color;
    protected final int seats;

    public Car(String name, int seats, String color) {
        this.name = name;
        this.color = color;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSeats() {
        return seats;
    }

    public void getInfo() {
        System.out.println("jméno: " + name + "  počet sedadel " + seats + "  barva: " + color);
    }

}
