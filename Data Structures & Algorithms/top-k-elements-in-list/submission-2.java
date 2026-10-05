class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> hm = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // Store frequencies
        List<Integer> res = new ArrayList<>();

        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            res.add(e.getValue());
        }

        // Sort frequencies
        Collections.sort(res);

        int[] result = new int[k];

        // Get top k frequencies
        for (int i = 0; i < k; i++) {

            int frequency = res.get(res.size() - 1 - i);

            // Find key having this frequency
            for (Map.Entry<Integer, Integer> e : hm.entrySet()) {

                if (e.getValue() == frequency) {
                    result[i] = e.getKey();
                    hm.remove(e.getKey());
                    break;
                }
            }
        }

        return result;
    }
}