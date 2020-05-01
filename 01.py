# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution:
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        l=1
        r=n
        ans=(l+r)/2
        while l<r:
            if isBadVersion(ans):
                r=ans
            else:
                l=ans+1
            ans=(l+r)/2
        return int(ans)
