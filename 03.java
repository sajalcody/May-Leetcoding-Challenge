class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int a[]=new int[26], r=ransomNote.length(), m=magazine.length();
        for(int i=0;i<m;i++)
            a[magazine.charAt(i)- 97]++;
        for(int i=0;i<r;i++){
            char c=ransomNote.charAt(i);
            if (a[c-97] == 0)
                return false;
            a[c-97]--;
        }
        return true;
    }
}