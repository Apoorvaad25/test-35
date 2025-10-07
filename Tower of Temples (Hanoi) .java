class Solution {
    public int f(int n) {
        return h(n);
    }

    int h(int n) {
        if (n == 1) return 1;
        return 2 * h(n - 1) + 1;
    }
}
