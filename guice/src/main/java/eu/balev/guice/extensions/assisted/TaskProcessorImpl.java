package eu.balev.guice.extensions.assisted;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.TaskProcessor;

class TaskProcessorImpl implements TaskProcessor
{
    @Override
    public void processTask(Task task)
    {
        System.out.println("Delegate processor: " + task);
    }
}