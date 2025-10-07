class Solution {
    public int[] f(int[][] a) {
        int t = a[a.length-1][a[0].length-1]; 
        int n = a.length, m = a[0].length;
        int idx = first(a, 0, n * m - 2, t, m, -1);
        return idx == -1 ? new int[]{-1, -1} : new int[]{idx / m, idx % m};
    }

    int first(int[][] a, int l, int r, int t, int m, int ans) {
        if (l > r) return ans;
        int mid = (l + r) / 2;
        int val = a[mid / m][mid % m];
        if (val >= t) return first(a, l, mid - 1, t, m, val == t ? mid : ans);
        return first(a, mid + 1, r, t, m, ans);
    }
}
