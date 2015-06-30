package demo.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class RandomNumberService {

	public int getRandomNumber() {
		return new Random().nextInt(100);
	}
}
