class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<String, List<String>>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String temp = new String(chars);
            hm.putIfAbsent(temp, new ArrayList<>());
            hm.get(temp).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
