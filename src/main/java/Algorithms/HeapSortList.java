package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class HeapSortList {
    
    public List<Integer> sort(List<Integer> sourceArray) {
        // 对 arr 进行拷贝，不改变参数内容
        List<Integer> arr = new ArrayList<>();
        for (Integer intnum: sourceArray){
            arr.add(intnum);
        }

        int len = arr.size();

        buildMaxHeap(arr, len);

        for (int i = len - 1; i > 0; i--) {
            swap(arr, 0, i);
            len--;
            heapify(arr, 0, len);
        }
        return arr;
    }

    private void buildMaxHeap(List<Integer> arr, int len) {
        for (int i = (int) Math.floor(len / 2); i >= 0; i--) {
            heapify(arr, i, len);
        }
    }

    private void heapify(List<Integer> arr, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < len && arr.get(left) > arr.get(largest)) {
            largest = left;
        }

        if (right < len && arr.get(right) > arr.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, len);
        }
    }

    private void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}