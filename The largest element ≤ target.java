class Solution {
    public int f(int[] a) {
        int k = a[a.length-1];
        int idx = floorIndex(a, 0, a.length - 2, k, -1);
        return idx == -1 ? -1 : a[idx];
    }

    int floorIndex(int[] a, int l, int r, int k, int ans) {
        if (l > r) return ans;
        int m = (l + r) / 2;
        if (a[m] <= k) return floorIndex(a, m + 1, r, k, m);
        return floorIndex(a, l, m - 1, k, ans);
    }
}
