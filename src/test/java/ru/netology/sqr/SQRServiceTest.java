package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void sqrNumbersInPeriod() {
        SQRService service = new SQRService();
        // подготавливаем данные
        int minNumber = 100;
        int maxNumber = 300;
        int expected = 8;

        //вызываем целевой метод
        int actual = service.sqrNumber(minNumber,maxNumber);

        //проводим проверку
        assertEquals(expected, actual);

    }
}