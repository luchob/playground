package eu.balev.euler.probs_001_010;

import java.util.function.LongSupplier;

/**
 * <a href="https://projecteuler.net">https://projecteuler.net/problem=5</a>.
 */
public class Problem005 implements LongSupplier {

	// 2520 is the smallest number that can be divided by each of the numbers
	// from 1 to 10 without any remainder.
	// What is the smallest positive number that is evenly divisible by all of
	// the numbers from 1 to 20?
	@Override
	public long getAsLong() {
		return getSolution(20);
	}

	private static long getSolution(int maxNum) {
		// init the array
		int allNumbers[] = new int[maxNum];
		for (int i = 0; i < maxNum; allNumbers[i] = ++i)
			;

		// divide all
		for (int currentIdx = 1; currentIdx < allNumbers.length; currentIdx++) {
			int currentNum = allNumbers[currentIdx];

			for (int divIdx = currentIdx + currentNum; divIdx < allNumbers.length; divIdx += currentNum) {
				if ((allNumbers[divIdx] % currentNum) == 0) {
					allNumbers[divIdx] = allNumbers[divIdx] / currentNum;
				}
			}
		}

		// multiply the reminders
		int res = 1;
		for (int i = 0; i < allNumbers.length; i++) {
			res *= allNumbers[i];
		}
		return res;
	}
}
