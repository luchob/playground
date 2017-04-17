package eu.balev.guice.bindings.provider;

import com.google.inject.AbstractModule;

import eu.balev.guice.common.TaskProcessor;

class ProviderBindingModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(TaskProcessor.class)
        .toProvider(TaskProcessorProvider.class);
    }
}