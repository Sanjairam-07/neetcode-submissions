class Solution {
    public static void merge(int[] nums,int l,int m,int r){
        List<Integer> arr=new ArrayList<>();
        int i=l,j=m+1;
        while(i<=m && j<=r){
            if(nums[i]<=nums[j]){
                arr.add(nums[i]);
                i++;
            }
            else{
                arr.add(nums[j]);
                j++;
            }
        }
        while(i<=m){
            arr.add(nums[i]);
            i++;
        }
        while(j<=r){
            arr.add(nums[j]);
            j++;
        }
        for(i=l;i<=r;i++){
            nums[i]=arr.get(i-l);
        }
    }
    public static void mergeSort(int[] nums,int l,int r){
        if(l>=r) return;
        int m=(l+r)/2;
        mergeSort(nums,l,m);
        mergeSort(nums,m+1,r);
        merge(nums,l,m,r);
    }
    public void sortColors(int[] nums) {
        mergeSort(nums,0,nums.length-1);
    }
}