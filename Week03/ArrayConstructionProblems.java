public class ArrayConstructionProblems {

    // LC 2011  Final Value After Performing Operations
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {

            if (op.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
    // Time Complexity O(n)
    // Auxiliary Space O(1)


    // LC 1920  Build Array from Permutation
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    // Time Complexity O(n)
    // Auxiliary Space O(n)


    // LC 1929  Concatenation of Array
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    // Time Complexity O(n)
    // Auxiliary Space O(n)


    // LC 1480  Running Sum of 1D Array
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }

    // Time Complexity O(n)
    // Auxiliary Space O(n)
}
