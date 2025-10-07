class Solution {
    public String f(String s) {
        if (s.length() <= 1) return s;
        return f(s.substring(1)) + s.charAt(0);
    }
}
