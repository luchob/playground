package eu.balev.euler.probs_001_010;

import java.util.function.LongSupplier;

/**
 * <a href="https://projecteuler.net">https://projecteuler.net/problem=3</a>.
 */
public class Problem003 implements LongSupplier {

	// The prime factors of 13195 are 5, 7, 13 and 29.
	// What is the largest prime factor of the number 600851475143 ?

	@Override
	public long getAsLong() {

		long num = 600851475143L;

		long res = 2;

		if (num % 2 == 0)
			while (num % 2 == 0)
				num = num % 2;

		long div = 3;
		while (num != 1) {
			if (num % div == 0) {
				res = div;
				num = num / div;
			} else {
				div += 2;
			}
		}
		return res;
	}
}
