class Solution {
    public String f(int[][] a) {
        int t = a[a.length-1][a[0].length-1];
        return search(a, 0, a.length - 1, 0, a[0].length - 1, t) ? "Activated" : "Failed";
    }

    boolean search(int[][] a, int r1, int r2, int c1, int c2, int t) {
        if (r1 > r2 || c1 > c2) return false;
        int rm = (r1 + r2) / 2;
        int cm = (c1 + c2) / 2;
        if (a[rm][cm] == t) return true;
        if (a[rm][cm] > t)
            return search(a, r1, rm - 1, c1, cm - 1, t) || search(a, r1, rm - 1, cm, c2, t) || search(a, rm, r2, c1, cm - 1, t);
        return search(a, rm + 1, r2, cm + 1, c2, t) || search(a, r1, rm, cm + 1, c2, t) || search(a, rm + 1, r2, c1, cm, t);
    }
}
