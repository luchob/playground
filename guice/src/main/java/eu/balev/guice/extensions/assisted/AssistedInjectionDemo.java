package eu.balev.guice.extensions.assisted;

import java.util.concurrent.atomic.AtomicInteger;

import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.TaskBuilder;
import eu.balev.guice.common.TaskProcessor;
import eu.balev.guice.common.Task.TaskStatus;

class AssistedInjectionDemo
{
    @Inject
    private TaskSequenceProcessorFactory taskProcessorFactory;
    
    
    public void testGuice()
    {
        Task task = TaskBuilder.build(b -> b.buildName("Name").buildTaskStatus(TaskStatus.IN_PROGRESS));
        
        TaskProcessor taskProcessor = taskProcessorFactory.create(new AtomicInteger(42));
        
        taskProcessor.processTask(task);
        taskProcessor.processTask(task);
    }
    
    public static void main(String[] args)
    {
        AssistedInjectionDemo demo = new AssistedInjectionDemo();
        
        AssistedInjectionModule module = new AssistedInjectionModule();
        
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(demo);//injects the implementation of the service
        
        demo.testGuice();
    }
}
