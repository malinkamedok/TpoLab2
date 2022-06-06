package main;

import computing.Function;
import computing.log.*;
import computing.trig.Csc;
import computing.trig.Sin;
import computing.trig.Tan;

public class Computer extends Function {

    private final Tan tanFunc;
    private final Csc cscFunc;
    private final Ln lnFunc;
    private final LogTenBase logTenBaseFunc;
    private final LogThreeBase logThreeBaseFunc;
    private final LogTwoBase logTwoBaseFunc;

    public Computer(double accuracy, Tan tanFunc, Csc cscFunc, Ln lnFunc, LogTenBase logTenBaseFunc, LogThreeBase logThreeBaseFunc, LogTwoBase logTwoBaseFunc) {
        super(accuracy);
        this.tanFunc = tanFunc;
        this.cscFunc = cscFunc;
        this.lnFunc = lnFunc;
        this.logTenBaseFunc = logTenBaseFunc;
        this.logThreeBaseFunc = logThreeBaseFunc;
        this.logTwoBaseFunc = logTwoBaseFunc;
    }

    @Override
    public double calculate(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x <= 0) {
            return (tanFunc.calculate(x)/ cscFunc.calculate(x));
        } else {
            return (((Math.pow((logThreeBaseFunc.calculate(x) / logThreeBaseFunc.calculate(x)),3) - logThreeBaseFunc.calculate(x)) - (logThreeBaseFunc.calculate(x) + logTenBaseFunc.calculate(x))) - (logTwoBaseFunc.calculate(x) * (logTwoBaseFunc.calculate(x) / logTwoBaseFunc.calculate(x))));
        }
    }
}
