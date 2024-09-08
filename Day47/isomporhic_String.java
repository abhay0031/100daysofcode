class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char or = s.charAt(i);
            char re = t.charAt(i);

            if (!hm.containsKey(or)) {
                if (!hm.containsValue(re)) {
                    hm.put(or, re);  
                } else {
                    return false; 
                }
            } else {
                char mappedChar = hm.get(or);
                if (mappedChar != re) { 
                    return false;
                }
            }
        }
        return true;
    }
}
