package demo.service;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RandomNumberService {

	private static final Logger LOGGER = LoggerFactory.getLogger(RandomNumberService.class);

	public int getRandomNumber() {
		LOGGER.info("Random number requested");
		return new Random().nextInt(100);
	}
}
