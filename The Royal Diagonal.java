class Solution{
    public int[] f(int[][] a){
        return h(a,0,0,0);
    }
    int[] h(int[][] a,int i,int s1,int s2){
        if(i==a.length)return new int[]{s1,s2};
        s1+=a[i][i];
        s2+=a[i][a.length-1-i];
        return h(a,i+1,s1,s2);
    }
}
