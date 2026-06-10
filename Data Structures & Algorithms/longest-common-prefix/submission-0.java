class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        int min=Integer.MAX_VALUE;
        for(String x:strs){
            min=Math.min(x.length(),min);
        }
        boolean temp=true;
        for(int j=0;j<min;j++){
            char c=strs[0].charAt(j);
            for(int i=0;i<strs.length;i++){
                if(c!=strs[i].charAt(j)){
                    temp=false;
                    break;
                }
            }
            if(temp== true){
                sb.append(c);
            }
            if(!temp){
                break;
            }
        }
        return sb.toString();
    }
}