package eu.balev.guice.extensions.multibind;

import java.util.function.Predicate;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.multibindings.Multibinder;

import eu.balev.guice.common.Task;
import eu.balev.guice.common.TaskProcessor;

class MultiBindingModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        Multibinder<Predicate<Task>> predicateBinder = Multibinder.newSetBinder(binder(), new TypeLiteral<Predicate<Task>>(){});
        
        predicateBinder.addBinding().to(PredicateTaskNotComplete.class);
        predicateBinder.addBinding().to(PredicateTaskNotInProgress.class);
        predicateBinder.addBinding().to(PredicateTaskGoogle.class);
        
        bind(TaskProcessor.class).to(FilteringTaskProcessor.class);
    }
}