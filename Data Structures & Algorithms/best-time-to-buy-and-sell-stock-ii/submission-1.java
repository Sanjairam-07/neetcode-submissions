class Solution {
    // public static int recursion(int[][] dp,int[] prices,int i,int ch){
    //     if(i==prices.length){
    //         return 0;
    //     }
    //     if(dp[i][ch]!=-1){
    //         return dp[i][ch];
    //     }
    //     int res=recursion(dp,prices,i+1,ch);
    //     if(ch==1){
    //         res=Math.max(res,prices[i]+recursion(dp,prices,i+1,0));
    //     }
    //     else{
    //         res=Math.max(res,-prices[i]+recursion(dp,prices,i+1,1));
    //     }
    //     dp[i][ch]=res;
    //     return res;
    // }
    public int maxProfit(int[] prices) {
        int[][] dp=new int[prices.length+1][2];
        for(int i=prices.length-1;i>=0;i--){
            dp[i][0]=Math.max(dp[i+1][0],-prices[i]+dp[i+1][1]);
            dp[i][1]=Math.max(dp[i+1][1],prices[i]+dp[i+1][0]);
        }
        return dp[0][0];
    }
}