package computing.trig;

import computing.Function;

public class Sin extends Function {

    private static final int ITERATION_NUMBER = 1000000;

    public Sin(double accuracy) {
        super(accuracy);
    }

    @Override
    public double calculate(double x) {
        int period = (int) (x / (Math.PI * 2));
        x -= period * Math.PI * 2;

        double result = 0, prev = 0;
        int sign = 1, i = 0;
        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        while (getAccuracy() <= Math.abs((sign * Math.pow(x, 2 * i + 1)) / factorial(2 * i + 1) - prev) && i < ITERATION_NUMBER) {
            result += (sign * Math.pow(x, 2 * i + 1)) / factorial(2 * i + 1);
            prev = (sign * Math.pow(x, 2 * i + 1)) / factorial(2 * i + 1);
            sign = -sign;
            i++;
        }
        return result;
    }

    private long factorial(int limit) {
        long result = 1;
        for (int i = 1; i <= limit; i++) result *= i;
        return result;
    }
}
