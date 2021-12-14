package ru.netology.squareCounter;

public class SquareCounterService {
    public int calculate(int lowValue, int upperValue) {
        int counter;
        counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i < upperValue && i * i > lowValue) {
                counter += 1;
            }
        }
        return counter;
    }
}






