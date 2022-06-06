package computing.log;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Ln tests")
public class LnTest {
    private static final double DELTA = 0.05;
    public static final double ACCURACY = 0.001;

    private Ln lnFunction;

    @BeforeEach
    void setup(){
        this.lnFunction = new Ln(ACCURACY);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/computing/log/ln_test.csv")
    @DisplayName("Ln test data from table")
    public void tableValuesTest(double expected, double num, double den) {
        double actual = lnFunction.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test nan")
    public void nanStubsTest() {
        double expected = Double.NaN;
        double actual = lnFunction.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test positive infinity")
    public void positiveInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = lnFunction.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test negative infinity")
    public void negativeInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = lnFunction.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
