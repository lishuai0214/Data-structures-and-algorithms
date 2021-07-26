package Algorithms;

public class RomanAndInt {
    /*
    13. 罗马数字转整数
    罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。

    字符          数值
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

    通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：

    I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
    X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
    C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
    给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。

    示例 1:

    输入: "III"
    输出: 3
    示例 2:

    输入: "IV"
    输出: 4
    示例 3:

    输入: "IX"
    输出: 9
    示例 4:

    输入: "LVIII"
    输出: 58
    解释: L = 50, V= 5, III = 3.
    示例 5:

    输入: "MCMXCIV"
    输出: 1994
    解释: M = 1000, CM = 900, XC = 90, IV = 4.


    提示：

    1 <= s.length <= 15
    s 仅含字符 ('I', 'V', 'X', 'L', 'C', 'D', 'M')
    题目数据保证 s 是一个有效的罗马数字，且表示整数在范围 [1, 3999] 内
    题目所给测试用例皆符合罗马数字书写规则，不会出现跨位等情况。
    IL 和 IM 这样的例子并不符合题目要求，49 应该写作 XLIX，999 应该写作 CMXCIX 。
    关于罗马数字的详尽书写规则，可以参考 罗马数字 - Mathematics 。
     */

    public int romanToInt(String s) {
        int result = 0;
        char[] s_to_char_array = s.toCharArray();
        int length = s_to_char_array.length;
        int count = 0;
        while (count < length) {
            switch (s_to_char_array[count]) {
                case 'I':
                    result = result + 1;
                    break;
                case 'V':
                    if (count - 1 >= 0 && s_to_char_array[count - 1] == 'I'){
                        result = result + 3;
                    }else {
                        result = result + 5;
                    }
                    break;
                case 'X':
                    if (count - 1 >= 0 && s_to_char_array[count - 1] == 'I'){
                        result = result + 8;
                    }else {
                        result = result + 10;
                    }
                    break;
                case 'L':
                    if (count - 1 >= 0 && s_to_char_array[count - 1] == 'X'){
                        result = result + 30;
                    }else {
                        result = result + 50;
                    }
                    break;
                case 'C':
                    if (count - 1 >= 0 && s_to_char_array[count - 1] == 'X'){
                        result = result + 80;
                    }else {
                        result = result + 100;
                    }
                    break;
                case 'D':
                    if (count - 1 >= 0 && s_to_char_array[count - 1] == 'C'){
                        result = result + 300;
                    }else {
                        result = result + 500;
                    }
                    break;
                case 'M':
                    if (count - 1 >= 0 && s_to_char_array[count - 1] == 'C'){
                        result = result + 800;
                    }else {
                        result = result + 1000;
                    }
                    break;
                default:
                    break;
            }
            count++;
        }
        return result;
    }

    public String intToRoman(int num) {
        String result = "";
        int n1000 = num/1000;
        int m1000 = num%1000;
        int n900 = m1000/900;
        int m900 = m1000%900;
        int n500 = m900/500;
        int m500 = m900%500;
        int n400 = m500/400;
        int m400 = m500%400;
        int n100 = m400/100;
        int m100 = m400%100;
        int n90 = m100/90;
        int m90 = m100%90;
        int n50 = m90/50;
        int m50 = m90%50;
        int n40 = m50/40;
        int m40 = m50%40;
        int n10 = m40/10;
        int m10 = m40%10;
        int n9 = m10/9;
        int m9 = m10%9;
        int n5 = m9/5;
        int m5 = m9%5;
        int n4 = m5/4;
        int m4 = m5%4;

        System.out.println("n1000: " + n1000);
        System.out.println("m1000: " + m1000);
        System.out.println("n900: " + n900);
        System.out.println("m900: " + m900);
        System.out.println("n500: " + n500);
        System.out.println("m500: " + m500);
        System.out.println("n400: " + n400);
        System.out.println("m400: " + m400);
        System.out.println("n100: " + n100);
        System.out.println("m100: " + m100);
        System.out.println("n90: " + n90);
        System.out.println("m90: " + m90);
        System.out.println("n50: " + n50);
        System.out.println("m50: " + m50);
        System.out.println("n40: " + n40);
        System.out.println("m40: " + m40);
        System.out.println("n10: " + n10);
        System.out.println("m10: " + m10);
        System.out.println("n9: " + n9);
        System.out.println("m9: " + m9);
        System.out.println("n5: " + n5);
        System.out.println("m5: " + m5);
        System.out.println("n4: " + n4);
        System.out.println("m4: " + m4);

        for (int i=0; i<n1000; i++){
            result = result + "M";
        }

        for (int i=0; i<n900; i++){
            result = result + "CM";
        }

        for (int i=0; i<n500; i++){
            result = result + "D";
        }

        for (int i=0; i<n400; i++){
            result = result + "CD";
        }

        for (int i=0; i<n100; i++){
            result = result + "C";
        }

        for (int i=0; i<n90; i++){
            result = result + "XC";
        }

        for (int i=0; i<n50; i++){
            result = result + "L";
        }

        for (int i=0; i<n40; i++){
            result = result + "XL";
        }

        for (int i=0; i<n10; i++){
            result = result + "X";
        }

        for (int i=0; i<n9; i++){
            result = result + "IX";
        }

        for (int i=0; i<n5; i++){
            result = result + "V";
        }

        for (int i=0; i<n4; i++){
            result = result + "IV";
        }

        for (int i=0; i<m4; i++){
            result = result + "I";
        }

        return result;
    }
}
