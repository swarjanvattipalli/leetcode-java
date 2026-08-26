class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;

        for(int i=0;i<k;i++){
            sum += cardPoints[i];
        }

        int maxSum = sum;

        for(int i=0;i<k;i++){
            sum += cardPoints[cardPoints.length-1-i];
            sum -= cardPoints[k-i-1];

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}