package eu.balev.euler.probs_011_020;

import eu.balev.euler.base.AbstractProblemsTest;
import eu.balev.euler.probs_001_010.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ProblemsTest extends AbstractProblemsTest {

    @Parameters(name = "{2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]
                {
                        param(70600674, new Problem011())
                });
    }
}
