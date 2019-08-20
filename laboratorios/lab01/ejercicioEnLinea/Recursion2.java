package rectangulos;

public class Recursion2 {

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        } else {
            return groupSum6(start + 1, nums, target) || groupSum6(start + 1, nums, target - nums[start]);
        }
    }

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (nums[start] % 5 == 0) {
            if (start <= nums.length - 2 && nums[start + 1] == 1) {
                return groupSum5(start + 2, nums, target - nums[start]);
            }
            return groupSum5(start + 1, nums, target - nums[start]);
        } else {
            return groupSum5(start + 1, nums, target) || groupSum5(start + 1, nums, target - nums[start]);
        }
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        } else {
            return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
        }

    }

    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        int suma = nums[start];
        int cont = 1;
        for (int i = start + 1; i < nums.length; i++) {
            if (nums[start] == nums[i]) {
                suma = suma + nums[i];
                cont++;
            }
        }
        return groupSumClump(start + cont, nums, target - suma) || groupSumClump(start + cont, nums, target);
    }


    /* Title: splitOdd10.java
       Author: mirandaio
       Date: 27 Nov 2013
       Code version: 1.0
       Availability: https://github.com/mirandaio/codingbat/blob/master/java/recursion-2/splitOdd10.java
     */
    public boolean splitOdd10(int[] nums) {
        return splitOdd10Helper(0, nums, 0, 0);
    }

    public boolean splitOdd10Helper(int start, int[] nums, int mult, int odd) {
        if (start >= nums.length) {
            return mult % 10 == 0 && odd % 2 == 1;
        }

        if (splitOdd10Helper(start + 1, nums, mult + nums[start], odd)) {
            return true;
        }

        if (splitOdd10Helper(start + 1, nums, mult, odd + nums[start])) {
            return true;
        }

        return false;
    }

}
