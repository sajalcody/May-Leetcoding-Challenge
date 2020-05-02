class Solution {
    public int numJewelsInStones(String J, String S) {
        int a[]=new int[26], A[]=new int[26],jewelsCount=0;
        int j=J.length(), s=S.length();
        for(int i=0;i<j;i++){
            char c=J.charAt(i);
            if(c>='a' && c<='z')
                a[c-97]=1;
            else
                A[c-65]=1;
        }
        for(int i=0;i<s;i++){
            char c=S.charAt(i);
            if(c>='a' && c<='z')
                jewelsCount+=a[c-97];
            else
                jewelsCount+=A[c-65];
        }
        return jewelsCount;
    }
}