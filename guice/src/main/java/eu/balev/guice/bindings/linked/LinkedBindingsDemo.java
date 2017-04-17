package eu.balev.guice.bindings.linked;

import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;

import eu.balev.guice.common.TaskBuilder;
import eu.balev.guice.common.TaskProcessor;
import eu.balev.guice.common.Task.TaskStatus;

class LinkedBindingsDemo
{
    @Inject
    private TaskProcessor taskProcessor;
    
    public void testGuice()
    {
        taskProcessor.processTask(TaskBuilder.build(b -> b.buildName("Name").buildTaskStatus(TaskStatus.COMPLETE)));
    }
    
    public static void main(String []args)
    {
        LinkedBindingsDemo demo = new LinkedBindingsDemo();
        
        LinkedBindingModule module = new LinkedBindingModule();
        
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(demo);//injects the implementation of the service
        
        demo.testGuice();
    }
}
