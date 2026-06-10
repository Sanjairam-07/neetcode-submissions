class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int res=0,l=0,m=0;
        for(int j=0;j<s.length();j++){
            hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
            m=Math.max(m,hm.get(s.charAt(j)));
            while((j-l+1)-m>k){
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                l++;
            }
            res=Math.max(res,j-l+1);
        }
        return res;
    }
}
