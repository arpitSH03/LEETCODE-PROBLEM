class Solution {
    public List<String> topKFrequent(String[] words, int k) {
    
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.merge(word, 1, Integer::sum);
        }
        Arrays.sort(words, (word1, word2) -> {
            int frequency1 = frequencyMap.get(word1);
            int frequency2 = frequencyMap.get(word2);
          
            if (frequency1 == frequency2) {
              
                return word1.compareTo(word2);
            } else {
              
                return frequency2 - frequency1;
            }
        });
      
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length && result.size() < k; i++) {
            if (i == 0 || !words[i].equals(words[i - 1])) {
                result.add(words[i]);
            }
        }
      
        return result;
    }
}
