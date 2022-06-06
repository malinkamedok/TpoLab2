package computing.trig;

import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TrigMockFactory {

    public static Sin getSinMock() {
        Sin sinFunction = mock(Sin.class);

        when(sinFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(0.49999999999999994);
        when(sinFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(0.7071067811865475);
        when(sinFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.8660254037844386);
        when(sinFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(0.8660254037844387);
        when(sinFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(0.7071067811865476);
        when(sinFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(0.49999999999999994);
        when(sinFunction.calculate(Mockito.eq(1 * Math.PI / 2))).thenReturn(1.0);
        when(sinFunction.calculate(Mockito.eq(-1 * Math.PI / 2))).thenReturn(-1.0);
        when(sinFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(-0.7071067811865475);
        when(sinFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(-0.7071067811865476);


        when(sinFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN);
        when(sinFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(sinFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return sinFunction;
    }

    public static Cos getCosMock() {
        Cos cosFunction = mock(Cos.class);
        when(cosFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(0.8660254037844387);
        when(cosFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(0.7071067811865476);
        when(cosFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.5000000000000001);
        when(cosFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(-0.4999999999999998);
        when(cosFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(-0.7071067811865475);
        when(cosFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(-0.8660254037844387);
        when(cosFunction.calculate(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.0);
        when(cosFunction.calculate(Mockito.eq(-1 * Math.PI / 2))).thenReturn(0.0);
        when(cosFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(0.7071067811865476);
        when(cosFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(-0.7071067811865475);

        when(cosFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN);
        when(cosFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(cosFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return cosFunction;
    }

    public static Tan getTanMock() {
        Tan tanFunction = mock(Tan.class);

        when(tanFunction.calculate(Mockito.eq(Math.PI / 2))).thenReturn(Double.POSITIVE_INFINITY);
        when(tanFunction.calculate(Mockito.eq(- Math.PI / 2))).thenReturn(Double.POSITIVE_INFINITY);

        when(tanFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(0.5773502691896257);
        when(tanFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(0.9999999999999999);
        when(tanFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(1.7320508075688767);
        when(tanFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(-1.7320508075688783);
        when(tanFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(-1.0000000000000002);
        when(tanFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(-0.5773502691896257);

        when(tanFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(-0.9999999999999999);
        when(tanFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(1.0000000000000002);


        when(tanFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN);
        when(tanFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(tanFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return tanFunction;
    }

    public static Csc getCscMock() {
        Csc cscFunction = mock(Csc.class);

        when(cscFunction.calculate(Mockito.eq(Math.PI / 2))).thenReturn(Double.POSITIVE_INFINITY);
        when(cscFunction.calculate(Mockito.eq(- Math.PI / 2))).thenReturn(Double.POSITIVE_INFINITY);

        when(cscFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(0.5773502691896257);
        when(cscFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(0.9999999999999999);
        when(cscFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(1.7320508075688767);
        when(cscFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(-1.7320508075688783);
        when(cscFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(-1.0000000000000002);
        when(cscFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(-0.5773502691896257);

        when(cscFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(-0.9999999999999999);
        when(cscFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(1.0000000000000002);


        when(cscFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN);
        when(cscFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(cscFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return cscFunction;
    }


}
