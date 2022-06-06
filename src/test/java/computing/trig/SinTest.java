package computing.trig;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Sin tests")
public class SinTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private Sin sinFunction;

    @BeforeEach
    void setup(){
        this.sinFunction = new Sin(ACCURACY);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/computing/trig/sin_test.csv")
    @DisplayName("Sin basic data tests")
    public void tableValuesStubsTest(double expected, double num, double den) {
        double actual = sinFunction.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Sin nan test")
    public void nanStubsTest() {
        double expected = Double.NaN;
        double actual = sinFunction.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Sin positive infinity test")
    public void positiveInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = sinFunction.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Sin negative infinity test")
    public void negativeInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = sinFunction.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
