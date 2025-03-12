class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        result[0] = FindFirst(nums,target);
        result[1] = FindLast(nums,target);
        return result;
    }

    public int FindFirst(int[] n,int t){
        int idx=-1;
        int s=0;
        int e=n.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(n[mid]>=t){
                e=mid-1;
            }else{
                s=mid+1;
            }
            if(n[mid]==t) idx=mid;
        }
        return idx;
    }


    public int FindLast(int[] n,int t){
        int idx=-1;
        int s=0;
        int e=n.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(n[mid]<=t){
                s=mid+1;
            }else{
                e=mid-1;
            }
            if(n[mid]==t) idx=mid;
        }
        return idx;
    }
}