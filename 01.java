/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            long l=1, r=n, ans=(l+r)/2;
            while(l<r){
                if(isBadVersion((int)ans))
                    r=ans;
                else 
                    l=ans+1;
                ans=(l+r)/2;
            }
            return (int)ans;
        }
    }