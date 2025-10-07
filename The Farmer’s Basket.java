class Solution {
    public int f(int[] a) {
        int k = a[a.length-1];
        return find(a, 0, k);
    }

    int find(int[] a, int i, int k) {
        if (i == a.length - 1) return -1;
        if (a[i] == k) return i;
        return find(a, i + 1, k);
    }
}
