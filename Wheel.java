public abstract class Wheel {
    protected Wheel(double lifespan) {
        this.lifespan = lifespan;
    }

    public abstract double drive(double miles);

    public double getLifespan() {
        return lifespan;
    }

    public boolean isWorn() {
        return lifespan <= 0;
    }

    protected double lifespan;
}
