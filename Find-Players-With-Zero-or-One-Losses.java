class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int arr[]=new int[100001];
        for(int i=0;i<matches.length;i++){
            int win = matches[i][0];
            int loss = matches[i][1];

            if(arr[win]==0){
                arr[win]=-1;
            }
            if(arr[loss]==-1){
                arr[loss]=1;
            }
            else{
                arr[loss]++;
            }
        }
        List<Integer> wins = new ArrayList<>();
        List<Integer> loss = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                wins.add(i);
            }else if(arr[i]==1){
                loss.add(i);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(wins);
        result.add(loss);

        return result;
    }
}