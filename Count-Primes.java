class Solution {
    public int countPrimes(int n) {
        int c=0;
        boolean primes[]=  new boolean[n+1];
        for(int i=0;i<n;i++)
        primes[i]=true;
        for(int p=2;p*p<=n;p++){
            if(primes[p]==true){
                for(int i=p*p;i<=n;i+=p){
                    primes[i]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(primes[i]==true){
                c++;
            }
        }
        return c;
    }
}