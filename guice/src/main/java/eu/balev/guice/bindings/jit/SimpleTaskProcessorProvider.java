package eu.balev.guice.bindings.jit;

import javax.inject.Provider;

class SimpleTaskProcessorProvider implements Provider<SimpleTaskProcessor>
{
    @Override
    public SimpleTaskProcessor get()
    {
        return t -> System.out.println("Simple task processor: " + t);
    }
}
