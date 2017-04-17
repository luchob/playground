package eu.balev.guice.bindings.linked;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.TaskProcessor;

class ScheduledTaskProcessor implements TaskProcessor
{
    @Override
    public void processTask(Task task)
    {
        System.out.println("Scheduled task processor: " + task);
    }

}
