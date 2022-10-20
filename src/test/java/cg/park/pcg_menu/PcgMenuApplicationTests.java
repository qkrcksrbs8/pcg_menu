package cg.park.pcg_menu;

import cg.park.pcg_menu.api.services.AmericanoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class PcgMenuApplicationTests {

	@Autowired
	StringRedisTemplate redisTemplate;

	@Autowired
	AmericanoService americanoService;

	@Test
	void contextLoads() {

		String key = "signature";
		final ValueOperations<String, String> redis = redisTemplate.opsForValue();
		redis.set(key, String.valueOf(americanoService.list()));
		String s = redis.get(key);

		System.out.println(s);

	}

}
