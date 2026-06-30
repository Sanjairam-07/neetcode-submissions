class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int l=a.length()-1,r=b.length()-1,carry=0,sum=0;
        while(l>=0 || r>=0 || carry!=0){
            sum=carry;
            if(l>=0) sum+=a.charAt(l--)-'0';
            if(r>=0) sum+=b.charAt(r--)-'0';
            carry=sum/2;
            sb.append(sum%2);
        }
        return sb.reverse().toString();
    }
}