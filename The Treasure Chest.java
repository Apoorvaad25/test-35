class Solution {
    public int f(int[] a) {
        int k = a[a.length-1];
        return last(a, 0, a.length - 2, k, -1);
    }

    int last(int[] a, int l, int r, int k, int ans) {
        if (l > r) return ans;
        int m = (l + r) / 2;
        if (a[m] == k) return last(a, m + 1, r, k, m);
        if (a[m] < k) return last(a, m + 1, r, k, ans);
        return last(a, l, m - 1, k, ans);
    }
}
