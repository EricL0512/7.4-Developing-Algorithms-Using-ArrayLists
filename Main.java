import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 4, 5));
        Algorithms a = new Algorithms();
        System.out.println("Remove Duplicates");
        System.out.println(a.removeDuplicates(new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3))));
        System.out.println(a.removeDuplicates(new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1))));
        System.out.println(a.removeDuplicates(new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11))));
        System.out.println("Remove Instances");
        System.out.println(a.removeInstance(new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11)), 1));
        System.out.println(a.removeInstance(new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 11)), 1));
        System.out.println(a.removeInstance(new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3)), 2));
        System.out.println("Add and Sort");
        System.out.println(a.addAndSort(new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3)), 4));
        System.out.println(a.addAndSort(new ArrayList<>(Arrays.asList(1, 10, 100, 1000, 10000)), 50));
        System.out.println(a.addAndSort(new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6)), 1));
        System.out.println("In Reversed Order");
        System.out.println(a.inReverseOrder(new ArrayList<>(Arrays.asList(1, 2, 3)), new ArrayList<>(Arrays.asList(3, 2, 1))));
        System.out.println(a.inReverseOrder(new ArrayList<>(Arrays.asList(1, 2, 3)), new ArrayList<>(Arrays.asList(4, 3, 2, 1))));
        System.out.println(a.inReverseOrder(new ArrayList<>(Arrays.asList(1, 2, 3)), new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println("Largest Value");
        System.out.println(a.maximumValue(new ArrayList<>(Arrays.asList(3, 2, 1))));
        System.out.println(a.maximumValue(new ArrayList<>(Arrays.asList(1, 2, 7, 3))));
        System.out.println(a.maximumValue(new ArrayList<>(Arrays.asList(10, 5, 0))));
        System.out.println("Smallest Value");
        System.out.println(a.minimumValue(new ArrayList<>(Arrays.asList(3, 2, 1))));
        System.out.println(a.minimumValue(new ArrayList<>(Arrays.asList(1, 2, 7, 3))));
        System.out.println(a.minimumValue(new ArrayList<>(Arrays.asList(10, 5, 0))));
        System.out.println("Shortest String");
        System.out.println(a.shortestString(new ArrayList<>(Arrays.asList("Hello,", "world", "!"))));
        System.out.println(a.shortestString(new ArrayList<>(Arrays.asList("a", "ab", "abc"))));
        System.out.println(a.shortestString(new ArrayList<>(Arrays.asList("Goodbye", "Ciao", "Chao"))));
        System.out.println("Longest String");
        System.out.println(a.longestString(new ArrayList<>(Arrays.asList("Hello,", "world", "!"))));
        System.out.println(a.longestString(new ArrayList<>(Arrays.asList("a", "ab", "abc"))));
        System.out.println(a.longestString(new ArrayList<>(Arrays.asList("Goodbye", "Ciao", "Chao"))));
        System.out.println("Largest Difference");
        System.out.println(a.largestDifference(new ArrayList<>(Arrays.asList(2, 3, 4)), new ArrayList<>(Arrays.asList(-1, -2, -3))));
        System.out.println(a.largestDifference(new ArrayList<>(Arrays.asList(1, 2, 3)), new ArrayList<>(Arrays.asList(3, 2, 1))));
        System.out.println(a.largestDifference(new ArrayList<>(Arrays.asList(-100, -10, -1)), new ArrayList<>(Arrays.asList(1, 10, 100))));
        System.out.println("Mean Average");
        System.out.println(a.meanAverage(new ArrayList<>(Arrays.asList(1.5, 3.5, 5.5))));
        System.out.println(a.meanAverage(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0))));
        System.out.println(a.meanAverage(new ArrayList<>(Arrays.asList(5.0, 5.0, 5.0))));
    }
}
