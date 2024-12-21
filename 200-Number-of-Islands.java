class Solution {

    public static void dfs(char grid[][], int x , int y)
    {
        if(x<0 || x>=grid.length) return;
        if(y<0 || y>=grid[0].length) return;
        if(grid[x][y]!='1') return;
        grid[x][y] = '2';
        dfs(grid,x-1,y);
        dfs(grid,x+1,y);
        dfs(grid,x,y-1);
        dfs(grid,x,y+1);
    }
    public int numIslands(char[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j);
                    res++;
                }
            }
        }
        return res;
    }
}