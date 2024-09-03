class Solution {
    public int getLucky(String s, int k) {

        int n = 0;

        for(int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - 'a' + 1; 

            while(digit > 0) {
                n += digit % 10;
                digit /= 10;
            }
        }

        for(int j = 0; j < k - 1; j++) {
            int temp = 0;
            while(n > 0) {
                temp += n % 10;
                n /= 10;
            }
            n = temp;
        }

        return n;
    }
}
