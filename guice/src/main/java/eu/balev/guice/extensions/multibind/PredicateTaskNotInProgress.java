package eu.balev.guice.extensions.multibind;

import java.util.function.Predicate;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.Task.TaskStatus;

class PredicateTaskNotInProgress implements Predicate<Task>
{
    @Override
    public boolean test(Task t)
    {
        boolean ret = t.getTaskStatus() != TaskStatus.IN_PROGRESS;
        
        System.out.println("Is task '" + t.getTaskName() + "' not in progress? Result: "
				+ ret);
        
        return ret;
    }

}
