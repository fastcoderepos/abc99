package com.fastcode.abc99.restcontrollers.extended;

import com.fastcode.abc99.restcontrollers.core.FilmControllerTest;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
				properties = "spring.profiles.active=test")
public class FilmControllerTestExtended extends FilmControllerTest {
	
	//Add your custom code here	
}
