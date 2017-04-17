package eu.balev.guice.extensions.multibind;

import java.util.Set;
import java.util.function.Predicate;

import javax.inject.Inject;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.TaskProcessor;

class FilteringTaskProcessor implements TaskProcessor
{
    private final Predicate<Task> taskPredicate;
    
    @Inject
    public FilteringTaskProcessor(Set<Predicate<Task>> taskPredicates)
    {
        this.taskPredicate = taskPredicates.
                        stream().
                        reduce((p1, p2) -> p1.and(p2)).
                        orElse(t -> false);
                        
                      
    }
    
    
    @Override
    public void processTask(Task task)
    {
        if (taskPredicate.test(task))
        {
            System.out.println("Filtering task stream task ACCEPTED: " + task);
        }
        else
        {
            System.out.println("Filtering task stream task DECLINED: " + task);
        }
    }

}
