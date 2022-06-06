package computing.log;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("LogThreeBase tests")
public class LogThreeBaseTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private LogThreeBase logThreeBase;

    @BeforeEach
    void setup(){
        this.logThreeBase = new LogThreeBase(ACCURACY, LnMockFactory.getLnMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/computing/log/log3_test.csv")
    @DisplayName("LogThree test data from table")
    public void tableValuesTest(double expected, double num, double den) {
        double actual = logThreeBase.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test nan")
    public void nanStubsTest() {
        double expected = Double.NaN;
        double actual = logThreeBase.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test positive infinity")
    public void positiveInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = logThreeBase.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test negative infinity")
    public void negativeInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = logThreeBase.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}
