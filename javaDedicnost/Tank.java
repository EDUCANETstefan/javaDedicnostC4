public class Tank extends Car {
    private final int maxAmmo;
    private final int gSpots;

    public Tank(String name, int seats, String color, int maxAmmo, int weakSpots) {
        super(name, seats, color);
        this.maxAmmo = maxAmmo;
        this.gSpots = weakSpots;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public int getgSpots() {
        return gSpots;
    }

    @Override
    public void getInfo() {
        System.out.println("jméno tanku: " + name + "  počet míst: " + seats + " barva: " + color + " náboje " + maxAmmo + " slabiny " + gSpots);
    }
}
