package main;

import computing.log.*;
import computing.trig.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.lang.reflect.AccessibleObject;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    static Computer computer;

    @AfterAll
    static void logInCSV() {
        CsvLogger csvLogger = new CsvLogger("computer_result.csv");
        csvLogger.log(computer);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void allStubsTest(double expected, double num, double den) {
        computer = new Computer(ACCURACY, TrigMockFactory.getTanMock(),TrigMockFactory.getCscMock(), LnMockFactory.getLnMock(), LnMockFactory.getLogTenBaseMock(), LnMockFactory.getLogThreeBaseMock(), LnMockFactory.getLogTwoBaseMock());
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void lnStubTest(double expected, double num, double den) {
        Sin sinFunction = new Sin(ACCURACY);
        Cos cosFunction = new Cos(ACCURACY, sinFunction);
        Tan tanFunction = new Tan(ACCURACY, sinFunction, cosFunction);
        Csc cscFunction = new Csc(0.001, sinFunction);
        Ln lnFunction = LnMockFactory.getLnMock();
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogThreeBase logThreeBase = new LogThreeBase(ACCURACY, lnFunction);
        LogTenBase logTenBase = new LogTenBase(0.001, lnFunction);
        computer = new Computer(0.001, tanFunction, cscFunction, lnFunction, logTenBase, logThreeBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void sinStubTest(double expected, double num, double den) {
        Sin sinFunction = TrigMockFactory.getSinMock();
        Cos cosFunction = new Cos(ACCURACY, sinFunction);
        Tan tanFunction = new Tan(ACCURACY, sinFunction, cosFunction);
        Csc cscFunction = new Csc(0.001, sinFunction);
        Ln lnFunction = LnMockFactory.getLnMock();
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogThreeBase logThreeBase = new LogThreeBase(ACCURACY, lnFunction);
        LogTenBase logTenBase = new LogTenBase(0.001, lnFunction);
        computer = new Computer(ACCURACY, tanFunction, cscFunction, lnFunction, logTenBase, logThreeBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void cosStubTest(double expected, double num, double den) {
        Cos cosFunction = TrigMockFactory.getCosMock();
        Sin sinFunction = new Sin(ACCURACY);
        Tan tanFunction = new Tan(ACCURACY, sinFunction, cosFunction);
        Csc cscFunction = new Csc(0.001, sinFunction);
        Ln lnFunction = LnMockFactory.getLnMock();
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogThreeBase logThreeBase = new LogThreeBase(ACCURACY, lnFunction);
        LogTenBase logTenBase = new LogTenBase(0.001, lnFunction);
        computer = new Computer(ACCURACY, tanFunction, cscFunction, lnFunction, logTenBase, logThreeBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void tanStubTest(double expected, double num, double den) {
        Tan tanFunction = TrigMockFactory.getTanMock();
        Sin sinFunction = new Sin(ACCURACY);
        Cos cosFunction = new Cos(ACCURACY, sinFunction);
        Csc cscFunction = new Csc(0.001, sinFunction);
        Ln lnFunction = LnMockFactory.getLnMock();
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogThreeBase logThreeBase = new LogThreeBase(ACCURACY, lnFunction);
        LogTenBase logTenBase = new LogTenBase(0.001, lnFunction);
        computer = new Computer(ACCURACY, tanFunction, cscFunction, lnFunction, logTenBase, logThreeBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void logTwoStubTest(double expected, double num, double den) {
        LogTwoBase logTwoBase = LnMockFactory.getLogTwoBaseMock();
        Sin sinFunction = new Sin(ACCURACY);
        Cos cosFunction = new Cos(ACCURACY, sinFunction);
        Tan tanFunction = new Tan(ACCURACY, sinFunction, cosFunction);
        Csc cscFunction = new Csc(0.001, sinFunction);
        Ln lnFunction = LnMockFactory.getLnMock();
        LogThreeBase logThreeBase = new LogThreeBase(ACCURACY, lnFunction);
        LogTenBase logTenBase = new LogTenBase(0.001, lnFunction);
        computer = new Computer(ACCURACY, tanFunction, cscFunction, lnFunction, logTenBase, logThreeBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void logThreeStubTest(double expected, double num, double den) {
        LogThreeBase logThreeBase = LnMockFactory.getLogThreeBaseMock();
        Sin sinFunction = new Sin(ACCURACY);
        Cos cosFunction = new Cos(ACCURACY, sinFunction);
        Tan tanFunction = new Tan(ACCURACY, sinFunction, cosFunction);
        Csc cscFunction = new Csc(0.001, sinFunction);
        Ln lnFunction = LnMockFactory.getLnMock();
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogTenBase logTenBase = new LogTenBase(0.001, lnFunction);
        computer = new Computer(ACCURACY, tanFunction, cscFunction, lnFunction, logTenBase, logThreeBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }
}