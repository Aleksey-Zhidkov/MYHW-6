import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int [] sales = new int [12];
//        sales[0] = 8;
//        sales[1] = 15;
//        sales[2] = 13;
//        sales[3] = 14;
//        sales[4] = 17;
//        sales[5] = 20;
//        sales[6] = 19;
//        sales[7] = 7;
//        sales[8] = 16;
//        sales[9] = 6;
//        sales[10] = 11;
//        sales[11] = 18;
        long [] sales = {
                8, 15, 13, 14, 17, 20, 19, 7, 16, 6, 11, 18
        };
        Statisticservice service = new Statisticservice();

        long minmonth = service.minSales(sales);
        System.out.println(minmonth);
        long maxmonth = service.maxSales(sales);
        System.out.println(maxmonth);
        long sum = service.sumSales(sales);
        System.out.println(sum);
        long averageSales = service.summediumSales(sales);
        System.out.println(averageSales);
        long numberOfMonthsBelowAverage = service.numberOfMonthsBelowAverage(sales);
        System.out.println(numberOfMonthsBelowAverage );
        long numberOfMonthsMoreAverage = service.numberOfMonthsMoreAverage(sales);
        System.out.println(numberOfMonthsMoreAverage);
    }
}
