package demo.service;

import java.net.URI;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuotesService {

	@Autowired
	private DiscoveryClient discoveryClient;

	public String getQuote() {
		List<ServiceInstance> randomServiceInstances = discoveryClient.getInstances("RANDOM");
		for (ServiceInstance randomServiceInstance : randomServiceInstances) {
			URI uri = randomServiceInstance.getUri();
			Integer integer = new RestTemplate().getForObject(uri.toString() + "/random", Integer.class);
			if (integer % 2 == 0) {
				return "Even: " + integer;
			} else {
				return "Odd: " + integer;
			}
		}
		return "None";
	}
}
