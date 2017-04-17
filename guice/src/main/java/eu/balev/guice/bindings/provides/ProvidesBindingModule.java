package eu.balev.guice.bindings.provides;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import eu.balev.guice.common.TaskProcessor;

class ProvidesBindingModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        
    }
    
    @Provides
    public TaskProcessor getTaskProcessor()
    {
        return task -> System.out.println("Provides task processor: " + task); 
    }
}