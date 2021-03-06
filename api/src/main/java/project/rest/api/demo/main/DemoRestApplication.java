package project.rest.api.demo.main;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("project.rest.api")
@EnableAutoConfiguration(exclude=HibernateJpaAutoConfiguration.class)
public class DemoRestApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(DemoRestApplication.class);

	@Autowired
	DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(DemoRestApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		// 应用起来后,先尝试关闭db连接,避免一些冷门应用,无人访问占用连接资源，同时也测试db连接关闭是否正常
		try {
			dataSource.getConnection().close();
			logger.info("数据库可正常访问,已关闭,同时避免冷门应用占用连接资源。");
		} catch (Exception e) {
			logger.error("db连接关闭失败:", e);
		}
	}
}