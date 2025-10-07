class Solution {
    public boolean f(int[][] a) {
        int t = a[a.length-1][a[0].length-1]; 
        return search(a, 0, 0, t);
    }

    boolean search(int[][] a, int i, int j, int t) {
        if (i == a.length) return false;
        if (j == a[0].length) return search(a, i + 1, 0, t);
        if (a[i][j] == t) return true;
        return search(a, i, j + 1, t);
    }
}
