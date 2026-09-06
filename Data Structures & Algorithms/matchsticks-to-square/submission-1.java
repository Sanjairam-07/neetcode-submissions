class Solution {
    public static boolean helper(int[] s,int[] m,int idx,int side){
        if(idx==m.length){
            return true;
        }
        for(int i=0;i<4;i++){
            if(s[i]+m[idx]>side){
                continue;
            }
            s[i]+=m[idx];
            if(helper(s,m,idx+1,side)){
                return true;
            }
            s[i]-=m[idx];
        }
        return false;
    }
    public boolean makesquare(int[] m) {
        int total=0,max=Integer.MIN_VALUE;
        for(int i=0;i<m.length;i++){
            max=Math.max(max,m[i]);
            total+=m[i];
        }
        if(total%4!=0) return false;
        int side=total/4;
        if(max>side) return false;
        int[] s=new int[4];
        return helper(s,m,0,side);
    }
}