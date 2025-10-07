class Solution {
    public int f(int[] a) {
        int k = a[a.length-1];
        return search(a, 0, a.length - 2, k);
    }

    int search(int[] a, int l, int r, int k) {
        if (l > r) return -1;
        int m = (l + r) / 2;
        if (a[m] == k) return m;
        if (a[m] < k) return search(a, m + 1, r, k);
        return search(a, l, m - 1, k);
    }
}
