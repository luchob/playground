package eu.balev.guice.bindings.membersinjector;

import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.MembersInjector;

import eu.balev.guice.common.TaskBuilder;
import eu.balev.guice.common.Task.TaskStatus;

class MembersBindingsDemo
{
    @Inject
    private MembersInjector<DelegatingTaskProcessor> injector;
    
    public void testGuice()
    {
        DelegatingTaskProcessor processor = new DelegatingTaskProcessor();
        
        injector.injectMembers(processor);
        
        processor.processTask(TaskBuilder.build(b -> b.buildName("Name").buildTaskStatus(TaskStatus.COMPLETE)));
    }
    
    public static void main(String []args)
    {
        MembersBindingsDemo demo = new MembersBindingsDemo();
        
        MembersBindingModule module = new MembersBindingModule();
        
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(demo);//injects the implementation of the service
        
        demo.testGuice();
    }
}
