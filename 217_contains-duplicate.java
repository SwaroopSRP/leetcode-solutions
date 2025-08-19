class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniq = new HashSet<>();

        for (int num : nums) {
            if (uniq.contains(num)) return true;

            uniq.add(num);
        }

        return false;
    }
}
