package ru.netology.services;

public class StatService {

    public long salesSum(long[] sales) {
        long sum =  0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long avgSum(long[] sales) {
        long sum = salesSum(sales);
        return sum / sales.length;
    }

    public long maxSalesMonth(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
          if (sales[i] >= sales[maxMonth]) {
              maxMonth = i;
          }
        }
        return maxMonth + 1;
    }

    public long minSalesMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long moreThanAvgAmount(long[] sales) {

        long avgSum = avgSum(sales);
        long counter = 0;

        for (long sale : sales) {
            if (sale > avgSum) {
                counter++;
            }
        }
        return counter;
    }

    public long lessThanAvgAmount(long[] sales) {

        long avgSum = avgSum(sales);
        long counter = 0;

        for (long sale : sales) {
            if (sale < avgSum) {
                counter++;
            }
        }
        return counter;
    }

}
