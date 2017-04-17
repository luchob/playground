package eu.balev.guice.bindings.nullable;

import com.google.inject.AbstractModule;
import com.google.inject.util.Providers;

import eu.balev.guice.common.TaskProcessor;

class NullableModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(TaskProcessor.class).toProvider(Providers.<TaskProcessor>of(null));
    }
}