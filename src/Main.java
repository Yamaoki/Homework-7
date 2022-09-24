import java.util.IllegalFormatCodePointException;

public class Main {
    public static void main(String[] args) {

        //Задача 1

        int perMonth = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i++;
            total = total + total/100;
            total = total + perMonth;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей.");
        }

        //Задача 2

        int n = 0;
        while (n < 10) {
            n++;
            System.out.print(n + " ");
        }
        System.out.println();

        for (int o = 10; o >= 1; o--) {
            System.out.print(o + " ");
        }
        System.out.println();

        //Задача 3

        int totalPopulation = 12_000_000;
        int birthRate = totalPopulation / 1000 * 17;
        int mortality = totalPopulation / 1000 * 8;
        for (int year = 1; year <= 10; year++) {
            totalPopulation = totalPopulation + birthRate - mortality;
            System.out.println("Год " + year + " численность населения составляет " + totalPopulation);
        }

        //Задача 4

        int initialAmount = 15000;
        int month = 0;
        while (initialAmount <= 12_000_000) {
            initialAmount = initialAmount + initialAmount / 100 * 7;
            month++;
            System.out.println("Месяц " + month + " промежуточная сумма " + initialAmount);
        }

        //Задача 5

        int initialAmount1 = 15000;
        int month1 = 0;
        while (initialAmount1 <= 12_000_000) {
            initialAmount1 = initialAmount1 + initialAmount1 / 100 * 7;
            month1++;
            if (month1 % 6 == 0)
                System.out.println("Месяц " + month1 + " промежуточная сумма " + initialAmount1);
        }

        //Задача 6

        int total1 = 15000;
        for (int time = 1; time <= 9 * 12; time++) {
            total1 = total1 + total1 / 100 * 7;
            if (time % 6 == 0)
                System.out.println("Месяц " + time + " промежуточная сумма " + total1);
        }

        //Задача 7

        for (int friday = 1; friday <= 31; friday++) {
            if (friday % 7 == 0)
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        //Задача 8

        for (int a = 0; a < 2022 + 100; a = a + 79) {
            if (a > 2022 - 200)
                System.out.println(a);
        }

        //Задача 9

        for (int h = 1; h <= 10; h++) {
            System.out.println("2*" + h + "=" + h * 2);
        }
    }
}