package ru.netology.java.services;

public class Statisticservice {
    public long minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1;
    }

    public long sumSales(long[] sales) {
        int sumSales = 0;
        for (long value : sales) {
            sumSales += value;
        }
        return sumSales;
    }

    public long summediumSales(long[] sales) {
        int sumSales = 0;
        for (long value : sales) {
            sumSales += value;
        }
        int averageSales = sumSales / 12;
        return averageSales;
    }

    public long numberOfMonthsBelowAverage(long[] sales) {
        double average = averageSales(sales);
        int count = 0;
        for (long s : sales) {
            if (s < average) {
                count++;
            }
        }
        return count;
    }

    private double averageSales(long[] sales) {
        long total = 0;
        for (long s : sales) {
            total += s;
        }
        return (double) total / sales.length;
    }

    public long numberOfMonthsMoreAverage(long[] sales) {
        double average = averageSales(sales);
        int count = 0;
        for (long s : sales) {
            if (s > average) {
                count++;
            }
        }
        return count;
    }
}
