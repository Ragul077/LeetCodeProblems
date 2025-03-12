class Solution {
    public int nthUglyNumber(int n) {
        int ugly[] = new int[n];
        ugly[0]=1;
        int index2=0,index3=0,index5=0;
        for(int i=1;i<n;i++){
            int multi2 = ugly[index2] * 2;
            int multi3 = ugly[index3] * 3;
            int multi5 = ugly[index5] * 5;

            ugly[i]=Math.min(multi2,Math.min(multi3,multi5));
            if(ugly[i]==multi2){
                index2++;
            }
            if(ugly[i]==multi3){
                index3++;
            }
            if(ugly[i]==multi5){
                index5++;
            }
        }
        return ugly[n-1];
    }
}