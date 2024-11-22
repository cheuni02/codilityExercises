package org.cheuni02.lessons.lesson2.arrays.LoopWrap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LoopWrap {
    public static int postShiftPosition(int arrayLength, int index, int numShifts) {
        if (index >= arrayLength)
            throw new ArrayIndexOutOfBoundsException("Supplied index should not be greater than the size of the array supplied");
        int newIndex = (index - numShifts) % arrayLength;
        if (newIndex < 0) newIndex += arrayLength;
        return newIndex;
    }

    public static int[] shiftRightKTimes(int[] A, int K) {
        int[] resultingArray = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            resultingArray[i] = A[postShiftPosition(A.length, i, K)];
        }
        return resultingArray;
    }

    public int[] solution(int[] A, int K) {
        return shiftRightKTimes(A, K);
    }

    public int[] solutionWithStream(int[] A, int k) {
        int n = A.length;
        k = k % n; // Handle cases where k > n
        return Arrays.stream(A)
                .skip(n - k)
                .boxed()
                .mapToInt(i -> i)
                .toArray();
    }

    public int[] solutionWithColectionRotation(int[] A, int k) {
        List<Integer> aList = new ArrayList<>();
        for (int a: A) aList.add(a);
        Collections.rotate(aList,k);
        return aList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] testArr = {10, 11, 12, 13, 14, 15, 16};
        int K = 12;

        LoopWrap loopWrap = new LoopWrap();
        System.out.println("shifted via custom method: " + Arrays.toString(loopWrap.solution(testArr, K)));
        System.out.println("shifted via Arrays.stream(). method: " + Arrays.toString(loopWrap.solutionWithStream(testArr, K)));
        System.out.println("shifted via Collections.rotate(). method: " + Arrays.toString(loopWrap.solutionWithColectionRotation(testArr, K)));
    }
}
