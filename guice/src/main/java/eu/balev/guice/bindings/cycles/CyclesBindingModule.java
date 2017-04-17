package eu.balev.guice.bindings.cycles;

import com.google.inject.AbstractModule;

class CyclesBindingModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(Child.class).to(ChildImpl.class);
        bind(Mother.class).to(MotherImpl.class);
    }
}