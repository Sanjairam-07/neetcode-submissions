class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> sg=new Stack<>();
        for( int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
                int a=sg.pop();
                int b=sg.pop();
                sg.push(b);
                sg.push(a);
                sg.push(a+b);
            }
            else if(operations[i].equals("D")){
                int d=sg.pop();
                sg.push(d);
                sg.push(2*d);
            }
            else if(operations[i].equals("C")){
                sg.pop();
            }
            else{
                sg.push(Integer.parseInt(operations[i]));
            }
        }
        int ans=0;
        while(!sg.isEmpty()){
            ans+=sg.pop();
        }
        return ans;
    }
}