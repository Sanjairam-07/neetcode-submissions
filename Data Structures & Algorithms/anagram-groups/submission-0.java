class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            ans.putIfAbsent(s,new ArrayList<>());
            ans.get(s).add(strs[i]);
        }
        return new ArrayList<>(ans.values());
    }
}
