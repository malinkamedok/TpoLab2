package computing.log;

import computing.Function;

import java.text.DecimalFormat;

public class Ln extends Function {

    private static final int ITERATION_NUMBER = 1000000;
    private final DecimalFormat df = new DecimalFormat("#.#####");

    public Ln(double accuracy) {
        super(accuracy);
    }

    @Override
    public double calculate(double x) {

        if (Double.isNaN(x) || x < 0.0) {
            return Double.NaN;
        } else if (x == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }

        double currentValue = 0;
        double previousValue;
        int iteration = 1;

        if (Math.abs(x - 1) <= 1) {
            do {
                previousValue = currentValue;
                currentValue += ((Math.pow(-1, iteration - 1)
                        * Math.pow(x - 1, iteration)) / iteration);
                iteration++;
            } while (getAccuracy() <= Math.abs(currentValue - previousValue)
                    && iteration < ITERATION_NUMBER);
        } else {
            do {
                previousValue = currentValue;
                currentValue += ((Math.pow(-1, iteration - 1)
                        * Math.pow(x - 1, -iteration)) / iteration);
                iteration++;
            } while (getAccuracy() <= Math.abs(currentValue - previousValue)
                    && iteration < ITERATION_NUMBER);

            currentValue += calculate(x - 1);
        }

        DecimalFormat df = new DecimalFormat("#.#####");

        return Double.parseDouble(df.format(currentValue).replace(",", "."));

    }
}
