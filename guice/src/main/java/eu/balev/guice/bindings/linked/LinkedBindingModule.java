package eu.balev.guice.bindings.linked;

import com.google.inject.AbstractModule;

import eu.balev.guice.common.TaskProcessor;

class LinkedBindingModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(TaskProcessor.class).to(ScheduledTaskProcessor.class);
    }
}