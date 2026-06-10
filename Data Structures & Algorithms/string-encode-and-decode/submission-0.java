class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i).length()).append('#').append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans=new ArrayList<>();
        int i=0,n=str.length();
        while(i<n){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int l=Integer.parseInt(str.substring(i,j));
            String w=str.substring(j+1,j+1+l);
            ans.add(w);
            i=j+1+l;
        }
        return ans;
    }
}
