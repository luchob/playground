package eu.balev.guice.bindings.jit;

import com.google.inject.ProvidedBy;

import eu.balev.guice.common.TaskProcessor;

//jit bindings - specifying provider
@ProvidedBy(SimpleTaskProcessorProvider.class)
public interface SimpleTaskProcessor extends TaskProcessor
{

}
