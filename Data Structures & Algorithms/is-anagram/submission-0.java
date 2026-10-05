class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> freqMap = new HashMap<Character, Integer>();

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            Character cs = s.charAt(i);
            freqMap.put(cs, freqMap.getOrDefault(cs, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            Character cs = t.charAt(i);
            freqMap.put(cs, freqMap.getOrDefault(cs,0) - 1);
        }

        for (int count : freqMap.values()) {
            if (count != 0)
                return false;
        }
        return true;
    }
}
