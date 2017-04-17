package eu.balev.guice.bindings.cycles;

import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;

class CyclesBindingsDemo
{
    @Inject
    private Child child;
    
    @Inject
    private Mother mother;
    
    public void testGuice()
    {
        child.saySomething();
        String advice = mother.giveAdvice();
        
        System.out.println(advice);
    }
    
    public static void main(String []args)
    {
        CyclesBindingsDemo demo = new CyclesBindingsDemo();
        
        CyclesBindingModule module = new CyclesBindingModule();
        
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(demo);//injects the implementation of the service
        
        demo.testGuice();
    }
}
