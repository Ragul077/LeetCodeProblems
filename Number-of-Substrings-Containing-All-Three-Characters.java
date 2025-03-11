class Solution {
    public int numberOfSubstrings(String s) {
        int l1=-1,l2=-1,l3=-1;
        // int min=Integer.MAX_VALUE;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') l1=i;
            else if(s.charAt(i)=='b') l2=i;
            else l3=i;
            if(l1==-1 || l2==-1 || l3==-1) continue;
            int min = Math.min(l1,Math.min(l2,l3));
            c+=min+1;
        }
        return c;
    }
}