package com.swe472.a1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LibraryFineCalculatorTest {

    @Test
    public void baseChoice() {
        double base = LibraryFineCalculator.calculateFine(10, "STUDENT");
        assertEquals(5.0, base);
    }

    @Test
    public void negativeDays() {
        double negativeDays = LibraryFineCalculator.calculateFine(-1, "STUDENT");
        assertEquals(-1, negativeDays);
    }

    @Test
    public void gracePeriod() {
        double grace = LibraryFineCalculator.calculateFine(2, "STUDENT");
        assertEquals(0.0, grace);
    }

    @Test
    public void tooManyDays() {
        double tooManyDays = LibraryFineCalculator.calculateFine(400, "STUDENT");
        assertEquals(-1, tooManyDays);
    }

    @Test
    public void staffMember() {
        double staff = LibraryFineCalculator.calculateFine(10, "STAFF");
        assertEquals(10.0, staff);
    }

    @Test
    public void guestMember() {
        double guest = LibraryFineCalculator.calculateFine(10, "GUEST");
        assertEquals(20.0, guest);
    }

    @Test
    public void unknownMember() {
        double unknownMember = LibraryFineCalculator.calculateFine(10, "VISITOR");
        assertEquals(-2, unknownMember);
    }
}
