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
}
