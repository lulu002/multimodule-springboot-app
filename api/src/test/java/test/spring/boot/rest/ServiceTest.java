package test.spring.boot.rest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import project.common.model.DataResult;
import project.rest.api.demo.domain.UserData;
import project.rest.api.demo.main.DemoRestApplication;
import project.rest.api.demo.service.UserService;

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
public class ServiceTest {
	
	private Logger logger = LoggerFactory.getLogger(ServiceTest.class);

	@Autowired
	private UserService userService;

	@Test
	public void fun1() throws Exception {
		DataResult<List<UserData>> result= userService.getAllUser();
		System.out.println("打印出来1："+result.getErrorCode());
		//JSONUtils.toJSONString(result);o
		
		logger.info("打印出来："+result.getErrorCode());
		logger.info("打印出来："+result.getErrorCode());
	}
}
