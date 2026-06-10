class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int l=0,r=0;
        while(l<word1.length() || r<word2.length()){
            if(l<word1.length()){
                sb.append(word1.charAt(l));
                l++;
            }
            if(r<word2.length()){
                sb.append(word2.charAt(r));
                r++;
            }
        }
        return sb.toString();
    }
}