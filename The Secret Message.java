class Solution{
    public int[] f(int[] a){
        h(a,0,a.length-1);
        return a;
    }
    void h(int[] a,int i,int j){
        if(i>=j)return;
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
        h(a,i+1,j-1);
    }
}
