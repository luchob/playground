package eu.balev.guice.bindings.provides;

import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;

import eu.balev.guice.common.TaskBuilder;
import eu.balev.guice.common.TaskProcessor;
import eu.balev.guice.common.Task.TaskStatus;

class ProvidesBindingsDemo
{
    @Inject
    private TaskProcessor taskProcessor;
    
    public void testGuice()
    {
        taskProcessor.processTask(TaskBuilder.build(b -> b.buildName("Name").buildTaskStatus(TaskStatus.COMPLETE)));
    }
    
    public static void main(String []args)
    {
        ProvidesBindingsDemo demo = new ProvidesBindingsDemo();
        
        ProvidesBindingModule module = new ProvidesBindingModule();
        
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(demo);//injects the implementation of the service
        
        demo.testGuice();
    }
}
