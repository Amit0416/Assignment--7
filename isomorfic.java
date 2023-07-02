class Solution {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; // Strings must have the same length to be isomorphic
        }

        int[] sMap = new int[128]; // Mapping for characters in s
        int[] tMap = new int[128]; // Mapping for characters in t

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap[sChar] != tMap[tChar]) {
                return false; // Different mappings found, strings are not isomorphic
            }

            // If the characters are not mapped yet, assign new mappings
            if (sMap[sChar] == 0 && tMap[tChar] == 0) {
                sMap[sChar] = i + 1;
                tMap[tChar] = i + 1;
            }
        }

        return true; // All characters have consistent mappings, strings are isomorphic
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t)); // Output: true
    }
}
