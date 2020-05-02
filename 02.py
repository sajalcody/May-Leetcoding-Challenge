class Solution(object):
    def numJewelsInStones(self, J, S):
        """
        :type J: str
        :type S: str
        :rtype: int
        """
        jewelCount=0
        for s in S:
            if s in J:
                jewelCount+=1
        return jewelCount