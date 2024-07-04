public class SquareWheel extends Wheel {
    public SquareWheel() {
        super(20000);
    }

    public double drive(double miles) {
        double driven = 0;
        if(super.lifespan >= miles) {
            super.lifespan -= miles;
            driven = miles;
            System.out.println("Square! This square wheel has " + super.lifespan + " miles left!");
        } else {
            driven = super.lifespan;
            super.lifespan = 0;
            System.out.println("POP! The square wheel has reached its lifespan.");
        }
        return driven;
    }
}
