import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

public class Algorithms {
    public ArrayList<Integer> removeDuplicates(ArrayList<Integer> integers) {
        Set<Integer> set = new HashSet<>(integers);
        ArrayList<Integer> integers1 = new ArrayList<>(set);
        return integers1;
    }
    public ArrayList<Integer> removeInstance(ArrayList<Integer> integers, int num) {
        integers.removeIf(n -> n == num);
        return integers;
    }
    public ArrayList<Integer> addAndSort(ArrayList<Integer> integers, int num) {
        Collections.sort(integers);
        for (int i = 0; i < integers.size(); i++) { // you could just add num into the list and then call Collections.sort(integers)
            if (integers.get(i) > num) {
                integers.add(i, num);
                break;
            }
        }
        return integers;
    }
    public boolean inReverseOrder(ArrayList<Integer> integers, ArrayList<Integer> reversed) {
        if (integers.size() != reversed.size()) return false;
       for (int i = 0; i < integers.size(); i++) {
           if (integers.get(i) != reversed.get(reversed.size() - 1 - i)) {
               return false;
           }
       }
       return true;
    }
    public int maximumValue(ArrayList<Integer> integers) {
        if (integers.isEmpty()) return -1;
        int max = integers.get(0);
        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i) > max) {
                max = integers.get(i);
            }
        }
        return max;
    }
    public int minimumValue(ArrayList<Integer> integers) {
        if (integers.isEmpty()) return -1;
        int min = integers.get(0);
        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i) < min) {
                min = integers.get(i);
            }
        }
        return min;
    }
    public String shortestString(ArrayList<String> strings) {
        String shortestString = strings.get(0);
        for(String str: strings) {
            if (shortestString.length() > str.length()) shortestString = str;
        }
        return shortestString;
    }
    public String longestString(ArrayList<String> strings) {
        String longestString = strings.get(0);
        for(String str: strings) {
            if (longestString.length() < str.length()) longestString = str;
        }
        return longestString;
    }
    public int largestDifference(ArrayList<Integer> integers, ArrayList<Integer> integers1) {
        int difference = maximumValue(integers) - minimumValue(integers1);
        int difference1 = maximumValue(integers1) - minimumValue(integers);
        if (difference > difference1) return difference;
        return difference1;
    }
    public double meanAverage(ArrayList<Double> doubles) {
        double mean = 0;
        for (double d: doubles) {
            mean += d;
        }
        return mean/doubles.size();
    }
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> integers) {

    }
}
