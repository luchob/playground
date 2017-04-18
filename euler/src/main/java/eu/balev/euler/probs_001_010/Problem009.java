package eu.balev.euler.probs_001_010;

import java.util.function.LongSupplier;

public class Problem009 implements LongSupplier {

	// A Pythagorean triplet is a set of three natural numbers, a < b < c, for
	// which,
	// a^2 + b^2 = c^2
	//
	// For example, 32 + 42 = 9 + 16 = 25 = 52.
	//
	// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	// Find the product abc.

	public static void main(String args[]) {
		System.out.println(new Problem009().getAsLong());
	}

	@Override
	public long getAsLong() {

		int N = 1000 - 2;// <--the max of a,b and c

		for (int a = 1; a <= N; a++)/* iterate on all */{
			for (int b = a + 1; b <= N; b++) /*
											 * iterate on greater than the first
											 * a < b < c
											 */{

				int c = b + 1;
				// iterate until c^2 < b^2 + a ^2

				while (c * c < b * b + a * a) {
					// < means it can't be a triple
					c = c + 1;
				}
				if (c * c == b * b + a * a && c <= N) {
					if (a + b + c == 1000)
						return a * b * c;
				}
			}
		}

		throw new IllegalStateException("Cannot find an answer!");
	}

}
