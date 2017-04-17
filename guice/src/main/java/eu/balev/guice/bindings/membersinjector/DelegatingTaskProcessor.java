package eu.balev.guice.bindings.membersinjector;

import javax.inject.Inject;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.TaskProcessor;

class DelegatingTaskProcessor implements TaskProcessor
{
    @Inject
    private TaskProcessor delegate;

    @Override
    public void processTask(Task task)
    {
        delegate.processTask(task);
    }
}
