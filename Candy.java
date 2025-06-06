class Solution {
    public int candy(int[] ratings) {
        int arr[] = new int[ratings.length];
        for(int i=0;i<ratings.length;i++){
            arr[i] = 1;
        }
        int j=0;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[j]){
                arr[i]=arr[j]+1;
            }
            j++;
        }
        int k=ratings.length-1;
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[k]){
               arr[i] = Math.max(arr[i], arr[k] + 1);
            }
            k--;
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}