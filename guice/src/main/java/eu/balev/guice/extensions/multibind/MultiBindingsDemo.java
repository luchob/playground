package eu.balev.guice.extensions.multibind;

import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;

import eu.balev.guice.common.TaskBuilder;
import eu.balev.guice.common.TaskProcessor;
import eu.balev.guice.common.Task.TaskStatus;

class MultiBindingsDemo
{
    @Inject
    private TaskProcessor taskProcessor;
    
    public void testGuice()
    {
    	
        taskProcessor.processTask(TaskBuilder.build(b -> b.buildName("Do something").buildTaskStatus(TaskStatus.COMPLETE)));
        System.out.println();
        
        taskProcessor.processTask(TaskBuilder.build(b -> b.buildName("Do something else").buildTaskStatus(TaskStatus.IN_PROGRESS)));
        System.out.println();
        
        taskProcessor.processTask(TaskBuilder.build(b -> b.buildName("Newwww").buildTaskStatus(TaskStatus.NEW)));
        System.out.println();
        
        taskProcessor.processTask(TaskBuilder.build(b -> b.buildName("Search google!").buildTaskStatus(TaskStatus.NEW)));
        
    }
    
    public static void main(String []args)
    {
        MultiBindingsDemo demo = new MultiBindingsDemo();
        
        MultiBindingModule module = new MultiBindingModule();
        
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(demo);//injects the implementation of the service
        
        demo.testGuice();
    }
}
