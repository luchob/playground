package eu.balev.guice.bindings.provider;

import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;

import eu.balev.guice.common.TaskBuilder;
import eu.balev.guice.common.TaskProcessor;
import eu.balev.guice.common.Task.TaskStatus;

class ProviderBindingsDemo {
	@Inject
	private TaskProcessor taskProcessor;

	public void testGuice() {
		taskProcessor.processTask(TaskBuilder.build(b -> b.buildName("Name")
				.buildTaskStatus(TaskStatus.COMPLETE)));
	}

	public static void main(String[] args) {
		ProviderBindingsDemo demo = new ProviderBindingsDemo();

		ProviderBindingModule module = new ProviderBindingModule();

		Injector injector = Guice.createInjector(module);
		injector.injectMembers(demo);// injects the implementation of the
										// service

		demo.testGuice();
	}
}
