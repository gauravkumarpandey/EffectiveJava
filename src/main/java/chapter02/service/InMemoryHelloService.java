package chapter02.service;

public class InMemoryHelloService implements HelloService{

	@Override
	public String sayHello() {
		return "Hello from In Memory";
	}

}
