class Solution{
    public int f(int[] a){
        return h(a,0,a.length-1);
    }
    int h(int[] a,int l,int r){
        if(l>r)return l;
        int m=(l+r)/2;
        if(a[m]==m)return h(a,m+1,r);
        else return h(a,l,m-1);
    }
}
