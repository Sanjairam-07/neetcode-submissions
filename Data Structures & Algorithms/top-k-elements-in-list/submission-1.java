class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        int[] ans=new int[k];
        PriorityQueue<Integer> p=new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        p.addAll(hm.keySet());
        for(int i=0;i<k;i++){
            ans[i]=p.poll();
        }
        return ans;
    }
}
