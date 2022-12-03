package com.mybatisSample.app;

import com.mybatisSample.student.dao.StudentDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisSampleApplicationTests {

	@Autowired
	StudentDao studentDao;

	@Test
	void contextLoads() {
		int a = 0;
	}

}
