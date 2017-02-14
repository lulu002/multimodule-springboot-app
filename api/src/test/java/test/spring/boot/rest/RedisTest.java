package test.spring.boot.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import project.rest.api.demo.main.DemoRestApplication;

/**
 * test
 *
 * @since: 15/11/21.
 * @author: yangjunming
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DemoRestApplication.class)
@WebIntegrationTest(randomPort = false)
@DirtiesContext
public class RedisTest {
	
	private Logger logger = LoggerFactory.getLogger(RedisTest.class);

	@Autowired
	private StringRedisTemplate template;

	@Test
	public void setRedis() throws Exception {
		final ValueOperations<String, String> operations = template.opsForValue();
		if (!template.hasKey("springrootTest")) {
			operations.set("springrootTest", "springrootTest11");
		}
	}
}
