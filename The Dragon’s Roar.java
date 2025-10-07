class Solution {
    public void f(int n) {
        print(1, n);
    }

    void print(int i, int n) {
        if (i > n) return;
        System.out.print(i + " ");
        print(i + 1, n);
    }
}
