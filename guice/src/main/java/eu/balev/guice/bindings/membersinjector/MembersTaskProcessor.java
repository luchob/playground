package eu.balev.guice.bindings.membersinjector;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.TaskProcessor;

class MembersTaskProcessor implements TaskProcessor
{
    @Override
    public void processTask(Task task)
    {
        System.out.println("members task processor: " + task);
    }
}
