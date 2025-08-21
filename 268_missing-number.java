class Solution {
    int naturalSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public int missingNumber(int[] nums) {
        int max = nums.length;
        int expectedSum = naturalSum(max);
        int actualSum = 0;
        for (int i = 0; i < max; i++) {
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
    }
}
