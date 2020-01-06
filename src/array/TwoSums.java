package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSums {

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int[] arr2 = {2, 5, 5, 11};
        int target = 10;


        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(twoSum2(arr2, target)));
    }

    //O(n^2) time complexity
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int firstNum = 0;
        int i;
        for (i = 0; i < nums.length; i++) {
            firstNum = nums[i];
            for (int j = 1; j < nums.length; j++) {
                int secondNum = nums[j];
                if (firstNum + secondNum == target && i != j) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }


    //O(n) time complexity
    public static int[] twoSum2(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numToIndex.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int value = nums[j];
            int comp = target - value;

            if (numToIndex.containsKey(comp)) {
                int comIndex = numToIndex.get(comp);
                if (comIndex != j) {
                    arr[0] = j;
                    arr[1] = comIndex;
                    return arr;
                }
            }
        }
        return null;
    }
}
