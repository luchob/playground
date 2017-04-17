package eu.balev.guice.bindings.untargeted;

import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;

import eu.balev.guice.common.TaskBuilder;
import eu.balev.guice.common.Task.TaskStatus;

class UntargetedBindingsDemo
{
    @Inject
    private UntargetedTaskProcessor taskProcessor;
    
    public void testGuice()
    {
        taskProcessor.processTask(TaskBuilder.build(b -> b.buildName("Name").buildTaskStatus(TaskStatus.COMPLETE)));
    }
    
    public static void main(String []args)
    {
        UntargetedBindingsDemo demo = new UntargetedBindingsDemo();
        
        UntargetedBindingModule module = new UntargetedBindingModule();
        
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(demo);//injects the implementation of the service
        
        demo.testGuice();
    }
}
