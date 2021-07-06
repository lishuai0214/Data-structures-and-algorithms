package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortList {
    public List<Integer> sort( List<Integer> sourceArray) {
        // 对 arr 进行拷贝，不改变参数内容
        List<Integer> arr = new ArrayList<>();
        for (Integer intnum: sourceArray){
            arr.add(intnum);
        }

        for (int i = 1; i < arr.size(); i++) {
            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;

            for (int j = 0; j < arr.size() - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int tmp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, tmp);

                    flag = false;

                    System.out.println(String.format("%s order: %s", i, arr));

                }
            }

            if (flag) {
                break;
            }
        }
        return arr;
    }
}
