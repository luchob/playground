package eu.balev.guice.custominjection;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

class CustomInjectionBindingModule extends AbstractModule {
	@Override
	protected void configure() {
		bindListener(Matchers.any(), new SingleStringTypeListener());
	}
}