class Solution {
    public boolean f(int[][] a) {
        int t = a[a.length-1][a[0].length-1]; 
        int n = a.length, m = a[0].length;
        return search(a, 0, n * m - 2, t, m);
    }

    boolean search(int[][] a, int l, int r, int t, int m) {
        if (l > r) return false;
        int mid = (l + r) / 2;
        int val = a[mid / m][mid % m];
        if (val == t) return true;
        if (val < t) return search(a, mid + 1, r, t, m);
        return search(a, l, mid - 1, t, m);
    }
}
