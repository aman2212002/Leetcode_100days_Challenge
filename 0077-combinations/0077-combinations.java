class Solution {
    public List<List<Integer>> combine(int n, int k) {
         List<List<Integer>> result = new ArrayList<>();
        generateCombinations(result, new ArrayList<>(), 1, n, k);
        return result;
    }

    private void generateCombinations(List<List<Integer>> result, List<Integer> current, int index, int n, int k) {
        if (k == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index > n) {
            return;
        }
        current.add(index);
        generateCombinations(result, current, index + 1, n, k - 1);
        current.remove(current.size() - 1);
        generateCombinations(result, current, index + 1, n, k);
    }
}