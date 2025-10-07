class Solution {
    public int f(int[] a) {
        int k = a[a.length-1];
        return lower(a, 0, a.length - 2, k, a.length);
    }

    int lower(int[] a, int l, int r, int k, int ans) {
        if (l > r) return ans;
        int m = (l + r) / 2;
        if (a[m] >= k) return lower(a, l, m - 1, k, m);
        return lower(a, m + 1, r, k, ans);
    }
}
