package eu.balev.guice.extensions.multibind;

import java.util.function.Predicate;

import eu.balev.guice.common.Task;

class PredicateTaskGoogle implements Predicate<Task> {
	@Override
	public boolean test(Task t) {
		
		boolean ret = t.getTaskName() != null
				&& t.getTaskName().toLowerCase().contains("google");

		System.out.println("Is task '" + t.getTaskName() + "' google? Result: "
				+ ret);

		return ret;
	}

}
