package com.java.designpatterns.builder.nested;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class NestedBuilder<T, V> {

	protected T parent;

	public abstract V build();

	/**
	 * To get the parent builder
	 *
	 * @return T the instance of the parent builder
	 */
	public T done() {
		Class<?> parentClass = parent.getClass();
		try {
			V build = this.build();
			String methodName = "with" + build.getClass().getSimpleName();
			Method method = parentClass.getDeclaredMethod(methodName , build.getClass());
			method.invoke(parent, build);
		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return parent;
	}

	/**
	 *
	 * @param parent
	 * @param <P>
	 * @return
	 */
	public <P extends NestedBuilder<T, V>> P withParentBuilder(T parent) {
		this.parent = parent;
		return (P) this;
	}
}