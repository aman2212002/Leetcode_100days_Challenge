class Solution {
    public String frequencySort(String s) {
       Map<Character, Integer> frequencyMap = new HashMap<>();
      
        s.chars().forEach(c -> frequencyMap.put((char) c, frequencyMap.getOrDefault((char) c, 0) + 1));
       
        List<Character> characters = new ArrayList<>(frequencyMap.keySet());
        characters.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        
        StringBuilder sortedString = new StringBuilder();
        characters.forEach(c -> sortedString.append(String.valueOf(c).repeat(frequencyMap.get(c))));
        
        return sortedString.toString();
    }
}