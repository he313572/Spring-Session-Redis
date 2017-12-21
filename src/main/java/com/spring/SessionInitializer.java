package com.spring;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;
//该类不需要重载或实现任何方法，它的作用是在Servlet容器初始化时，从Spring容器中获取一个默认名叫sessionRepositoryFilter的过滤器类
public class SessionInitializer extends AbstractHttpSessionApplicationInitializer {

	public SessionInitializer(Class<?>... configurationClasses) {
		super(configurationClasses);
		// TODO Auto-generated constructor stub
	}
	
}
