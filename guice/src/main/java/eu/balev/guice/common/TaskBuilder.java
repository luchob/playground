package eu.balev.guice.common;

import java.util.function.Consumer;

import eu.balev.guice.common.Task.TaskStatus;

/**
 * A builder for tasks. The builder can't be instantiated. It can be 'loaned'
 * via some of the static methods.
 */
public class TaskBuilder {
	private Task task;

	private TaskBuilder() {
		this.task = new Task();
	}

	public TaskBuilder buildName(String name) {
		task.setTaskName(name);
		return this;
	}

	public TaskBuilder buildTaskStatus(TaskStatus status) {
		task.setTaskStatus(status);
		return this;
	}

	private Task build() {
		return task;
	}

	public static Task build(final Consumer<TaskBuilder> block) {
		TaskBuilder taskBuilder = new TaskBuilder();

		block.accept(taskBuilder);

		return taskBuilder.build();
	}
}
