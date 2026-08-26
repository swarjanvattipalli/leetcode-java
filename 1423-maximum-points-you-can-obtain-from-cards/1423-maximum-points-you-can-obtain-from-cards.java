class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        // Total sum of all cards
        int total = 0;
        for (int card : cardPoints) {
            total += card;
        }

        // Number of cards we leave behind
        int windowSize = n - k;

        // If we take all cards
        if (windowSize == 0) {
            return total;
        }

        // Find minimum sum subarray of size n-k
        int windowSum = 0;

        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;

        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i];
            windowSum -= cardPoints[i - windowSize];

            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return total - minWindowSum;
    }
}