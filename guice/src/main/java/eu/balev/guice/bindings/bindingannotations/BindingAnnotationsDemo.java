package eu.balev.guice.bindings.bindingannotations;

import javax.inject.Inject;
import javax.inject.Named;

import com.google.inject.Guice;
import com.google.inject.Injector;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.TaskBuilder;
import eu.balev.guice.common.TaskProcessor;
import eu.balev.guice.common.Task.TaskStatus;

class BindingAnnotationsDemo
{
    @Inject
    private TaskProcessor taskProcessor;
    
    @HiTech
    @Inject
    private TaskProcessor copTLTaskProcessor;
    
    @Inject 
    @Named("General")
    private TaskProcessor taskForceProcessor;
    
    public void testGuice()
    {
        Task task = TaskBuilder.build(b -> b.buildName("Name").buildTaskStatus(TaskStatus.IN_PROGRESS));
        
        taskProcessor.processTask(task);
        copTLTaskProcessor.processTask(task);
        taskForceProcessor.processTask(task);
    }
    
    public static void main(String[] args)
    {
        BindingAnnotationsDemo demo = new BindingAnnotationsDemo();
        
        BindingAnnotationsModule module = new BindingAnnotationsModule();
        
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(demo);//injects the implementation of the service
        
        demo.testGuice();
    }
}
