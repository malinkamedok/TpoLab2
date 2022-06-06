package computing.log;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("LogTwoBase tests")
public class LogTwoBaseTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private LogTwoBase logTwoBase;

    @BeforeEach
    void setup(){
        this.logTwoBase = new LogTwoBase(ACCURACY, LnMockFactory.getLnMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/computing/log/log2_test.csv")
    @DisplayName("LogTwo test data from table")
    public void tableValuesTest(double expected, double num, double den) {
        double actual = logTwoBase.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test nan")
    public void nanStubsTest() {
        double expected = Double.NaN;
        double actual = logTwoBase.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test positive infinity")
    public void positiveInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = logTwoBase.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test negative infinity")
    public void negativeInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = logTwoBase.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}
