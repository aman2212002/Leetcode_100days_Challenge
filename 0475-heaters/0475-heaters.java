class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        Arrays.sort(houses);
        int n = heaters.length;
        int r = 0, h = 0;
        for (int house : houses) {
            while (h < n - 1 && Math.abs(heaters[h + 1] - house) <= Math.abs(heaters[h] - house)) h++;
            r = Math.max(r, Math.abs(heaters[h] - house));
        }
        return r;
    }
}