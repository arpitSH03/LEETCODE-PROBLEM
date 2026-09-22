class Solution {
    /**
     * Finds all pairs of prime numbers (x, y) where x + y = n and x <= y.
     * 
     * @param n The target sum for prime pairs
     * @return List of prime pairs [x, y] where x + y = n
     */
    public List<List<Integer>> findPrimePairs(int n) {
        // Generate all prime numbers up to n using Sieve of Eratosthenes
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
      
        // Sieve of Eratosthenes algorithm
        // Mark all non-prime numbers as false
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                // Mark all multiples of i as non-prime
                for (int multiple = i + i; multiple < n; multiple += i) {
                    isPrime[multiple] = false;
                }
            }
        }
      
        // Find all valid prime pairs
        List<List<Integer>> result = new ArrayList<>();
      
        // Iterate through first half of possible values (x <= n/2)
        // This ensures x <= y since y = n - x
        for (int x = 2; x <= n / 2; x++) {
            int y = n - x;
          
            // Check if both x and y are prime numbers
            if (isPrime[x] && isPrime[y]) {
                result.add(List.of(x, y));
            }
        }
      
        return result;
    }
}
