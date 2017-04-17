package eu.balev.guice.bindings.bindingannotations;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import eu.balev.guice.common.TaskProcessor;

class BindingAnnotationsModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(TaskProcessor.class).to(LowTechTaskProcessor.class);
        bind(TaskProcessor.class).annotatedWith(HiTech.class).to(HiTechTaskProcessor.class);
        bind(TaskProcessor.class).annotatedWith(Names.named("General")).to(GeneralTaskProcessor.class);
    }
}
