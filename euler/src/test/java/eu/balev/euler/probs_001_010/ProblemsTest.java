package eu.balev.euler.probs_001_010;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.LongSupplier;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ProblemsTest {

	@Parameters(name = "{2}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] 
				{ 
					param(233168, new Problem001()),
					param(4613732, new Problem002()),
					param(6857, new Problem003()), 
					param(906609, new Problem004()),
					param(232792560, new Problem005()),
					param(25164150, new Problem006()),
					param(104743, new Problem007()),
					param(23514624000L, new Problem008()),
					param(31875000, new Problem009())
				});
	}

	private static Object[] param(long answer, LongSupplier solution) {
		return new Object[] { answer, solution,
				solution.getClass().getSimpleName() };
	}

	@Parameter
	public long answer;

	@Parameter(1)
	public LongSupplier solution;

	@Parameter(2)
	public String name;

	@Test
	public void testSolutions() {
		Assert.assertEquals("The solution named " + name + " is not correct.",
				answer, solution.getAsLong());
	}
}
