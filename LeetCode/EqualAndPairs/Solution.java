package LeetCode.EqualAndPairs;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int count = countPairs(nums, 1);
        System.out.println("count = " + count);
        return;
    }
    
    public static int countPairs(int[] nums, int k){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    if((i * j) % k == 0) count++;
                }
            }
        }

        return count;
    }
}
