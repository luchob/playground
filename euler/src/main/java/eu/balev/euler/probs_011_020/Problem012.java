package eu.balev.euler.probs_011_020;

import java.util.function.LongSupplier;

/**
 * <a href="https://projecteuler.net">https://projecteuler.net/problem=12</a>.
 */
public class Problem012 implements LongSupplier {

    @Override
    public long getAsLong() {

        for (int members = 2; members < Integer.MAX_VALUE; members++) {

            int triangleNo = getTriangleNum(members);
            int numDivs = getNumDivisors(triangleNo);

            if (numDivs > 500) {
                return triangleNo;
            }
        }

        throw new IllegalArgumentException("I'm sorry!");
    }

    private static int getTriangleNum(int n) {
        //This is an arithmetic progression
        //member 1 -> 1,
        //e.g. 0,1,2,3,4,5,6,7 = 28 = (8) * (7) / 2 = 4 * 7
        return n * (n - 1) / 2;
    }

    /**
     * Returns the number of divisors for the given number.
     *
     * @param number
     * @return
     */
    private static int getNumDivisors(long number) {
        int noDiv = 0;
        int sqrt = (int) Math.sqrt(number);

        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) {
                noDiv += 2;
            }
        }
        if (sqrt * sqrt == number) {
            noDiv--;
        }

        return noDiv;
    }
}
