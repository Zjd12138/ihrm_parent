package com.ihrm.company;

public class DateTest {

    private static int[] DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static void main(String[] args) {
        System.out.println(test(2013, 7, 30));
    }

    private static int test(int year, int month, int day) {

        int result = 0;
        for (int i = 1; i < month; i++) {
            result += DAYS[i - 1];
            if (i >= 2 && runnian(year)) {
                result += 1;
            }
        }
        return result + day;
    }

    private static boolean runnian(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
