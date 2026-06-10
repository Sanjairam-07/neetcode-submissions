class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int res=0,curr=0;
        for(int x:nums){
            curr+=x;
            int diff=curr-k;
            res+=hm.getOrDefault(diff,0);
            hm.put(curr,hm.getOrDefault(curr,0)+1);
        }
        return res;
    }
}