package eu.balev.euler.probs_001_010;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.LongSupplier;

import eu.balev.euler.base.AbstractProblemsTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ProblemsTest extends AbstractProblemsTest {

	@Parameterized.Parameters(name = "{2}")
	public static Collection<Object[]> data() {
		return Arrays.asList(param(233168, new Problem001()),
				param(4613732, new Problem002()),
				param(6857, new Problem003()),
				param(906609, new Problem004()),
				param(232792560, new Problem005()),
				param(25164150, new Problem006()),
				param(104743, new Problem007()),
				param(23514624000L, new Problem008()),
				param(31875000, new Problem009()),
				param(142913828922L, new Problem010()));
	}
}
