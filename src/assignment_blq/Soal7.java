package assignment_blq;

import java.io.*;
import java.util.*;

public class Soal7 {

    public static double getMean(int[] arr) {    
        double mean = 0;
        for (int i = 0; i < arr.length; i++)
            mean += arr[i];
        mean /= arr.length;

        return mean;
    }

    public static double getMedian(int[] arr) {
        int[] arrCopy = arr.clone();
        Arrays.sort(arrCopy);
        double median = 0;
        int n = arrCopy.length;

        if (n % 2 == 1) {
            median = arrCopy[n / 2];
        } else {
            median = (arrCopy[n / 2] + arrCopy[n / 2 - 1]) / 2.0;
        }

        return median;
    }

    public static double getMode(int[] arr) {    
        int[] arrCopy = arr.clone();
        Arrays.sort(arrCopy);
        
        Map<Integer, Integer> freq = new TreeMap<>();
        for (int i : arrCopy) {
            if (!freq.containsKey(i))
                freq.put(i, 1);
            else
                freq.put(i, freq.get(i) + 1);
        }

        double mode = arrCopy[0];
        int maxFreq = 1;

        for (Map.Entry<Integer, Integer> me : freq.entrySet()) {
            if (me.getValue() > maxFreq) {
                maxFreq = me.getValue();
                mode = me.getKey();
            }
        }

        return mode;
    }
    
    public static void main(String[] args) {

        
        int[] arr1= {8, 7, 0, 2, 7, 1, 7, 6, 3, 0, 7, 1, 3, 4, 6, 1, 6, 4, 3};
        
        System.out.println("Input Array: "+ Arrays.toString(arr1));

        double mean = getMean(arr1);
        double median = getMedian(arr1);
        double mode = getMode(arr1);

        System.out.printf("Mean: %.2f\n", mean);
        System.out.printf("Median: %.2f\n", median);
        System.out.printf("Mode: %.2f\n", mode);

    }

}
