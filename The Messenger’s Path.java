class Solution{
    public boolean f(int[][] a){
        return h(a,0,0);
    }
    boolean h(int[][] a,int i,int j){
        if(i<0||j<0||i>=a.length||j>=a[0].length||a[i][j]==1)return false;
        if(i==a.length-1&&j==a[0].length-1)return true;
        a[i][j]=1;
        return h(a,i+1,j)||h(a,i-1,j)||h(a,i,j+1)||h(a,i,j-1);
    }
}
