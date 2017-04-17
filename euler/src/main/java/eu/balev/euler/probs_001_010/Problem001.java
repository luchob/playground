package eu.balev.euler.probs_001_010;

import java.util.function.LongSupplier;
import java.util.stream.IntStream;

/**
 * <a href="https://projecteuler.net">https://projecteuler.net/problem=1</a>.
 */
public class Problem001 implements LongSupplier {

	// If we list all the natural numbers below 10
	// that are multiples of 3 or 5, we get 3, 5, 6 and 9.
	// The sum of these multiples is 23.
	//
	// Find the sum of all the multiples of 3 or 5 below 1000.

	@Override
	public long getAsLong() {
		
		return IntStream.
			range(0, 1000).
			filter(i -> i % 3 == 0 || i % 5 == 0).
			sum();
	}
}
