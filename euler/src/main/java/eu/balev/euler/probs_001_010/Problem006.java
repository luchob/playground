package eu.balev.euler.probs_001_010;

import java.util.function.LongSupplier;

public class Problem006 implements LongSupplier {

	// The sum of the squares of the first ten natural numbers is,
	// 12 + 22 + ... + 102 = 385
	//
	// The square of the sum of the first ten natural numbers is,
	// (1 + 2 + ... + 10)2 = 552 = 3025
	//
	// Hence the difference between the sum of the squares of the first ten
	// natural numbers and the square of the sum is 3025 - 385 = 2640.
	//
	// Find the difference between the sum of the squares of the first one
	// hundred natural numbers and the square of the sum.
	//
	//

	@Override
	public long getAsLong() {
		return squareOfSum(100) - sumOfSquares(100);
	}

	private long squareOfSum(int n) {
		long sum = n * (n + 1) / 2;
		return sum * sum;
	}
	
	private long sumOfSquares(int n){
		return n*(n+1)*(2*n+1)/6;
	}

}
