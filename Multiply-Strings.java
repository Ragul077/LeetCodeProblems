class Solution {
    public String multiply(String num1, String num2) {
        int a1 = num1.length();
        int a2 = num2.length();

        int res[]=new int[a1+a2];

        for(int i = a1-1;i>=0;i--){
            for(int j = a2-1;j>=0;j--){
                int sum = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                int mul = sum + res[i+j+1];
                res[i+j+1] = mul%10;
                res[i+j] += mul/10;
            }
        } 

        StringBuilder sb = new StringBuilder();
        for(int n : res){
            if(!(sb.length()==0 && n==0)){
                sb.append(n);
            }
        }

        return sb.length()==0 ? \0\ : sb.toString();
    }
}