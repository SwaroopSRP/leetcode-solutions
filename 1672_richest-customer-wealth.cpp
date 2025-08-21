class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        vector<int> wealth(accounts.size(), 0);
        for (int i = 0; i < accounts.size(); i++) {
            for (int bal : accounts[i]) {
                wealth[i] += bal;
            }
        }

        int max = wealth[0];
        for (int i = 1; i < wealth.size(); i++) {
            if (wealth[i] > max) {
                max = wealth[i];
            }
        }

        return max;
    }
};
