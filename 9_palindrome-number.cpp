class Solution {
public:
    bool isPalindrome(int x) {
        if (x > 0) {
            double rev;
            for (int y = x; y != 0; y /= 10) {
                rev = (rev * 10) + (y % 10);
            }
            if (x == rev) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (x == 0) {
            return true;
        }
        else {
            return false;
        }
    }
};
