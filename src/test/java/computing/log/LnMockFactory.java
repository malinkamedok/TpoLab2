package computing.log;

import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LnMockFactory {

    public static Ln getLnMock() {
        Ln lnFunction = mock(Ln.class);

        when(lnFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(-0.64645);
        when(lnFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(-0.24145347290444164);
        when(lnFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.046117597181290375);
        when(lnFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(0.73973);
        when(lnFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(0.85725);
        when(lnFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(0.96183);
        when(lnFunction.calculate(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.45182);
        when(lnFunction.calculate(Mockito.eq(10.0))).thenReturn(2.30258);
        when(lnFunction.calculate(Mockito.eq(5.0))).thenReturn(1.6094379124341);
        when(lnFunction.calculate(Mockito.eq(3.0))).thenReturn(1.09861);
        when(lnFunction.calculate(Mockito.eq(2.0))).thenReturn(0.6931471805599);

        when(lnFunction.calculate(Mockito.eq(-1 * Math.PI / 2))).thenReturn(Double.NaN);
        when(lnFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(Double.NaN);
        when(lnFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(Double.NaN);
        when(lnFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(lnFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(lnFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return lnFunction;
    }

    public static LogTenBase getLogTenBaseMock() {
        LogTenBase logTenBaseFunction = mock(LogTenBase.class);

        when(logTenBaseFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(-0.28100);
        when(logTenBaseFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(-0.10491);
        when(logTenBaseFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.02002);
        when(logTenBaseFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(0.32105);
        when(logTenBaseFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(0.37221);
        when(logTenBaseFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(0.41796);
        when(logTenBaseFunction.calculate(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.19611);
        when(logTenBaseFunction.calculate(Mockito.eq(5))).thenReturn(0.69897);

        when(logTenBaseFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(logTenBaseFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(logTenBaseFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return logTenBaseFunction;
    }


    public static LogThreeBase getLogThreeBaseMock() {
        LogThreeBase logThreeBaseFunction = mock(LogThreeBase.class);

        when(logThreeBaseFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(-0.58895);
        when(logThreeBaseFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(-0.21988);
        when(logThreeBaseFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.04197);
        when(logThreeBaseFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(0.67290);
        when(logThreeBaseFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(0.78011);
        when(logThreeBaseFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(0.87602);
        when(logThreeBaseFunction.calculate(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.41104);
        when(logThreeBaseFunction.calculate(Mockito.eq(5))).thenReturn(1.46497);

        when(logThreeBaseFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(logThreeBaseFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(logThreeBaseFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return logThreeBaseFunction;
    }

    public static LogTwoBase getLogTwoBaseMock() {
        LogTwoBase logTwoBaseFunction = mock(LogTwoBase.class);

        when(logTwoBaseFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(-0.93195);
        when(logTwoBaseFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(-0.34809);
        when(logTwoBaseFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.06649);
        when(logTwoBaseFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(1.06643);
        when(logTwoBaseFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(1.23585);
        when(logTwoBaseFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(1.38662);
        when(logTwoBaseFunction.calculate(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.65137);

        when(logTwoBaseFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(logTwoBaseFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(logTwoBaseFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return logTwoBaseFunction;
    }
}
