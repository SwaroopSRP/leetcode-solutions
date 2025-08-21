class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> sumVec(nums.size());
        sumVec[0] = nums[0];
        for (int i = 1; i < nums.size(); i++) {
            sumVec[i] = sumVec[i - 1] + nums[i];
        }
        return sumVec;
    }
};
