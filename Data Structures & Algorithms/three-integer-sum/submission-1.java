class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1,k=n-1;
            while(j<k){
                int t=nums[i]+nums[j]+nums[k];
                if(t>0){
                    k--;
                }
                else if(t<0){
                    j++;;
                }
                else{
                    //l.add(nums[i]).add(nums[j]).add(nums[k]);
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    l.clear();
                    j++;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
