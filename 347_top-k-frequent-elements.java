class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Store freq
        for (int num : nums) freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        
        // Min Heap (PQ)
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> freqMap.get(a) - freqMap.get(b) // Comparator logic
        );

        for (int num : freqMap.keySet()) {
            heap.add(num);

            if (heap.size() > k)
                heap.poll(); // pop least frequent
        } // At end, the top K elem remain in the heap

        int[] out = new int[k];
        for (int i = 0; i < k; i++) 
            out[i] = heap.poll();
        

        return out;
    }
}
