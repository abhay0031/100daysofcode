class Solution {
    public long minimumSteps(String s) {
        long steps = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                steps += count;
            }
        }
        return steps;
    }
}
