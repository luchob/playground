package eu.balev.guice.bindings.jit;

import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.TaskBuilder;
import eu.balev.guice.common.Task.TaskStatus;

class JITBindingsDemo
{
    @Inject
    private EnhancedTaskProcessor enhancedTaskProcessor;
    
    @Inject 
    private SimpleTaskProcessor simpleTaskProcessor;
    
    public void testGuice()
    {
    	Task t = TaskBuilder.build(b -> b.buildName("Name").buildTaskStatus(TaskStatus.COMPLETE));
        
    	enhancedTaskProcessor.processTask(t);
        simpleTaskProcessor.processTask(t);
    }
    public static void main(String[] args)
    {
        JITBindingsDemo demo = new JITBindingsDemo();
        
        //note - there is no module - just JIT bindings
        Injector injector = Guice.createInjector();
        injector.injectMembers(demo);//injects the implementation of the service
        
        demo.testGuice();
    }

}
