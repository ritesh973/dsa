package com.rits.leetcode.leetcode400_500;

/**
 * @author rits
 * @created on 05/01/2024
 * @project dsa
 */
public class LTC457 {
    public static boolean circularArrayLoop(int[] nums) {
        int size = nums.length;
        if (size <= 1) return false;

        for (int i = 0; i < size; i++) {
            int slow,fast;
            slow = fast =i;
            boolean ifForward = nums[i] > 0;
            while (true){
                slow = getNextPosition(nums,slow,ifForward);
                if (slow == -1){
                    break;
                }
                fast = getNextPosition(nums,fast,ifForward);
                if (fast == -1){
                    break;
                }
                fast = getNextPosition(nums,fast,ifForward);
                if (fast == -1){
                    break;
                }
                if (slow == fast){
                    return true;
                }
            }
        }
        return false;
    }
    public static int getNextPosition(int[] nums,int index,boolean ifForward){
        boolean direction = nums[index] >= 0;

        if (direction != ifForward){
            return -1;
        }
        int nextIndex = (index + nums[index]) % nums.length;
        if (nextIndex < 0){
            nextIndex = nextIndex + nums.length;
        }
        if (nextIndex == index){
            return -1;
        }
        return nextIndex;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, -2, -4, 1};
        System.out.println(circularArrayLoop(nums));
    }
}
