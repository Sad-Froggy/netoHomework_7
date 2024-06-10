package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    StatService service = new StatService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldReturnSalesSum() {
        long sum = service.salesSum(sales);

        Assertions.assertEquals(180, sum);
    }

    @Test
    public void shouldReturnAvgSalesSum() {
        long avgSum = service.avgSum(sales);

        Assertions.assertEquals(15, avgSum);
    }

    @Test
    public void shouldReturnMaxSalesMonth() {

        long maxMonth = service.maxSalesMonth(sales);

        Assertions.assertEquals(8, maxMonth);
    }

    @Test
    public void shouldReturnMinSalesMonth() {

        long minMonth = service.minSalesMonth(sales);

        Assertions.assertEquals(9, minMonth);
    }

    @Test
    public void shouldReturnMoreThanAvgAmount() {

        long amount = service.moreThanAvgAmount(sales);

        Assertions.assertEquals(5, amount);
    }

    @Test
    public void shouldReturnLessThanAvgAmount() {

        long amount = service.lessThanAvgAmount(sales);

        Assertions.assertEquals(5, amount);
    }
// test comment

}
