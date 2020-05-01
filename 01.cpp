//Program: https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3316/

// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        long long int l=1, r=n, ans=(l+r)/2;
        while(l<r){
            if(isBadVersion(ans))
                r=ans;
            else
                l=ans+1;
            ans=(l+r)/2;
        }
        return l;
    }
};