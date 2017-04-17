package eu.balev.guice.common;

/**
 * Describes a utility for task processing.
 */
@FunctionalInterface
public interface TaskProcessor
{
    public void processTask(Task task);
}
