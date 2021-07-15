package Algorithms;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right){
            int mid = left + (right - left)/2;
            if (isBadVersion(mid)){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean isBadVersion(int i){
        if (i<10){
            return true;
        }
        return false;
    }
}
