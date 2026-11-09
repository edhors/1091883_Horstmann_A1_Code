package com.swe472.a1;

public class RoomPriceCalculator {


    public static double calculatePrice(int nights, String roomType) {
        if (nights <= 0 || nights > 30) {
            return -1;
        }
        if (roomType == null) {
            return -2;
        }
        double rate;
        switch (roomType) {
            case "STANDARD":
                rate = 100.0;
                break;
            case "DELUXE":
                rate = 150.0;
                break;
            case "SUITE":
                rate = 250.0;
                break;
            default:
                return -2;
        }
        double total = nights * rate;
        if (nights >= 7) {
            total = total * 0.9;
        }
        return total;
    }
}
