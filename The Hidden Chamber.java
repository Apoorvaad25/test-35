class Solution {
    public int f(int[] a) {
        return sum(a, 0);
    }

    int sum(int[] a, int i) {
        if (i == a.length) return 0;
        return a[i] + sum(a, i + 1);
    }
}
