class Solution {
    public int reverse(int x) {
        int max=Integer.MAX_VALUE,min=Integer.MIN_VALUE,res=0;
        System.out.println(max+" "+min);
        while(x!=0){
            int t=x%10;
            x/=10;
            if(res>max/10 || (res==max/10 && t>max%10)){
                return 0;
            }
            if(res<min/10 || (res==min/10 && t<min%10)){
                return 0;
            }
            res=res*10+t;
        }
        return res;
    }
}
