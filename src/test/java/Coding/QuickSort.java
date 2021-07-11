package Coding;


import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arrayList){
        quickSort(arrayList, 0, arrayList.length -1);
    }

    public static void quickSort(int[] arrayList, int left, int right){
        int head = left;
        int end = right;
        int flag = arrayList[left];
        System.out.println("A new round started: flag value=" + flag + " array value: " + Arrays.toString(arrayList));
        while (end > head){
            if (arrayList[head] >= flag){
                System.out.println("head++, head=" + head + " head_value=" + arrayList[head]);
                head++;
            }

            if (arrayList[end] <= flag){
                System.out.println("end--, end=" + end + " end_value=" + arrayList[end]);
                end--;
            }

            if (arrayList[head] < flag && arrayList[end] > flag ){
                System.out.println(String.format("find a element, head=%s, headValue=%s, end=%s, endValue=%s,flag=%s", head, arrayList[head],end,arrayList[end], flag));
                int temp = arrayList[head];
                arrayList[head] = arrayList[end];
                arrayList[end] = temp;
            }
            if (head > end){
                head++;
            }

            if (head > end){
                end++;
            }

            System.out.println("head="+ head + " end=" + end);
            System.out.println("sorted: " + Arrays.toString(arrayList));
        }

        arrayList[left] = arrayList[head];
        arrayList[head] = flag;

        System.out.println("sort ended, head="+ head + " end=" + end + " flag=" + flag);
        quickSort(arrayList, left, end-1);
        quickSort(arrayList, head+1, right);
    }



    static void quicksort1(int n[], int left, int right) {
        int dp;
        if (left < right) {
            dp = partition(n, left, right);
            quicksort1(n, left, dp - 1);
            quicksort1(n, dp + 1, right);
        }
    }

    static int partition(int n[], int left, int right) {
        int pivot = n[left];
        while (left < right) {
            while (left < right && n[right] >= pivot) {
                right--;
            }

            if (left < right) {
                n[left] = n[right];
                left++;
            }

            while (left < right && n[left] <= pivot) {
                left++;
            }

            if (left < right) {
                n[right] = n[left];
                right--;
            }
        }
        n[left] = pivot;
        return left;
    }
}
