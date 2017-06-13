package eu.balev.guice.custominjection;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import com.google.inject.TypeLiteral;
import com.google.inject.spi.TypeEncounter;
import com.google.inject.spi.TypeListener;

public class SingleStringTypeListener implements TypeListener {

	public <T> void hear(TypeLiteral<T> typeLiteral,
			TypeEncounter<T> typeEncounter) {

		Class<?> clazz = typeLiteral.getRawType();
		while (clazz != null) {
			for (Field field : clazz.getDeclaredFields()) {
				if (field.isAnnotationPresent(SingleString.class)) {
					
					if (field.getType() != List.class)
					{
						badUsage();
					}
					
					Type type = field.getGenericType();
					if (type instanceof ParameterizedType) {
						ParameterizedType pType = (ParameterizedType) type;
						
						Type t = pType.getActualTypeArguments()[0];
						if (!t.equals(String.class))
						{
							badUsage();
						}
						
						typeEncounter.register(new SingleStringMembersInjector<T>(
								field));
					} else {
						badUsage();
					}
				}
			}
			clazz = clazz.getSuperclass();
		}
	}
	
	private void badUsage()
	{
		throw new RuntimeException("@SingleString can be used only on Lists of String!");
	}
}
