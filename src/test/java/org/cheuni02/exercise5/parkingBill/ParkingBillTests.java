package org.cheuni02.exercise5.parkingBill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParkingBillTests {

    private static Stream<Arguments> parkingBillHappyPathTestData() {
        return Stream.of(
                Arguments.of("09:42", "11:42", 9),
                Arguments.of("10:00", "13:21", 17),
                Arguments.of("08:15", "08:45", 5)
        );
    }

    @ParameterizedTest
    @MethodSource("parkingBillHappyPathTestData")
    public void parkingBillHappyPathTests(String E, String L, int expected) {
        ParkingBill parkingBill = new ParkingBill();
        Assertions.assertEquals(expected, parkingBill.solution(E, L));
    }
}
