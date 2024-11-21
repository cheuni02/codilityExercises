package org.cheuni02.ex9BitwiseOperations.binaryGap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryGapTests {
    Solution solution = new Solution();

    @Test
    public void testBinaryGap() throws Exception {
        Integer[] inputNums = {9, 99, 32, 20, 529};
        Integer[] expectedMaxZeroes = {2, 3, 0, 1, 4};
        for(int i = 0; i < inputNums.length; i++) {
            assertEquals(solution.maxNumOfZeroes(inputNums[i]), expectedMaxZeroes[i]);
        }
    }
}
