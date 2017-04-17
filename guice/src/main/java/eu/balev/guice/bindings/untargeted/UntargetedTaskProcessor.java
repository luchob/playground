package eu.balev.guice.bindings.untargeted;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.TaskProcessor;

class UntargetedTaskProcessor implements TaskProcessor
{
    @Override
    public void processTask(Task task)
    {
        System.out.println("Untargetd task processor: " + task);
    }
}
