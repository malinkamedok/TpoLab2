package computing.log;

import computing.Function;

import java.text.DecimalFormat;

public class LogTenBase extends Function {

    private final static int BASE = 10;

    private final Ln lnFunc;
    private final DecimalFormat df = new DecimalFormat("#.#####");

    public LogTenBase(double accuracy, Ln lnFunc) {
        super(accuracy);
        this.lnFunc = lnFunc;
    }

    @Override
    public double calculate(double x) {
        if (Double.isNaN(x) || x < 0.0) {
            return Double.NaN;
        } else if (x == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
//        System.out.println(lnFunc.calculate(1));
//        System.out.println(lnFunc.calculate(x));


        return Double.parseDouble(df.format(lnFunc.calculate(x)
                / lnFunc.calculate(BASE)).replace(",", "."));
    }
}
