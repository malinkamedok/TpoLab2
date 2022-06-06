package computing.trig;

import computing.Function;

public class Csc extends Function {
    private final Sin sinFunction;

    public Csc(double accuracy, Sin sinFunction) {
        super(accuracy);
        this.sinFunction = sinFunction;
    }

    public double calculate(double x) {
        if (Math.abs(x + Math.PI) < getAccuracy()) return Double.POSITIVE_INFINITY;
        double csc = 1 / sinFunction.calculate(x);
        return Double.isFinite(csc) ? csc : Double.POSITIVE_INFINITY;
    }
}