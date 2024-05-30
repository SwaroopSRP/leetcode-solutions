class Solution {
public:
    bool isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        for (; n != 1; n >>= 1) {
            if (n & 0 != 1) {
                return false;
            }
        }
        return true;
    }
};


/*
// CodeHelp Solution:

#include<limits.h>

class Solution {
public:
    bool isPowerOfTwo(int n) {
        
        int ans = 1;
        
        for(int i = 0; i <= 30; i++) {
            
            //cout<<" ans "<<ans <<endl;
            if(ans == n)
            {
                return true;
            }
            if(ans < INT_MAX/2)
            ans = ans * 2;   
            
        }
        return false;
    }
};
*/

/*
// Explation of the efficiency from ChatGPT
https://chatgpt.com/share/a3481a36-6a40-48f4-98cf-39e92f34f545
*/
