package org.cheuni02.ex9BitwiseOperations.binaryGap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public Integer maxNumOfZeroes(Integer input) throws Exception {
        String regex = "^[0-9]$";

        System.out.println(String.valueOf(input).matches(regex));
        if(!String.valueOf(input).matches(regex)) {
            System.out.println("no way");
            throw new Exception("this input is wrong...");
        }
        int countZeroes = 0;
        List<Integer> countZeroesRecord = new ArrayList<>();
        char[] inputChars = Integer.toBinaryString(input).toCharArray();
        for(int i=0; i<inputChars.length; i++){
            if(inputChars[i] == '1') {
                countZeroesRecord.add(countZeroes);
                countZeroes = 0;
            }
            if(inputChars[i] == '0') countZeroes++;
        }
        return countZeroesRecord.stream().max(Integer::compare).get();
    }
}
