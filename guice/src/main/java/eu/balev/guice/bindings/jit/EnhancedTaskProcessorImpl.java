package eu.balev.guice.bindings.jit;

import eu.balev.guice.common.Task;

class EnhancedTaskProcessorImpl implements EnhancedTaskProcessor
{
    @Override
    public void processTask(Task task)
    {
        System.out.println("Enhanced task processor impl: " + task);
    }
}
