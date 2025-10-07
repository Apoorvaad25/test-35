class Solution {
    public boolean f(int[][] a) {
        int t = a[a.length-1][a[0].length-1]; 
        return search(a, 0, a[0].length - 1, t);
    }

    boolean search(int[][] a, int i, int j, int t) {
        if (i == a.length || j < 0) return false;
        if (a[i][j] == t) return true;
        if (a[i][j] > t) return search(a, i, j - 1, t);
        return search(a, i + 1, j, t);
    }
}
