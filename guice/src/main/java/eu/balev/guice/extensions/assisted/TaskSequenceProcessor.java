package eu.balev.guice.extensions.assisted;

import java.util.concurrent.atomic.AtomicInteger;

import javax.inject.Inject;

import com.google.inject.assistedinject.Assisted;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.TaskProcessor;

class TaskSequenceProcessor implements TaskProcessor
{
    private final AtomicInteger start;
    private final TaskProcessor delegate;
    
    @Inject
    public TaskSequenceProcessor(
                   @Assisted AtomicInteger start,
                   TaskProcessor delegate
                   )
   {
        this.start = start;
        this.delegate = delegate;
   }

    @Override
    public void processTask(Task task)
    {
        System.out.println("Seq Processor (" +  start.incrementAndGet() + "), delegating...");
        delegate.processTask(task);
    }
}
