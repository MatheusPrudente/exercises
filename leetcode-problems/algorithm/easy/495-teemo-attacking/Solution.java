class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int poisoned = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int interval = timeSeries[i + 1] - timeSeries[i];
            if (interval >= duration) {
                poisoned += duration;
            } else {
                poisoned += interval;
            }
        }
        return poisoned + duration;
    }
}
