package eu.balev.euler.probs_001_010;

import java.util.function.LongSupplier;

public class Problem010 implements LongSupplier {

	// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	// Find the sum of all the primes below two million.

	@Override
	public long getAsLong() {

		// 2 + 3 + 5 + 7 = 17
		long sum = 17;
		// I've heard that all primes can be represented by 6*k+/-1

		for (int cnt = 2; cnt <= 2_000_000 / 6; cnt++) {
			int potentialBase = 6 * cnt;
			if (testPrime(potentialBase - 1)) {
				sum += potentialBase - 1;
			}
			if (testPrime(potentialBase + 1)) {
				sum += potentialBase + 1;
			}
		}

		return sum;
	}

	private boolean testPrime(int possiblePrime) {
		long maxTest = Math.round(Math.sqrt(possiblePrime));// test all below
															// sqrt of n

		for (int i = 3; i <= maxTest; i += 2) {
			if (possiblePrime % i == 0) {
				return false;
			}
		}
		return true;
	}
}
