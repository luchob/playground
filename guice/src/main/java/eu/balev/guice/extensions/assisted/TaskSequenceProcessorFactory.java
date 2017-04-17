package eu.balev.guice.extensions.assisted;

import java.util.concurrent.atomic.AtomicInteger;

import eu.balev.guice.common.TaskProcessor;

public interface TaskSequenceProcessorFactory
{
    public TaskProcessor create(AtomicInteger start);
}
