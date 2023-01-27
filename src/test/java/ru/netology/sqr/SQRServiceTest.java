package ru.netology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalculateCorrectResult() {
        final SQRService service = new SQRService();
        final int actual = service.calculate(400, 600);
        final int expected = 5;


        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateZeroResult() {
        final SQRService service = new SQRService();
        final int actual = service.calculate(0, 0);
        final int expected = 0;


        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateMinusResult() {
        final SQRService service = new SQRService();
        final int actual = service.calculate(-1, 10);
        final int expected = 0;


        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateInInvalidRangeOfNumbers() {
        final SQRService service = new SQRService();
        final int actual = service.calculate(600, 400);
        final int expected = 0;


        Assertions.assertEquals(expected, actual);

    }
}
