class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        // Pattern characters and words count same heba darkar
        if (pattern.length() != words.length)
            return false;
        // Character -> Word
        HashMap<Character, String> map = new HashMap<>();
        // Word -> Character
        HashMap<String, Character> used = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char b = pattern.charAt(i);
            String a = words[i];
            // Character already mapped
            if (map.containsKey(b)) {
                // Existing word different hele false
                if (!map.get(b).equals(a))
                    return false;
            }
            // Word already mapped
            if (used.containsKey(a)) {

                // Existing character different hele false
                if (used.get(a) != b)
                    return false;
            }
            // New mapping store kara
            map.put(b, a);
            used.put(a, b);
        }
        return true;
    }
}