class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += cardPoints[i];
        }

        int maxSum = sum;
        for(int i=0;i<k;i++){
            sum = sum - cardPoints[k-i-1];
            sum = sum + cardPoints[cardPoints.length - 1 - i];

            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}