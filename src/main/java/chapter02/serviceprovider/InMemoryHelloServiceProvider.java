package chapter02.serviceprovider;

import chapter02.service.HelloService;
import chapter02.service.InMemoryHelloService;

public class InMemoryHelloServiceProvider implements Provider {

	@Override
	public HelloService newService() {
		return new InMemoryHelloService();
	}

}
