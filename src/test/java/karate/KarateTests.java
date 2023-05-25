package karate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;

import app.eugenio.karatethreaddemo.KaratethreaddemoApplication;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, classes = KaratethreaddemoApplication.class)
public class KarateTests
{
	@Test
	void dummyTest()
	{
		Results results = Runner.path("classpath:karate/dummy.feature").parallel(1);
		Assertions.assertEquals(0, results.getFailCount(), results.getErrorMessages());
	}
}
