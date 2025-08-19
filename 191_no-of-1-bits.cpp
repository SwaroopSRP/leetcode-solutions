class Solution {
public:
    int hammingWeight(int n) {
        int ctr = 0;
        for (; n != 0; n >>= 1) {
            ctr += n & 1;
        }

        return ctr;
    }
};
