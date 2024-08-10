class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

              // Calculate the expected sum of the first n natural numbers
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // The missing number is the difference between the expected and actual sum
        return expectedSum - actualSum;
    }
}
