class Solution {
public:
    int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int N = n, mask = 0;
        for (; n != 0; n >>= 1) {
            mask <<= 1;
            mask |= 1;
        }
        return N ^ mask;
    }
};