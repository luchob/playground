package eu.balev.guice.bindings.instance;

import javax.inject.Inject;
import javax.inject.Named;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.TaskProcessor;

class ReoccuringTaskProcessor implements TaskProcessor
{
    @Inject 
    @Named("reoccur")
    private Integer repeatTimes;
    
    @Override
    public void processTask(Task task)
    {
        for (int i = 0; i < repeatTimes; i++)
        {            
            System.out.println("Reoccuring Processor, repeat " + i + ": " + task);
        }
    }

}
