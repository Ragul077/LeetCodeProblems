class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if((mid==0 || arr[mid-1]<arr[mid]) && (mid==arr.length-1 || arr[mid+1]<arr[mid])){
                return mid;
            }else if(mid>0 && arr[mid-1]>arr[mid]){
                e = mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}