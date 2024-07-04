public class RoundWheel extends Wheel {
    public RoundWheel() {
        super(40000);
    }

    public double drive(double miles) {
        double driven = 0;
        if(super.lifespan >= miles) {
            super.lifespan -= miles;
            driven = miles;
            System.out.println("Roll! This round wheel has " + super.lifespan + " miles left!");
        } else {
            driven = super.lifespan;
            super.lifespan = 0;
            System.out.println("POP! The round wheel has reached its lifespan.");
        }
        return driven;
    }
}
