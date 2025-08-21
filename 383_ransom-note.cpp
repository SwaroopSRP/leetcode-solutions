class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            size_t loc = magazine.find(ransomNote[i]);
            if (loc == string:: npos) {
                return false;
            }
            magazine.erase((int)loc, 1);
        }
        return true;
    }
};
