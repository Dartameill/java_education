package com.company.lesson4.ArraysTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaskArrays {


    private int[] ArraysSearch (int [] array) {
        Arrays.sort(array);
        return array;
    }


    private Integer MaxElement(int [] array) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++) {
            list.add(array[i]);
        } return Collections.max(list);
    }

    private String [] ElementValue(String [] arrays) {
       System.out.println(new String(String.valueOf(arrays)));
       return arrays;
    }
}
