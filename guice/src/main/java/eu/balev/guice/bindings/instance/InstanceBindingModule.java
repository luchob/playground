package eu.balev.guice.bindings.instance;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import eu.balev.guice.common.TaskProcessor;

class InstanceBindingModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(TaskProcessor.class).to(ReoccuringTaskProcessor.class);

        //instance binding
        bind(Integer.class).annotatedWith(Names.named("reoccur")).toInstance(5);
    }
}