class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        int num[]=new int[10];

        for(int i=0;i<secret.length();i++){
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));

            if(s==g) bull++;
            else{
                if(num[s]<0) cow++;
                if(num[g]>0) cow++;

                num[s]++;
                num[g]--;
            }
        }
        return bull+\A\+cow+\B\;
    }
}