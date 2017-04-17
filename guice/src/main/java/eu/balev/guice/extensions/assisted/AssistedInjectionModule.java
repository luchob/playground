package eu.balev.guice.extensions.assisted;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

import eu.balev.guice.common.TaskProcessor;

class AssistedInjectionModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(TaskProcessor.class).to(TaskProcessorImpl.class);

        install(new FactoryModuleBuilder().implement(TaskProcessor.class, TaskSequenceProcessor.class)
                        .build(TaskSequenceProcessorFactory.class));
    }
}
