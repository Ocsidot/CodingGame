import java.util.*;

/**
*Input
*Line 1: Number N of horses
*
*The N following lines: the strength Pi of each horse. Pi is an integer.
*
*Output
*The difference D between the two closest strengths. D is an integer greater than or equal to 0.
*Constraints
*1 < N  < 100000
*0 < Pi ≤ 10000000
**/

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] strengths = new int[N];
        for (int i = 0; i < N; i++) {
            strengths[i] = in.nextInt();
        }
        Arrays.sort(strengths);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            if (strengths[i] - strengths[i - 1] < minDiff) {
                minDiff = strengths[i] - strengths[i - 1];
            }
        }
        System.out.println(minDiff);
    }
}
