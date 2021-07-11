package Algorithms;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class QuickSortTest {
    @Test
    public void testQuickSort(){
        List<Integer> listInterger = new LinkedList<>();
        listInterger.add(10);
        listInterger.add(7);
        listInterger.add(1);
        listInterger.add(8);
        listInterger.add(21);
        listInterger.add(25);
        listInterger.add(20);
        listInterger.add(15);
        listInterger.add(13);
        listInterger.add(11);
        listInterger.add(9);
        System.out.println(listInterger);
        QuickSort(listInterger, 0, listInterger.size()-1);

    }

    public void QuickSort(List<Integer> listInterger, Integer left, Integer right){
        Integer lenght = listInterger.size()-1;

        if(right < left || left > lenght || right > lenght){
            System.out.println(String.format("###########list: %s", listInterger));
            return;
        }
        Integer head = left;
        Integer flag = listInterger.get(head);
        Integer start = left;
        Integer end = right;


        Integer count = 0;
        while (end > start && count++ < 50){

            if (listInterger.get(end) > flag){
                end--;
            }

            System.out.println(String.format("1. %s, start: %s, end: %s, flag: %s, left: %s, right: %s",listInterger, start, end, flag, left, right));
            listInterger.set(start, listInterger.get(end));

            if (listInterger.get(start) < flag){
                start++;
            }

            listInterger.set(end, listInterger.get(start));

            System.out.println(String.format("2. %s, start: %s, end: %s, flag: %s, left: %s, right: %s",listInterger, start, end, flag, left, right));
        }

        listInterger.set(start, flag);
        System.out.println(String.format("3. %s, start: %s, end: %s, flag: %s, left: %s, right: %s",listInterger, start, end, flag, left, right));

        System.out.println(String.format("left -> start: %s -> %s", left, start));
        QuickSort(listInterger, left, start-1);

        System.out.println(String.format("end -> right: %s -> %s", end, right));
        QuickSort(listInterger, end+1, right);
    }
}
