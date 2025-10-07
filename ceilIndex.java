class Solution {
    public int f(int[] a) {
        int k = a[a.length-1];
        int idx = ceilIndex(a, 0, a.length - 2, k, a.length);
        return idx == a.length ? -1 : a[idx];
    }

    int ceilIndex(int[] a, int l, int r, int k, int ans) {
        if (l > r) return ans;
        int m = (l + r) / 2;
        if (a[m] >= k) return ceilIndex(a, l, m - 1, k, m);
        return ceilIndex(a, m + 1, r, k, ans);
    }
}
