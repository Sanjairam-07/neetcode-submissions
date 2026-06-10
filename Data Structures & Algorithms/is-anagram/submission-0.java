class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] a1=new int[26];
        int[] a2=new int[26];
        for(char x:s.toCharArray()){
            a1[x-'a']++;
        }
        for(char x:t.toCharArray()){
            a2[x-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a1[i]!=a2[i]){
                return false;
            }
        }
        return true;
    }
}
