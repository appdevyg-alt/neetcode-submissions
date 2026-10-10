class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> hs = new HashMap<>();

        for (int n : nums) {
            hs.put(n, hs.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> m : hs.entrySet()) {
            if (m.getValue() == 1)
                return m.getKey();
        }
        return -1;
    }
}
