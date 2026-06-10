class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] f1=new int[26];
        int[] f2=new int[26];
        for(int i=0;i<s1.length();i++){
            f1[s1.charAt(i)-'a']++;
            f2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(f1,f2)){
            return true;
        }
        int l=0;
        for(int r=s1.length();r<s2.length();r++){
            f2[s2.charAt(r)-'a']++;
            f2[s2.charAt(l)-'a']--;
            l++;
            if(Arrays.equals(f1,f2)){
                return true;
            }
        }
        return false;
    }
}
