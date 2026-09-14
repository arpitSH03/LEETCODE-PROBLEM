class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    
        boolean[] seen = new boolean[1001];

        for (int num : nums1) {
            seen[num] = true;
        }

        List<Integer> intersectionList = new ArrayList<>();

        
        for (int num : nums2) {
      
            if (seen[num]) {
                intersectionList.add(num);
              
                seen[num] = false;
            }
        }

      
        return intersectionList.stream()
                              .mapToInt(Integer::intValue)
                              .toArray();

        
    }
}