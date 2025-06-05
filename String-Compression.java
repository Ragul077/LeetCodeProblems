class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;
        for(int i=0;i<n;i++){
            int c=0;
            char ch = chars[i];
            while(i<n && ch==chars[i] ){
                c++;
                i++;
            }
            if(c==1){
                chars[idx++] = ch;
            }else{
                chars[idx++] = ch;
                for(char digi : Integer.toString(c).toCharArray()){
                    chars[idx++] = digi;
                }
            }
            i--;
        }
        return idx;
    }
}