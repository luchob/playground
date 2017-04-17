package eu.balev.euler.probs_001_010;

import java.util.function.LongSupplier;

public class Problem007 implements LongSupplier {

	// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
	// see that the 6th prime is 13.
	//
	// What is the 10 001st prime number?

	@Override
	public long getAsLong() {
		
		long[] allPrimes = new long[10001];//remember all previous primes
		allPrimes[0] = 2;
		int currentIdx = 1;
		
		while (currentIdx < allPrimes.length)
		{
			//if the number is not divisable on any of the previous primes it is prime
			for (long possiblePrime = allPrimes[currentIdx - 1] + 1;allPrimes[currentIdx] == 0;possiblePrime++)
			{
				boolean aPrime = true;
				
				long maxTest = Math.round(Math.sqrt(possiblePrime));//test all below sqrt of n
				
				for (int testIdx=0;testIdx <= currentIdx-1; testIdx++)
				{
					if (possiblePrime % allPrimes[testIdx] == 0)
					{
						aPrime = false;
						break;
					}
					if(allPrimes[testIdx] > maxTest)
					{
						break;
					}
				}
				if (aPrime)
				{
					allPrimes[currentIdx] = possiblePrime;
				}
			}
			currentIdx++;
		}
		
		return allPrimes[10000];
	}
	
}
