package ru.netology.java.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStat {
    long [] sales = {
            8, 15, 13, 14, 17, 20, 19, 7, 16, 6, 11, 18
    };
    @Test
    public void test1() {
        Statisticservice service = new Statisticservice();
        long actual = service.minSales(sales);
        int count = 10;
        Assertions.assertEquals(count, actual);
    }


    @Test
    public void test2() {
        Statisticservice service = new Statisticservice();
        long actual = service.maxSales(sales);
        int count = 6;
        Assertions.assertEquals(count, actual);
    }
    @Test
    public void test3() {
        Statisticservice service = new Statisticservice();
        long actual = service.sumSales(sales);
        int count = 164;
        Assertions.assertEquals(count, actual);
    }
    @Test
    public void test4() {
        Statisticservice service = new Statisticservice();
        long actual = service.summediumSales(sales);
        int count = 13;
        Assertions.assertEquals(count, actual);
    }
    @Test
    public void test5() {
        Statisticservice service = new Statisticservice();
        long actual = service.numberOfMonthsBelowAverage(sales);
        int count = 5;
        Assertions.assertEquals(count, actual);
    }
    @Test
    public void test6() {
        Statisticservice service = new Statisticservice();
        long actual = service.numberOfMonthsMoreAverage(sales);
        int count = 7;
        Assertions.assertEquals(count, actual);
    }

}

