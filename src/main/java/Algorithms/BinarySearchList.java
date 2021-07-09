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

    public static int binarySearch1(List<Integer> numArray, Integer n) {
        Integer left=0, right = numArray.size()-1;
        while (right >= left){
            Integer mid = left + (right-left)/2;
            if (numArray.get(mid).compareTo(n) == 0){
                return mid;
            }else if (numArray.get(mid).compareTo(n) > 0){
                right = mid - 1;
            }else if (numArray.get(mid).compareTo(n) < 0){
                left = mid + 1;
            }
        }

        return -1;
    }
}
