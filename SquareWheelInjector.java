public class SquareWheelInjector {
    public static Car getCar() {
        SquareWheel sw = new SquareWheel();
        Car c = new Car(sw);
        return c;
    }
}
