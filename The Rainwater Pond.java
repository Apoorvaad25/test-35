class Solution {
    public int f(int[][] a) {
        return count(a, 0, 0, 0);
    }

    int count(int[][] a, int i, int j, int c) {
        if (i == a.length) return c;
        if (j == a[0].length) return count(a, i + 1, 0, c);
        if (a[i][j] == 1) {
            mark(a, i, j);
            c++;
        }
        return count(a, i, j + 1, c);
    }

    void mark(int[][] a, int i, int j) {
        if (i < 0 || j < 0 || i >= a.length || j >= a[0].length || a[i][j] == 0)
            return;
        a[i][j] = 0;
        mark(a, i + 1, j);
        mark(a, i - 1, j);
        mark(a, i, j + 1);
        mark(a, i, j - 1);
    }
}
