class Solution{
    public int[] f(int[] a){
        return h(a,0,1,a[a.length-1]);
    }
    int[] h(int[] a,int i,int j,int t){
        if(i==a.length-1)return new int[]{-1,-1};
        if(j==a.length)return h(a,i+1,i+2,t);
        if(a[i]+a[j]==t)return new int[]{i,j};
        return h(a,i,j+1,t);
    }
}
