//Program: https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3317/
class Solution {
public:
    int numJewelsInStones(string J, string S) {
        int a[26]={0},A[26]={0},jewelsCount=0;
        for(char c:J){
            if(c>='a' && c<='z')
                a[c-97]=1;
            else
                A[c-65]=1;
        }
        for(char c:S){
            if(c>='a' && c<='z')
                jewelsCount+=a[c-97];
            else
                jewelsCount+=A[c-65];
        }
        return jewelsCount;
        }
};