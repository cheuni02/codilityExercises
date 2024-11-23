package org.cheuni02.lessons.lesson2.arrays.LoopWrap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToListDemoes {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14};

        System.out.println("arr: " + Arrays.toString(arr));

        List<Integer> arrList = Arrays.stream(arr).boxed().toList();

        System.out.println("arrList: " + arrList);

        int[] arrListToArr = arrList.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("arrListToArr: " + Arrays.toString(arrListToArr));

        List<Integer> arrListUnsorted = Arrays.asList(4,2,6,4,1,7,10,14,12,9);
        arrListUnsorted.stream().sorted().forEach(System.out::println);

        List<Integer> arrListSorted = arrListUnsorted.stream().sorted().toList();

        System.out.println("arrListSorted: " + arrListSorted);

        List<Integer> arrListSortedDesc = arrListUnsorted.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println("arrListSortedDesc: " + arrListSortedDesc);

    }
}
