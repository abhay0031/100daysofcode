class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> value = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            value.add(nums1[i]);
        }

        for (int j = 0; j < n; j++) {
            value.add(nums2[j]);
        }

        Collections.sort(value);

        for (int i = 0; i < value.size(); i++) {
            nums1[i] = value.get(i);
        }
    }
}
