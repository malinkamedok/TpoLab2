package computing.trig;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tan tests")
public class TanTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private Tan tanFunction;

    @BeforeEach
    void setup(){
        this.tanFunction = new Tan(ACCURACY, TrigMockFactory.getSinMock(), TrigMockFactory.getCosMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/computing/trig/tan_test.csv")
    @DisplayName("Tan basic data tests")
    public void tableValuesStubsTest(double expected, double num, double den) {
        double actual = tanFunction.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Tan nan test")
    public void nanStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = tanFunction.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Tan positive infinity test")
    public void positiveInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = tanFunction.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Tan negative infinity test")
    public void negativeInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = tanFunction.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
