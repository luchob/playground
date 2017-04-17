package eu.balev.guice.bindings.untargeted;

import com.google.inject.AbstractModule;

class UntargetedBindingModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(UntargetedTaskProcessor.class);
    }
}