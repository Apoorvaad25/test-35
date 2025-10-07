class Solution{
    public int f(int[] a){
        return h(a,0,a[0]);
    }
    int h(int[] a,int i,int m){
        if(i==a.length)return m;
        if(a[i]>m)m=a[i];
        return h(a,i+1,m);
    }
}
