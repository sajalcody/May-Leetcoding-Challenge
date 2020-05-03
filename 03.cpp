// Program Link: https://leetcode.com/problems/ransom-note/

class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        int m[26]={0};
        for (char c: magazine)
            m[c-97]+=1;
        for(char c: ransomNote){
            if(m[c-97] == 0)
                return false;
            m[c-97]--;
        }
        return true;
    }
};