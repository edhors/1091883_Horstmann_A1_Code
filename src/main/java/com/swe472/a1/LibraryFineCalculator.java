package com.swe472.a1;

public class LibraryFineCalculator {

    public static double calculateFine(int daysLate, String memberType) {
        if (daysLate < 0 || daysLate > 365) {
            return -1;
        }
        if (memberType == null) {
            return -2;
        }
        double dailyRate;
        switch (memberType) {
            case "STUDENT":
                dailyRate = 0.5;
                break;
            case "STAFF":
                dailyRate = 1.0;
                break;
            case "GUEST":
                dailyRate = 2.0;
                break;
            default:
                return -2;
        }
        if (daysLate < 3) {
            return 0.0;
        }
        return daysLate * dailyRate;
    }
}
