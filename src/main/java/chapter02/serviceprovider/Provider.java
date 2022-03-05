package chapter02.serviceprovider;

import chapter02.service.HelloService;

/**
 * Will provide the service
 * @author gpandey26
 *
 */
public interface Provider {
     HelloService newService();
}
