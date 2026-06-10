class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        ans.add(new ArrayList<>(l));
                        l.clear();
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
