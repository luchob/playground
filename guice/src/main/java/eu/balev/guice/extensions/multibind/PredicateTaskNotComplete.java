package eu.balev.guice.extensions.multibind;

import java.util.function.Predicate;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.Task.TaskStatus;

class PredicateTaskNotComplete implements Predicate<Task>
{
    @Override
    public boolean test(Task t)
    {
        boolean ret = t.getTaskStatus() != TaskStatus.COMPLETE;
        
        System.out.println("Is task '" + t.getTaskName() + "' not complete? Result: "
				+ ret);
        
        return ret;
    }

}
