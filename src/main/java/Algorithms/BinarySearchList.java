package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchList {

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
