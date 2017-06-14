package eu.balev.euler.base;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.Collections;
import java.util.function.LongSupplier;

/**
 * A base class for testing problem solutions.
 */
public abstract class AbstractProblemsTest {

    @Parameterized.Parameter
    public long answer;

    @Parameterized.Parameter(1)
    public LongSupplier solution;

    @Parameterized.Parameter(2)
    public String name;

    @Test
    public void testSolutions() {
        Assert.assertEquals("The solution named " + name + " is not correct.",
                answer, solution.getAsLong());
    }

    protected static Object[] param(long answer, LongSupplier solution) {
        return new Object[]{answer, solution,
                solution.getClass().getSimpleName()};
    }
}
