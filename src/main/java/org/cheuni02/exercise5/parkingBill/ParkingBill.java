package org.cheuni02.exercise5.parkingBill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParkingBill {

    int getHoursOrMins(String time, int mode) {
        return Integer.parseInt(time.split(":")[mode]);
    }

    int getHoursLapsed(int[] EArr, int[] LArr){
        int hrDiff = LArr[0] - EArr[0];
        int minDiff = LArr[1] - EArr[1];
        return (minDiff > 0)? hrDiff + 1: hrDiff;
    }

    int calcCost(int hrsLapsed){
        return 1 + ( hrsLapsed * 4 );
    }

    public int solution(String E, String L) {
        int[] EArr = {getHoursOrMins(E,0), getHoursOrMins(E,1)};
        int[] LArr = {getHoursOrMins(L,0), getHoursOrMins(L,1)};
        System.out.println("Number of hours: " + getHoursLapsed(EArr, LArr));
        return calcCost(getHoursLapsed(EArr, LArr));
    }

    public static void main(String[] args) {
        ParkingBill bill = new ParkingBill();
        System.out.println(bill.solution("08:15", "08:45"));
    }
}
