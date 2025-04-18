package LeetCode.CodeAndSay;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String count = countAndSay(10);
        System.out.println("count = " + count);
        return;
    }

    public static String countAndSay(int n){
        if (n == 1 ) return "1";

        int count = 1;
        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < prev.length(); i++) {
            if(prev.charAt(i) == prev.charAt(i-1)) count++;
            else {
                result.append(count).append(prev.charAt(i-1));
                count = 1;
            }
        }
        result.append(count).append(prev.charAt(prev.length()-1));
        return result.toString();
    }
}
