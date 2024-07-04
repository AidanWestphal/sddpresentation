public class Car {
    public Car(Wheel w) {
        this.w = w;
    }

    public void drive(double miles) {
        double d = w.drive(miles);
        System.out.println("The car drove " + d + " miles.");
    }

    private Wheel w;
}