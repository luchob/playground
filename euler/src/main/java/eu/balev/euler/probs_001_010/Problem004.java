package eu.balev.euler.probs_001_010;

import java.util.function.LongSupplier;

/**
 * <a href="https://projecteuler.net">https://projecteuler.net/problem=4</a>.
 */
public class Problem004 implements LongSupplier {

	// A palindromic number reads the same both ways. The largest palindrome
	// made from the product of
	// two 2-digit numbers is 9009 = 91 * 99.

	// Find the largest palindrome made from the product of two 3-digit numbers.
	@Override
	public long getAsLong() {
		int max = 0;
		for (int a = 999; a > 99; a--)
			for (int b = a; b > 99; b--) {
				int mult = a * b;
				if (isPalindromic(mult)) {
					if (mult > max)
						max = mult;
					break;// b is decreasing so we can stop now
				}
			}
		return max;
	}

	private static boolean isPalindromic(int num) {
		return num == reverse(num);
	}

	private static int reverse(int num) {
		int reverse = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num = num / 10;
		}
		return reverse;
	}
}
