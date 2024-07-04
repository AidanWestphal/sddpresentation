public class Main {
    public static void main(String[] args) {
        // Create a car
        Car round = RoundWheelInjector.getCar();
        Car square = SquareWheelInjector.getCar();
        // Drive the cars
        round.drive(1000);
        square.drive(1000);
        System.out.println("=================");
        // Drive s.t. one of the cars breaks
        round.drive(20000);
        square.drive(20000);
        System.out.println("=================");
        // Drive some more with each car
        round.drive(1);
        square.drive(1);
        System.out.println("=================");
        // Drive s.t. both cars have exceeded their wheels lifespan
        round.drive(20000);
        square.drive(20000);
        System.out.println("=================");
    }
}
