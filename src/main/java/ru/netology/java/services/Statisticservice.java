package ru.netology.java.services;

public class Statisticservice {
    public int minSales(long[] sales) { // int так как максимальные продажи рассчитывает, а не суммирует лонговые данные
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) { // инт так как небольшие объемы данных
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) { // int так как максимальные продажи рассчитывает, а не суммирует лонговые данные
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее, инт так как не содержит больших объемов данных

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1;
    }

    public long sumSales(long[] sales) { // лонг так как расчитывают сумму логновых данных, а не суммирует лонговые данные
        long sumSales = 0; // так как используется в расчете лонговых данных и сумма записывается в эту переменную
        for (long value : sales) {
            sumSales += value;
        }
        return sumSales;
    }

    public long summediumSales(long[] sales) { // лонг так как расчитывают сумму логновых данных, а не суммирует лонговые данные
        long sumSales = 0;
        for (long value : sales) {
            sumSales += value;
        }
        long averageSales = sumSales / 12;
        return averageSales;
    }

    public int numberOfMonthsBelowAverage(long[] sales) { // инт так как для расчета не используются большие объемы данных
        double average = averageSales(sales);
        int count = 0; // не несет больших объемов информации
        for (long s : sales) {
            if (s < average) {
                count++;
            }
        }
        return count;
    }

    private double averageSales(long[] sales) {
        long total = 0; // используется при расчете лонговых параметров
        for (long s : sales) {
            total += s;
        }
        return (double) total / sales.length;
    }

    public int numberOfMonthsMoreAverage(long[] sales) { // не несет больших объемов информации, так как расчитывает номер месяца
        double average = averageSales(sales);
        int count = 0; // не несет больших объемов информации
        for (long s : sales) {
            if (s > average) {
                count++;
            }
        }
        return count;
    }
}
