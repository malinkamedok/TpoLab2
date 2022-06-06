package computing.trig;

import computing.Function;

public class Tan extends Function {

    private final Sin sinFunc;
    private final Cos cosFunc;

    public Tan(double accuracy, Sin sinFunc, Cos cosFunc) {
        super(accuracy);
        this.sinFunc = sinFunc;
        this.cosFunc = cosFunc;
    }

    @Override
    public double calculate(double x) {
        double tan = sinFunc.calculate(x) / cosFunc.calculate(x);
        return Double.isFinite(tan) ? tan : Double.POSITIVE_INFINITY;
    }
}
