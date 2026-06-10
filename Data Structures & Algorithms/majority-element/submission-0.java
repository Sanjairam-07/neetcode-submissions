class Solution {
    public int majorityElement(int[] nums) {
        int mid=nums.length;
        Arrays.sort(nums);
        return nums[mid/2];
    }
}