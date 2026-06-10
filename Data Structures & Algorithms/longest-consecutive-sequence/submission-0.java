class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        Set<Integer> hs=new HashSet<>();
        for(int x:nums){
            hs.add(x);
        }
        for(int x:nums){
            int cnt=0,curr=x;
            while(hs.contains(curr)){
                cnt++;
                curr++;
            }
            res=Math.max(res,cnt);
        }
        return res;
    }
}
