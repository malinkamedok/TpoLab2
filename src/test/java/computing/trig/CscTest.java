package computing.trig;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Csc Test")
public class CscTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private Csc cscFunction;

    @BeforeEach
    void setup(){
        this.cscFunction = new Csc(ACCURACY, TrigMockFactory.getSinMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/computing/trig/csc_test.csv")
    @DisplayName("Csc basic data tests")
    public void tableValuesStubsTest(double expected, double num, double den) {
        double actual = cscFunction.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }



}