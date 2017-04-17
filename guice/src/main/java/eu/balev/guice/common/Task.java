package eu.balev.guice.common;

/**
 * Represents a task. The task has a name and status.
 */
public class Task
{
    /**
     * Enumerates various task statuses.
     */
    public static enum TaskStatus
    {
        NEW, IN_PROGRESS, COMPLETE;
    }

    private String taskName;
    private TaskStatus taskStatus;

    public String getTaskName()
    {
        return taskName;
    }

    public void setTaskName(String taskName)
    {
        this.taskName = taskName;
    }

    
    public TaskStatus getTaskStatus()
    {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus)
    {
        this.taskStatus = taskStatus;
    }

    @Override
    public String toString()
    {
        return "Task [taskName=" + taskName + ", taskStatus=" + taskStatus + "]";
    }

}
