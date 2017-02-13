package test.spring.boot.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import project.rest.api.demo.config.ConfigUtil;
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
public class PropertTests {

	@Value("${str.name}")
	private String myname;

	private Logger logger = LoggerFactory.getLogger(PropertTests.class);

	@Test
	public void getConfigValue() throws Exception {
		logger.info(myname + "haahahahahaha");
		logger.info(ConfigUtil.strname + "--------------");
	}

}
