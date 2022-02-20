public class Main1 {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar("Volkswagen ID 4", 5, "white", "1.5 hours");

        Tank tank = new Tank("Leopard 2A7", 5, "grey", 1200, 6);

        Car car = new Car("Audi RS5-R", 5, "red");

        car.getInfo();
        System.out.println("");
        electricCar.getInfo();
        System.out.println("");
        tank.getInfo();
    }
}
