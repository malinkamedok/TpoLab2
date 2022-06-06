package computing.log;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("LogTenBase tests")
public class LogTenBaseTest {
    private static final double DELTA = 0.05;
    public static final double ACCURACY = 0.001;

    private LogTenBase logTenBase;

    @BeforeEach
    void setup(){
        this.logTenBase = new LogTenBase(ACCURACY, LnMockFactory.getLnMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/computing/log/log10_test.csv")
    @DisplayName("LogTen test data from table")
    public void tableValuesTest(double expected, double num, double den) {
        double actual = logTenBase.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test nan")
    public void nanStubsTest() {
        double expected = Double.NaN;
        double actual = logTenBase.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test positive infinity")
    public void positiveInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = logTenBase.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test negative infinity")
    public void negativeInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = logTenBase.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
