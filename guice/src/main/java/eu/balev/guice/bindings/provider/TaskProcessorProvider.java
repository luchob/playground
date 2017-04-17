package eu.balev.guice.bindings.provider;

import javax.inject.Provider;

import eu.balev.guice.common.TaskProcessor;

class TaskProcessorProvider implements Provider<TaskProcessor>
{
    @Override
    public TaskProcessor get()
    {
        return t -> System.out.println("Lambda task processor: " + t);
    }
}
