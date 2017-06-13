package eu.balev.guice.custominjection;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

import com.google.inject.MembersInjector;

public class SingleStringMembersInjector<T> implements MembersInjector<T> {

	private final Field field;

    SingleStringMembersInjector(Field field) {
      this.field = field;
      field.setAccessible(true);
    }

    public void injectMembers(T t) {
      try {
    	  SingleString singleString = field.getAnnotation(SingleString.class);
    	  
    	  List<String> values = new LinkedList<>(); 
    	  values.add(singleString.value());
    	  
    	  field.set(t, values);
      } catch (IllegalAccessException e) {
        throw new RuntimeException(e);
      }
    }
  }