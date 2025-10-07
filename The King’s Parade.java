class Solution{
    public boolean f(int[] a){
        return h(a,0);
    }
    boolean h(int[] a,int i){
        if(i==a.length-1)return true;
        if(a[i]>a[i+1])return false;
        return h(a,i+1);
    }
}
