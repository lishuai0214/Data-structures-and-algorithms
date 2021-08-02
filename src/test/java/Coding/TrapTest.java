package Coding;

import org.junit.Test;

import java.util.Arrays;

public class TrapTest {
    public int trap(int[] height) {

        System.out.println(Arrays.toString(height));

        int length = height.length;
        int left = 0;
        int right = 0;
        int blackAir = 0;
        int air = 0;
        for (int i=0; i<height.length; i++){
            if (height[i] > 0){
                left = i;
                right = i;
                break;
            }
        }

        System.out.println(String.format("left=%s, right=%s", left, right));

        while (right < length-1){
            if (height[right] > height[left]){
                System.out.println(String.format("left=%s, right=%s, height[right]=%s",left,right,height[right]));
                air = air + (right - left) * Math.min(height[right], height[left]) - blackAir;
                System.out.println(String.format("black air: %s, air: %s", blackAir, air));
                left = right;
                blackAir = 0;
            }else {
                blackAir = blackAir + height[right];
                right++;
            }
        }

        if (right == length-1 && height[length -1] >= height[0]){
            System.out.println("right00000000000000: " + right);
            air = (length-1) * Math.min(height[right], height[left]) - blackAir;
            return air;
        }

        System.out.println(String.format("air: %s, left: %s, right: %s ", air, left, right));


        int left1 = length -1;
        int right1 = length -1;
        for (int i=length-1; i>right; i--){
            if (height[i] > 0){
                right1 = i;
                left1 = i;
                break;
            }
        }

        System.out.println(String.format("left1=%s, right1=%s", left1, right1));

        int blackAir1 = 0;
        int air1 = 0;

        while (left1 >= left){
            if (height[left1] > height[right1]){
                System.out.println(String.format("left1=%s, right1=%s, height[left1]=%s", left1, right1, height[left1]));
                air1 = air1 + (right1 - left1) * Math.min(height[right1], height[left1]) - blackAir1;
                right1 = left1;
                blackAir1 = 0;
            }else {
                blackAir1 = blackAir1 + height[left1];
                left1--;
            }
        }

        System.out.println("air1: " + air1);

        return air + air1;
    }

    public int trapInt(int[] height, int left, int right) {
        int max = 0;
        int maxIndex = 0;

        System.out.println(String.format("maxIdex: %s, max: %s", maxIndex, max));

        return 0;
    }

    public int trap1111(int[] height) {
        int result = 0;
        int maxHeigth = 0;
        int length = height.length;
        for (int ele: height){
            maxHeigth = Math.max(maxHeigth, ele);
        }

        for (int hei = 1; hei <= maxHeigth; hei++){
            int left = 0, right = length-1;
            while (height[left] < hei || height[right] < hei){
                if (height[left] < hei){
                    left++;
                }

                if (height[right] < hei){
                    right--;
                }
            }

            System.out.println(String.format("hei: %s, left: %s, right: %s", hei, left, right));

            for (int h=left; h<=right; h++){
                if (height[h] < hei){
                    result = result + 1;
                }
            }
        }

        return result;
    }

    @Test
    public void trap(){
        int[] heightArray = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("heightArray: " + Arrays.toString(heightArray));

        int intResult = trap1111(heightArray);
        System.out.println("intResult: " + intResult);
    }
}
