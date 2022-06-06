package computing.trig;

import computing.Function;

public class Cos extends Function {

    private final Sin sinFunc;

    public Cos(double accuracy, Sin sinFunc) {
        super(accuracy);
        this.sinFunc = sinFunc;
    }

    @Override
    public double calculate(double x) {
        int period = (int) (x / (Math.PI * 2));
        x -= period * Math.PI *2;

        int sign;
        if(x > Math.PI / 2 && x < 3 * Math.PI / 2) {
            sign = -1;
        }
        else if(x < -Math.PI / 2 && x > -3 * Math.PI / 2) {
            sign = -1;
        }
        else {
            sign = 1;
        }

        return sign * Math.sqrt(1 - Math.pow(sinFunc.calculate(x), 2));
    }
}
