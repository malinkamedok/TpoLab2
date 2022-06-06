package computing.trig;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Cos tests")
public class CosTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private Cos cosFunction;

    @BeforeEach
    void setup(){
        this.cosFunction = new Cos(ACCURACY, TrigMockFactory.getSinMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/computing/trig/cos_test.csv")
    @DisplayName("Cos basic data tests")
    public void tableValuesStubsTest(double expected, double num, double den) {
        double actual = cosFunction.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Cos nan test")
    public void nanStubsTest() {
        double expected = Double.NaN;
        double actual = cosFunction.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Cos positive infinity test")
    public void positiveInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = cosFunction.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Cos negative infinity test")
    public void negativeInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = cosFunction.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}
