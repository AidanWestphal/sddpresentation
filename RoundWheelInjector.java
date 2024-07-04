public class RoundWheelInjector {
    public static Car getCar() {
        RoundWheel rw = new RoundWheel();
        Car c = new Car(rw);
        return c;
    }
}
