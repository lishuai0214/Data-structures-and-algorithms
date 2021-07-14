package Utils;

import java.util.Queue;

public class QueueOperation {
    public static void QueuePrint(Queue<String> queue){
        String result = "";
        for (String str: queue){
            result =  str + " => " + result;
        }
        result = result.substring(0, result.length() - 4);
        System.out.println(result);
    }
}
