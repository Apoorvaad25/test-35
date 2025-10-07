class Solution {
    public int f(int[] a) {
        int k = a[a.length-1];
        return first(a, 0, k);
    }

    int first(int[] a, int i, int k) {
        if (i == a.length - 1) return -1;
        if (a[i] == k) return i;
        return first(a, i + 1, k);
    }
}
