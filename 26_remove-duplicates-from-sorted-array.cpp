class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if (nums.size() == 0) return 0;

        int ctr = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.at(i) != nums.at(i - 1)) {
                nums.at(ctr) = nums.at(i);
                ctr++;
            }
        }

        return ctr;
    }
};
