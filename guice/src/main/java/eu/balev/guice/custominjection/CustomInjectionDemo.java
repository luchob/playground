package eu.balev.guice.custominjection;

import java.util.LinkedList;
import java.util.List;

import com.google.inject.Guice;
import com.google.inject.Injector;

class CustomInjectionDemo {
	
	@SingleString(value="Hello")
	private List<String> list1;
	
	@SingleString(value="world!")
	private List<String> list2;
	
	public void testGuice() {
		
		List<String> combined = new LinkedList<>();
		
		combined.addAll(list1);
		combined.addAll(list2);
		
		System.out.println(combined);
	}

	public static void main(String[] args) {
		CustomInjectionDemo demo = new CustomInjectionDemo();

		CustomInjectionBindingModule module = new CustomInjectionBindingModule();

		Injector injector = Guice.createInjector(module);
		injector.injectMembers(demo);//injects the lists

		demo.testGuice();
	}
}
