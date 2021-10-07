package ru.netology.sqr;

public class SQRService {
    public int sqrNumber(int minNumber, int maxNumber) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int num = i * i;
            if (num >= minNumber && num <= maxNumber) {
                System.out.println(i);
                counter++;
            }
        }
        return counter;
    }
}
