class Solution{
    public int[] f(int[][] a){
        int[] r=new int[a.length*a[0].length];
        h(a,0,a.length-1,0,a[0].length-1,0,r);
        return r;
    }
    void h(int[][] a,int t,int b,int l,int rt,int k,int[] r){
        if(t>b||l>rt)return;
        for(int i=l;i<=rt;i++)r[k++]=a[t][i];
        for(int i=t+1;i<=b;i++)r[k++]=a[i][rt];
        if(t<b)for(int i=rt-1;i>=l;i--)r[k++]=a[b][i];
        if(l<rt)for(int i=b-1;i>t;i--)r[k++]=a[i][l];
        h(a,t+1,b-1,l+1,rt-1,k,r);
    }
}
