package service;

import static chapter02.serviceprovider.HelloServices.DEFAULT_PROVIDER_NAME;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import chapter02.service.HelloService;
import chapter02.serviceprovider.HelloServices;
import chapter02.serviceprovider.InMemoryHelloServiceProvider;

public class ServiceProviderTest {

	private HelloService helloService;
	
	@Test
	public void getProviderForGivenName() {
		  HelloServices.registerProvider(DEFAULT_PROVIDER_NAME, new InMemoryHelloServiceProvider());
		  helloService = HelloServices.newInstance(DEFAULT_PROVIDER_NAME);
		  assertNotNull(helloService);
		  assertEquals(true,helloService.sayHello().contains("In Memory"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getProviderNotFoundForGivenName() {
		  helloService = HelloServices.newInstance("Not defined");
		 
	}
	

}
