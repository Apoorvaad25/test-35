class Solution{
    public int f(int[][] a){
        return h(a,0,0,0,0);
    }
    int h(int[][] a,int i,int j,int s,int m){
        if(i==a.length)return m;
        if(j==a[0].length){
            if(s>m)m=i+1;
            return h(a,i+1,0,0,m);
        }
        return h(a,i,j+1,s+a[i][j],m);
    }
}
