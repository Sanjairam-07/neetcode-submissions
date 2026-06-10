class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2) return s.length();
        Map<Character,Integer> hm=new HashMap<>();
        int ans=0,j=0,idx=0;
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                ans=Math.max(ans,hm.size());
                idx=hm.get(s.charAt(i))+1;
                while(j<idx){
                    hm.remove(s.charAt(j));
                    j++;
                }
            }
            hm.put(s.charAt(i),i);
        }
        return Math.max(ans,hm.size());
    }
}
