package eu.balev.guice.bindings.nullable;

import javax.annotation.Nullable;
import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;

import eu.balev.guice.common.TaskProcessor;

class NullableDemo
{
    @Inject
    @Nullable // JSR 305
    private TaskProcessor taskProcessor;

    public void testGuice()
    {
        if (taskProcessor == null)
            System.out.println("There is no task processor around...");
        else
            System.out.println("A task processor miraculously appeared..." + taskProcessor);
    }

    public static void main(String[] args)
    {
        NullableDemo demo = new NullableDemo();

        Injector injector = Guice.createInjector(new NullableModule());
        injector.injectMembers(demo);

        demo.testGuice();
    }
}
