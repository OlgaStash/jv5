package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        // подготавливаем данные
        int minNumber = 200;
        int maxNumber = 300;
        int expected = 3;

        //вызываем целевой метод
        int actual = service.sqrNumber(minNumber,maxNumber);

        //проводим проверку
        assertEquals(expected, actual);

        System.out.println(actual);
    }
}
