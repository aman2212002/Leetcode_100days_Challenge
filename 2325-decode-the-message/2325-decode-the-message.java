class Solution {
    public String decodeMessage(String key, String message) {
      Map<Character, Character> substitutionTable = new HashMap<>();
        int index = 0;
        for (char ch : key.toCharArray()) {
            if (ch != ' ' && !substitutionTable.containsKey(ch)) {
                substitutionTable.put(ch, (char) ('a' + index));
                index++;
            }
        }
        StringBuilder decodedMessage = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (ch == ' ') {
                decodedMessage.append(' ');
            } else {
                decodedMessage.append(substitutionTable.get(ch));
            }
        }
        return decodedMessage.toString();
    }
}