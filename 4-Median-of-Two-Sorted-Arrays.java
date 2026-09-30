class Solution {
    // Length of first array
    private int firstArrayLength;
    // Length of second array
    private int secondArrayLength;
    // Reference to first sorted array
    private int[] firstArray;
    // Reference to second sorted array
    private int[] secondArray;

    /**
     * Finds the median of two sorted arrays using binary search approach.
     * The median is found by finding the (n+1)/2-th and (n+2)/2-th smallest elements
     * and averaging them, which handles both odd and even total lengths.
     *
     * @param nums1 First sorted array
     * @param nums2 Second sorted array
     * @return The median value of the combined sorted arrays
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Initialize instance variables
        firstArrayLength = nums1.length;
        secondArrayLength = nums2.length;
        this.firstArray = nums1;
        this.secondArray = nums2;

        // For odd total length: both positions point to the same middle element
        // For even total length: positions point to the two middle elements
        int leftMedianElement = findKthSmallest(0, 0, (firstArrayLength + secondArrayLength + 1) / 2);
        int rightMedianElement = findKthSmallest(0, 0, (firstArrayLength + secondArrayLength + 2) / 2);

        // Average the two middle elements (same element for odd length)
        return (leftMedianElement + rightMedianElement) / 2.0;
    }

    /**
     * Recursively finds the k-th smallest element in two sorted arrays.
     * Uses binary search by eliminating k/2 elements at each step.
     *
     * @param firstArrayStartIndex Starting index in the first array
     * @param secondArrayStartIndex Starting index in the second array
     * @param k The position (1-indexed) of the element to find
     * @return The k-th smallest element
     */
    private int findKthSmallest(int firstArrayStartIndex, int secondArrayStartIndex, int k) {
      
        if (firstArrayStartIndex >= firstArrayLength) {
            return secondArray[secondArrayStartIndex + k - 1];
        }

      
        if (secondArrayStartIndex >= secondArrayLength) {
            return firstArray[firstArrayStartIndex + k - 1];
        }

       
        if (k == 1) {
            return Math.min(firstArray[firstArrayStartIndex], secondArray[secondArrayStartIndex]);
        }

        
        int halfK = k / 2;

        int firstArrayMidValue = (firstArrayStartIndex + halfK - 1 < firstArrayLength)
            ? firstArray[firstArrayStartIndex + halfK - 1]
            : Integer.MAX_VALUE;

        
        int secondArrayMidValue = (secondArrayStartIndex + halfK - 1 < secondArrayLength)
            ? secondArray[secondArrayStartIndex + halfK - 1]
            : Integer.MAX_VALUE;

        
        if (firstArrayMidValue < secondArrayMidValue) {
            
            return findKthSmallest(firstArrayStartIndex + halfK, secondArrayStartIndex, k - halfK);
        } else {
           
            return findKthSmallest(firstArrayStartIndex, secondArrayStartIndex + halfK, k - halfK);
        }
    }
}
