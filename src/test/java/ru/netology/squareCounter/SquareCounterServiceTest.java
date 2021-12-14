package ru.netology.squareCounter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareCounterServiceTest {


    @ParameterizedTest
    @CsvSource(
            value = {
                    "middleBorder, 200,300, 3",
                    "upperBorder, 9600, 9802,2",
                    "lowBorder, 99, 101, 1"
            },
            delimiter = ','
    )
    void calculateSquareCounter(String test, int lowValue, int upperValue, int expected) {
        SquareCounterService service = new SquareCounterService();

        int actual = service.calculate(lowValue, upperValue);

        assertEquals(expected, actual);
    }
}