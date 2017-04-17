package eu.balev.guice.bindings.bindingannotations;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.TaskProcessor;

class GeneralTaskProcessor implements TaskProcessor
{
    @Override
    public void processTask(Task task)
    {
        System.out.println("General task processor: " + task);
    }
}
