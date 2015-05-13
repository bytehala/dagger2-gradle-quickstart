package com.example;

public class SomeThirdPartyClass {

    public int[] sort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int next = input[i];
            // find the insertion location while moving all larger element up
            int j = i;
            while (j > 0 && input[j - 1] > next) {
                input[j] = input[j - 1];
                j--;
            }
            // insert the element
            input[j] = next;
        }
        return input;
    }

}
