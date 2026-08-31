class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Character,Integer> hm=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            hm.put(s.charAt(i),i);
        }
        int start=0,dest=0;
        while(start<n){
            dest=hm.get(s.charAt(start));
            for(int j=start;j<=dest;j++){
                dest=Math.max(dest,hm.get(s.charAt(j)));
            }
            ans.add(dest-start+1);
            start=dest+1;
        }
        return ans;
    }
}
