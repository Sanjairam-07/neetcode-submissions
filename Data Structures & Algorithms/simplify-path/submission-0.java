class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] arr=path.split("/");
        for(String s:arr){
            if(s.length()==0) continue;
            else if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(s.equals(".")) continue;
            else st.push(s);
        }
        if(st.isEmpty()) return "/";
        StringBuilder sb=new StringBuilder();
        List<String> l=new ArrayList<>();
        while(!st.isEmpty()){
            l.add(st.pop());
        }
        for(int i=l.size()-1;i>=0;i--){
            sb.append("/").append(l.get(i));
        }
        return sb.toString();
    }
}