package com.swe472.a1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomPriceCalculatorTest {

    @Test
    public void standardRoomNoDiscount() {
        double standard = RoomPriceCalculator.calculatePrice(3, "STANDARD");
        assertEquals(300.0, standard);
    }

    @Test
    public void suiteRoomNoDiscount() {
        double suite = RoomPriceCalculator.calculatePrice(2, "SUITE");
        assertEquals(500.0, suite);
    }

    @Test
    public void deluxeRoomWithDiscount() {
        double deluxeDiscount = RoomPriceCalculator.calculatePrice(9, "DELUXE");
        assertEquals(1215.0, deluxeDiscount);
    }

    @Test
    public void zeroNightsRejected() {
        double zeroNights = RoomPriceCalculator.calculatePrice(0, "STANDARD");
        assertEquals(-1, zeroNights);
    }

    @Test
    public void unknownRoomTypeRejected() {
        double unknownRoom = RoomPriceCalculator.calculatePrice(3, "PENTHOUSE");
        assertEquals(-2, unknownRoom);
    }

    @Test
    public void sevenNightsReceivesDiscount() {
        double sevenNights = RoomPriceCalculator.calculatePrice(7, "STANDARD");
        assertEquals(630.0, sevenNights);
    }
}
