public class Climb {
    public static void main (String[] args) {

        System.out.println(climbStairs(4));

    }
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        memo[0] = 1;
        memo[1] = 1;
        return recursiveClimbHelper(memo, n);

    }

    public static int recursiveClimbHelper(int[] memo, int n) {
        if (memo[n] != 0) {
            return memo[n];
        }
        int result;
        if (n == 0 || n == 1) {
            result = 1;
        }
        else {
            result = recursiveClimbHelper(memo, n - 1) + recursiveClimbHelper(memo, n - 2);
            memo[n] = result;


        }
        return result;

    }
}
