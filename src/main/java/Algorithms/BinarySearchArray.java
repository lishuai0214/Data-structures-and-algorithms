package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchArray {

    public static void main( String[] args )
    {
        List<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(7);
        c.add(9);
        int result = BinarySearchArray.binarySearch(c, 4);
        System.out.println(result);
    }

    public static int binSearch(int srcArray[], int key) {
        int mid = srcArray.length / 2;
        if (key == srcArray[mid]) {
            return mid;
        }

        int start = 0;
        int end = srcArray.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (key < srcArray[mid]) {
                end = mid - 1;
            } else if (key > srcArray[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearch(List<Integer> numArray, Integer n){
        int mid = numArray.size()/2;
        if (n == numArray.get(mid)) {
            return mid;
        }

        int left = 0;
        int right = numArray.size() - 1;
        while (left <= right) {
            mid = (right - left) / 2 + left;
            if (n < numArray.get(mid)) {
                right = mid - 1;
            } else if (n > numArray.get(mid)) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
