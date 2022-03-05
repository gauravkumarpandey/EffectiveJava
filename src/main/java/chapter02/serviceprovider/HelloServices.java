package chapter02.serviceprovider;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import chapter02.service.HelloService;

public class HelloServices {
   private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();
   public static final String DEFAULT_PROVIDER_NAME = "<def>";
   
   private HelloServices() {}
   
   //Provider registration
   public static void registerProvider(String name, Provider provider){
	   providers.put(name, provider);
	}
   
   //Service access
   public static HelloService newInstance(String name) {
	    return Optional.ofNullable(providers.get(name))
	            .map(p -> p.newService())
	            .orElseThrow(() -> new IllegalArgumentException(
	            		String.format("No provider registered with given name", name)));
   }
  
}
