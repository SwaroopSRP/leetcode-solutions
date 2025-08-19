class Solution {
    public int romanToInt(String s) {
        int n = s.length(), sum = 0, wt;

        for (int i = 0; i < n; i++) {
            wt = getWt(s.charAt(i));
            if (i == n - 1 || wt >= getWt(s.charAt(i + 1))) sum += wt;
            else sum -= wt;
        }

        return sum;

    }

    private int getWt(char c) {
        switch (c) {
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;
            
            case 'L':
                return 50;
            
            case 'C':
                return 100;
            
            case 'D':
                return 500;
            
            case 'M':
                return 1000;
            
            default:
                return -1;
        }
    }
}
