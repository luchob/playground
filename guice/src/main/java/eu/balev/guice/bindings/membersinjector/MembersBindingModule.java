package eu.balev.guice.bindings.membersinjector;

import com.google.inject.AbstractModule;

import eu.balev.guice.common.TaskProcessor;

class MembersBindingModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(TaskProcessor.class)
        .to(MembersTaskProcessor.class);
    }
}