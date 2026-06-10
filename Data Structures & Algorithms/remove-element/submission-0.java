class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> arr=new ArrayList<>();
        for(int x:nums){
            if(x!=val){
                arr.add(x);
            }
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return arr.size();
    }
}