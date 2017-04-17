package eu.balev.guice.bindings.jit;

import com.google.inject.ImplementedBy;

import eu.balev.guice.common.TaskProcessor;

//jit bindings - specifying the default implementation
@ImplementedBy(EnhancedTaskProcessorImpl.class)
interface EnhancedTaskProcessor extends TaskProcessor
{

}
